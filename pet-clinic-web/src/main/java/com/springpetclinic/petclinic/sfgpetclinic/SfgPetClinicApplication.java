package com.springpetclinic.petclinic.sfgpetclinic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan({"org.springframewor.sfpetclinicdata","com.springpetclinic.petclinic.sfgpetclinic"})
@SpringBootApplication
public class SfgPetClinicApplication {

	public static void main(String[] args) {

		SpringApplication.run(SfgPetClinicApplication.class, args);
	}

}
