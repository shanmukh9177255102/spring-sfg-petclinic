package com.springpetclinic.petclinic.sfgpetclinic.bootstrap;

import org.springframewor.sfpetclinicdata.model.Owner;
import org.springframewor.sfpetclinicdata.model.Vet;
import org.springframewor.sfpetclinicdata.services.OwnersService;
import org.springframewor.sfpetclinicdata.services.VetService;
import org.springframewor.sfpetclinicdata.services.map.OwneerServiceMap;
import org.springframewor.sfpetclinicdata.services.map.VetServiceMap;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnersService ownersService;
    private final VetService vetService;


    public DataLoader() {
        this.ownersService = new OwneerServiceMap();
        this.vetService = new VetServiceMap();
    }


    @Override
    public void run(String... args) throws Exception {

        Owner owner1 = new Owner();
        owner1.setId(1L);
        owner1.setFirstName("Mull");
        owner1.setLastName("shan");


        Owner owner2 = new Owner();
        owner2.setId(2L);
        owner2.setFirstName("Mull");
        owner2.setLastName("vamsi");

        ownersService.save(owner1);
        ownersService.save(owner2);
        System.out.println("loaded owners...");

        Vet vet1 = new Vet();
        vet1.setId(11L);
        vet1.setFirstName("sam");
        vet1.setLastName("fox");


        Vet vet2 = new Vet();
        vet2.setId(12L);
        vet2.setFirstName("pem");
        vet2.setLastName("dox");

        vetService.save(vet1);
        vetService.save(vet2);
        System.out.println("loaded vets...");


    }
}
