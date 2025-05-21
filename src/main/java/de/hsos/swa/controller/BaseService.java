package de.hsos.swa.controller;

import java.util.List;

import de.hsos.swa.entity.Base;
import de.hsos.swa.entity.BaseCatalog;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class BaseService implements BaseController{

    @Inject
    BaseCatalog baseCatalog;

    @Override
    public Base getBase(long id) {
        return baseCatalog.getBase(id);
    }

    @Override
    public List<Base> getAllBases() {
        return baseCatalog.getAllBases();
    }

    @Override
    public Base createBase(Base base) {
        return baseCatalog.createBase(base);
    }

    @Override
    public Base updateBase(long id, Base base) {
        return baseCatalog.updateBase(id, base);
    }

    @Override
    public Base deleteBase(Base base) {
        return baseCatalog.deleteBase(base);
    }

}
