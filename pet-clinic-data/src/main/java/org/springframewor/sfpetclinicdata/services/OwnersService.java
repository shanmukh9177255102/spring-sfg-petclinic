package org.springframewor.sfpetclinicdata.services;

import org.springframewor.sfpetclinicdata.model.Owner;

import java.util.Set;

public interface OwnersService {

    Owner findByLastName(String lastName);

    Owner findById(Long id);

    Owner save(Owner owner);

    Set<Owner> findAll();

}
