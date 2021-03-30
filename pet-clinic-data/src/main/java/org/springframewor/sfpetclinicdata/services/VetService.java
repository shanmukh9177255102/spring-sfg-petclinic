package org.springframewor.sfpetclinicdata.services;

import org.springframewor.sfpetclinicdata.model.Vet;

import java.util.Set;

public interface VetService {

    Vet findById(Long id);

    Vet save(Vet owner);

    Set<Vet> findAll();
}
