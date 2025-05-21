package de.hsos.swa.boundary.Ressources;

import org.jboss.resteasy.reactive.RestResponse;

import de.hsos.swa.boundary.DTO.BaseDTO;
import de.hsos.swa.controller.BaseController;
import de.hsos.swa.entity.Base;
import jakarta.decorator.Delegate;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.DELETE;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.PUT;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/base/{id}")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
@Transactional
@ApplicationScoped
public class BaseRessource {
    @Inject
    BaseController baseController;

    @GET
    public RestResponse<Base> getBase(@PathParam("id") long id){

        //baseController.getBase(id);

        return RestResponse.ok(baseController.getBase(id));

    }

    @PUT
    public RestResponse<Base> updateBase(@PathParam("id") long id, BaseDTO baseDTO){

        Base base = new Base();
        base.setCrewMates(baseDTO.crewMates); 
        base.setLeader(baseDTO.leader);
        base.setLocation(baseDTO.location);
        base.setName(baseDTO.name);
        base.setType(baseDTO.type);

        return RestResponse.ok(baseController.updateBase(id, base));

    }


    @DELETE
    public RestResponse<Base> deletebase(@PathParam("id") long id){
        Base base = baseController.getBase(id);
        return RestResponse.ok(baseController.deleteBase(base));

    }


}
