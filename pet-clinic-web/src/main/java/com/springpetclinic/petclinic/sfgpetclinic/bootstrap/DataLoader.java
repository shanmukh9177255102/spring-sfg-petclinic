package com.springpetclinic.petclinic.sfgpetclinic.bootstrap;

import org.springframewor.sfpetclinicdata.model.*;
import org.springframewor.sfpetclinicdata.services.OwnersService;
import org.springframewor.sfpetclinicdata.services.PetTypeService;
import org.springframewor.sfpetclinicdata.services.SpecialityService;
import org.springframewor.sfpetclinicdata.services.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnersService ownersService;
    private final VetService vetService;
    private final PetTypeService petTypeService;
    private final SpecialityService specialityService;

    public DataLoader(OwnersService ownersService, VetService vetService, PetTypeService petTypeService, SpecialityService specialityService) {
        this.ownersService=ownersService;
        this.vetService=vetService;
        this.petTypeService = petTypeService;
        this.specialityService = specialityService;
    }


    @Override
    public void run(String... args) throws Exception {

        Speciality s1 = new Speciality();
        s1.setDescription("radiology");
        Speciality splRadio = specialityService.save(s1);

        Speciality s2 = new Speciality();
        s1.setDescription("surgery");
        Speciality splSurgery = specialityService.save(s1);

        Speciality s3 = new Speciality();
        s1.setDescription("dentistry");
        Speciality splDentist = specialityService.save(s1);

        PetType dog = new PetType();
        dog.setName("dog");
        PetType savedDogType = petTypeService.save(dog);

        PetType cat = new PetType();
        dog.setName("cat");
        PetType savedCatType = petTypeService.save(dog);

        Pet shannuDog = new Pet();
        shannuDog.setPetType(dog);
        shannuDog.setBirthDate(LocalDate.now());
        shannuDog.setName("Dog");

        Pet shannuCat = new Pet();
        shannuDog.setPetType(cat);
        shannuDog.setBirthDate(LocalDate.now());
        shannuDog.setName("Cat");

        Owner owner1 = new Owner();
        owner1.setFirstName("Mull");
        owner1.setLastName("shan");
        owner1.setAddress("123 sandrez");
        owner1.setTelephone("99897323");
        owner1.setCity("London");
        owner1.getPets().add(shannuDog);


        Owner owner2 = new Owner();
        owner2.setFirstName("Mull");
        owner2.setLastName("vamsi");
        owner2.setAddress("123 sandrez");
        owner2.setTelephone("99897323");
        owner2.setCity("London");
        owner2.getPets().add(shannuCat);

        ownersService.save(owner1);
        ownersService.save(owner2);
        System.out.println("loaded owners...");

        Vet vet1 = new Vet();
        vet1.setFirstName("sam");
        vet1.setLastName("fox");
        vet1.getSpecialities().add(splRadio);


        Vet vet2 = new Vet();
        vet2.setFirstName("pem");
        vet2.setLastName("dox");
        vet2.getSpecialities().add(splDentist);
        vet2.getSpecialities().add(splSurgery);

        vetService.save(vet1);
        vetService.save(vet2);
        System.out.println("loaded vets...");


    }
}
