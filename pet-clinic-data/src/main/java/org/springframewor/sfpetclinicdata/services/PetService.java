package org.springframewor.sfpetclinicdata.services;

import org.springframewor.sfpetclinicdata.model.Owner;
import org.springframewor.sfpetclinicdata.model.Pet;

import java.util.Set;

public interface PetService {
    Pet findByLastName(String lastName);

    Pet findById(Long id);

    Pet save(Owner owner);

    Set<Pet> findAll();
}
