package org.springframewor.sfpetclinicdata.services.map;

import org.springframewor.sfpetclinicdata.model.Owner;
import org.springframewor.sfpetclinicdata.services.CrudService;

import java.util.Set;

public class OwneerServiceMap extends AbstractMapService<Owner,Long> implements CrudService<Owner,Long> {

    @Override
    public Set<Owner> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
       super.deleteById(id);
    }

    @Override
    public void delete(Owner object) {
      super.delete(object);
    }

    @Override
    public Owner save(Owner object) {
        return super.save(object.getId(), object);
    }

    @Override
    public Owner findById(Long id) {
        return null;
    }
}
