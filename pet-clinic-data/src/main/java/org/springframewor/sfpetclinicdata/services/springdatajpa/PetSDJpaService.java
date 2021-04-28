package org.springframewor.sfpetclinicdata.services.springdatajpa;

import lombok.RequiredArgsConstructor;
import org.springframewor.sfpetclinicdata.model.Pet;
import org.springframewor.sfpetclinicdata.respository.PetRepository;
import org.springframewor.sfpetclinicdata.services.PetService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@RequiredArgsConstructor
@Service
@Profile("springdatajpa")
public class PetSDJpaService implements PetService {
    private final PetRepository petRepository;

    @Override
    public Set<Pet> findAll() {
        Set<Pet> pets = new HashSet<>();
        petRepository.findAll().forEach(pets::add);
        return pets;
    }

    @Override
    public Pet findById(Long aLong) {
        return petRepository.findById(aLong).orElse(null);
    }

    @Override
    public Pet save(Pet object) {
        return petRepository.save(object);
    }

    @Override
    public void delete(Pet object) {
        petRepository.delete(object);

    }

    @Override
    public void deleteById(Long aLong) {
     petRepository.deleteById(aLong);
    }
}
