package org.springframewor.sfpetclinicdata.respository;

import org.springframewor.sfpetclinicdata.model.PetType;
import org.springframework.data.repository.CrudRepository;

public interface PetTypeRepository extends CrudRepository<PetType,Long> {
}
