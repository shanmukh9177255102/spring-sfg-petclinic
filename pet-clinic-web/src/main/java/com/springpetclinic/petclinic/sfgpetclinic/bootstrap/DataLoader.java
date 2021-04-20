package com.springpetclinic.petclinic.sfgpetclinic.bootstrap;

import org.springframewor.sfpetclinicdata.model.Owner;
import org.springframewor.sfpetclinicdata.model.Pet;
import org.springframewor.sfpetclinicdata.model.PetType;
import org.springframewor.sfpetclinicdata.model.Vet;
import org.springframewor.sfpetclinicdata.services.OwnersService;
import org.springframewor.sfpetclinicdata.services.PetTypeService;
import org.springframewor.sfpetclinicdata.services.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnersService ownersService;
    private final VetService vetService;
    private final PetTypeService petTypeService;

    public DataLoader(OwnersService ownersService, VetService vetService, PetTypeService petTypeService) {
        this.ownersService=ownersService;
        this.vetService=vetService;
        this.petTypeService = petTypeService;
    }


    @Override
    public void run(String... args) throws Exception {

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


        Vet vet2 = new Vet();
        vet2.setFirstName("pem");
        vet2.setLastName("dox");

        vetService.save(vet1);
        vetService.save(vet2);
        System.out.println("loaded vets...");


    }
}
