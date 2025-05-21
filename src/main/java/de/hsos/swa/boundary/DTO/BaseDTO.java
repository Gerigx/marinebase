package de.hsos.swa.boundary.DTO;

import de.hsos.swa.entity.Base;
import de.hsos.swa.entity.Location;
import de.hsos.swa.entity.Type;

public class BaseDTO {
    public Long id;
    public String name;
    public Type type;
    public Location location;
    public String leader;
    public int crewMates;

    public static BaseDTO from(Base base) {
        BaseDTO baseDTO = new BaseDTO();
        baseDTO.id = base.getId();
        baseDTO.name = base.getName();
        baseDTO.type = base.getType();
        baseDTO.location = base.getLocation();
        baseDTO.leader = base.getLeader();
        baseDTO.crewMates = base.getCrewMates();
        return baseDTO;
    }

    


}
