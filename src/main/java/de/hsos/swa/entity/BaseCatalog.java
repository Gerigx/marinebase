package de.hsos.swa.entity;

import java.util.List;

public interface BaseCatalog {
    public Base getBase(long id);
    public List<Base> getAllBases();

    public Base createBase(Base base);

    public Base updateBase(long id, Base base);

    public Base deleteBase(Base base);

}
