package org.springframewor.sfpetclinicdata.services.springdatajpa;

import lombok.RequiredArgsConstructor;
import org.springframewor.sfpetclinicdata.model.PetType;
import org.springframewor.sfpetclinicdata.respository.PetTypeRepository;
import org.springframewor.sfpetclinicdata.services.PetTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@RequiredArgsConstructor
@Service
@Profile("springdatajpa")
public class PetTypeSDJpaService implements PetTypeService {

    private final PetTypeRepository petTypeRepository;

    @Override
    public Set<PetType> findAll() {
        Set<PetType> petTypes = new HashSet<>();
        petTypeRepository.findAll().forEach(petTypes::add);
        return petTypes;
    }

    @Override
    public PetType findById(Long aLong) {
        return petTypeRepository.findById(aLong).orElse(null);
    }

    @Override
    public PetType save(PetType object) {
        return petTypeRepository.save(object);
    }

    @Override
    public void delete(PetType object) {
        petTypeRepository.delete(object);

    }

    @Override
    public void deleteById(Long aLong) {
       petTypeRepository.deleteById(aLong);
    }
}
