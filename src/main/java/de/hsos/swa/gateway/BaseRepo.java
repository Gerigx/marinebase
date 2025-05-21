package de.hsos.swa.gateway;

import java.util.List;

import de.hsos.swa.entity.Base;
import de.hsos.swa.entity.BaseCatalog;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.quarkus.hibernate.orm.rest.data.panache.PanacheEntityResource;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class BaseRepo implements PanacheRepository<Base>, BaseCatalog {

    @Override
    public Base getBase(long id) {
        return findById(id);
    }

    @Override
    public List<Base> getAllBases() {
        return listAll();
    }

    @Override
    public Base createBase(Base base) {
        this.persist(base);
        return base;
    }

    @Override
    public Base updateBase(long id, Base base) {
        Base oldBase = getBase(id);
        oldBase.setCrewMates(base.getCrewMates());
        oldBase.setLeader(base.getLeader());
        oldBase.setLocation(base.getLocation());
        oldBase.setName(base.getName());
        oldBase.setType(base.getType());
        this.persist(oldBase);

        return oldBase;
    }

    @Override
    public Base deleteBase(Base base) {
        this.delete(base);
        return base;
    }

}
