package org.springframewor.sfpetclinicdata.services;

import org.springframewor.sfpetclinicdata.model.Owner;

import java.util.Set;

public interface OwnersService extends CrudService<Owner,Long>{

    Owner findByLastName(String lastName);

}
