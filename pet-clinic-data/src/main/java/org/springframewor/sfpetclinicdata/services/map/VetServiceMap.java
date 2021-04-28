package org.springframewor.sfpetclinicdata.services.map;

import java.lang.Long;

import lombok.RequiredArgsConstructor;
import org.springframewor.sfpetclinicdata.model.Speciality;
import org.springframewor.sfpetclinicdata.model.Vet;
import org.springframewor.sfpetclinicdata.services.SpecialityService;
import org.springframewor.sfpetclinicdata.services.VetService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.Set;

@RequiredArgsConstructor
@Service
@Profile({"default","map"})
public class VetServiceMap extends AbstractMapService<Vet,Long> implements VetService {

    private final SpecialityService specialityService;

    @Override
    public Set<Vet> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Vet object) {
        super.delete(object);
    }

    @Override
    public Vet save(Vet object) {

        if (object != null) {
            if(object.getSpecialities().size() > 0){
                object.getSpecialities().forEach(speciality -> {
                    if (speciality.getId() == null) {
                        Speciality s = specialityService.save(speciality);
                        speciality.setId(s.getId());
                    }
                });
            }
            return super.save(object);
        } else {
            return null;
        }
    }

    @Override
    public Vet findById(Long id) {
        return super.findById(id);
    }
}

