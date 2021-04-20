package org.springframewor.sfpetclinicdata.services.map;

import org.springframewor.sfpetclinicdata.model.Owner;
import org.springframewor.sfpetclinicdata.model.Pet;
import org.springframewor.sfpetclinicdata.services.CrudService;
import org.springframewor.sfpetclinicdata.services.OwnersService;
import org.springframewor.sfpetclinicdata.services.PetService;
import org.springframewor.sfpetclinicdata.services.PetTypeService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class OwneerServiceMap extends AbstractMapService<Owner,Long> implements OwnersService {

    private final PetTypeService petTypeService;
    private final PetService petService;

    public OwneerServiceMap(PetTypeService petTypeService, PetService petService) {
        this.petTypeService = petTypeService;
        this.petService = petService;
    }

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
        if (object != null) {
            if(object.getPets() != null){
                object.getPets().forEach(pet -> {
                    if (pet.getPetType() != null){
                        if(pet.getPetType().getId() == null){
                            pet.setPetType(petTypeService.save(pet.getPetType()));
                        }

                    }else {
                        throw new RuntimeException("PetType is required!..");
                    }
                    if(pet.getId() == null){
                        Pet pet1 = petService.save(pet);
                        pet.setId(pet1.getId());
                    }
                });
            }
            return super.save(object);
        } else {
            return null;
        }
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
