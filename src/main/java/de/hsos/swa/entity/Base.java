package de.hsos.swa.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Base")
public class Base {
    @Id
    @GeneratedValue
    private long id;
    private String name;
    private Type type;
    private Location location;
    private String leader;
    private int crewMates;


    


    public Base(String name, Type type, Location location, String leader, int crewMates) {
        this.name = name;
        this.type = type;
        this.location = location;
        this.leader = leader;
        this.crewMates = crewMates;
    }
    public Base() {
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Type getType() {
        return type;
    }
    public void setType(Type type) {
        this.type = type;
    }
    public Location getLocation() {
        return location;
    }
    public void setLocation(Location location) {
        this.location = location;
    }
    public String getLeader() {
        return leader;
    }
    public void setLeader(String leader) {
        this.leader = leader;
    }
    public int getCrewMates() {
        return crewMates;
    }
    public void setCrewMates(int crewMates) {
        this.crewMates = crewMates;
    }
    public long getId() {
        return id;
    }

    

}
