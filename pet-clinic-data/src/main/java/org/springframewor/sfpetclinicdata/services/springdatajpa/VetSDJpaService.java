package org.springframewor.sfpetclinicdata.services.springdatajpa;

import lombok.RequiredArgsConstructor;
import org.springframewor.sfpetclinicdata.model.Vet;
import org.springframewor.sfpetclinicdata.respository.VetRepository;
import org.springframewor.sfpetclinicdata.services.VetService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@RequiredArgsConstructor
@Service
@Profile("springdatajpa")
public class VetSDJpaService implements VetService {

    private final VetRepository vetRepository;


    @Override
    public Set<Vet> findAll() {
        Set<Vet> vets = new HashSet<>();
        vetRepository.findAll().forEach(vets::add);
        return vets;
    }

    @Override
    public Vet findById(Long aLong) {
        return vetRepository.findById(aLong).orElse(null);
    }

    @Override
    public Vet save(Vet object) {
        return vetRepository.save(object);
    }

    @Override
    public void delete(Vet object) {
      vetRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
      vetRepository.deleteById(aLong);
    }
}
