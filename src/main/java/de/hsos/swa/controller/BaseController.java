package de.hsos.swa.controller;

import java.util.List;

import de.hsos.swa.entity.Base;

public interface BaseController {
    public Base getBase(long id);
    public List<Base> getAllBases();

    public Base createBase(Base base);

    public Base updateBase(long id, Base base);

    public Base deleteBase(Base base);

}
