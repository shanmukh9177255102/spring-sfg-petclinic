package org.springframewor.sfpetclinicdata.services.springdatajpa;

import lombok.RequiredArgsConstructor;
import org.springframewor.sfpetclinicdata.model.Owner;
import org.springframewor.sfpetclinicdata.respository.OwnerRepository;
import org.springframewor.sfpetclinicdata.respository.PetRepository;
import org.springframewor.sfpetclinicdata.respository.PetTypeRepository;
import org.springframewor.sfpetclinicdata.services.OwnersService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

@RequiredArgsConstructor
@Service
@Profile("springdatajpa")
public class OwnerSDJpaService implements OwnersService {

    private final OwnerRepository ownerRepository;
    private final PetRepository petRepository;
    private final PetTypeRepository petTypeRepository;

    @Override
    public Set<Owner> findAll() {
        Set<Owner> owners = new HashSet<>();
        ownerRepository.findAll().forEach(owners::add);
        return owners;
    }

    @Override
    public Owner findById(Long aLong) {
        Optional<Owner> optionalOwner = ownerRepository.findById(aLong);
        return optionalOwner.orElse(null);
    }

    @Override
    public Owner save(Owner object) {
        return ownerRepository.save(object);
    }

    @Override
    public void delete(Owner object) {
       ownerRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        ownerRepository.deleteById(aLong);

    }

    @Override
    public Owner findByLastName(String lastName) {
        return ownerRepository.findByLastName(lastName);
    }
}
