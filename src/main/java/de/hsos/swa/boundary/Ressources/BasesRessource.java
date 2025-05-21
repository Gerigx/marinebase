package de.hsos.swa.boundary.Ressources;



import java.util.ArrayList;
import java.util.List;

import org.jboss.resteasy.reactive.RestResponse;

import de.hsos.swa.boundary.DTO.BaseDTO;
import de.hsos.swa.controller.BaseController;
import de.hsos.swa.entity.Base;
import jakarta.annotation.PostConstruct;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;

import jakarta.ws.rs.core.MediaType;

@Path("/bases")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
@Transactional
@ApplicationScoped
public class BasesRessource {

    @Inject
    BaseController baseController;

    @GET
    public RestResponse<List<BaseDTO>> getBases(){

        List<Base> bases = baseController.getAllBases();

        List<BaseDTO> basesreturn = new ArrayList<>();

        for (Base basess : bases) {
            basesreturn.add(BaseDTO.from(basess));
            
        }

        return RestResponse.ok(basesreturn);       
        
    }

    @POST
    public RestResponse<BaseDTO> addBase(BaseDTO baseDTO){

        Base base = new Base();
        base.setCrewMates(baseDTO.crewMates); 
        base.setLeader(baseDTO.leader);
        base.setLocation(baseDTO.location);
        base.setName(baseDTO.name);
        base.setType(baseDTO.type);

        baseController.createBase(base);

        return RestResponse.ok(baseDTO);

    }
    

}
