package org.springframewor.sfpetclinicdata.services.map;

import org.springframewor.sfpetclinicdata.model.Owner;
import org.springframewor.sfpetclinicdata.services.CrudService;
import org.springframewor.sfpetclinicdata.services.OwnersService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class OwneerServiceMap extends AbstractMapService<Owner,Long> implements OwnersService {

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

    @Override
    public Owner findByLastName(String lastName) {
        return null;
    }
}
