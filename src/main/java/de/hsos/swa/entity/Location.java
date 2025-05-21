package de.hsos.swa.entity;

import jakarta.persistence.Embeddable;

@Embeddable
public class Location {
    private String nameLoc;
    private String street;
    private String nr;
    private Sea sea;

}
