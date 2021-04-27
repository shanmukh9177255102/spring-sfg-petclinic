package org.springframewor.sfpetclinicdata.respository;

import org.springframewor.sfpetclinicdata.model.Pet;
import org.springframework.data.repository.CrudRepository;

public interface PetRepository extends CrudRepository<Pet,Long> {
}
