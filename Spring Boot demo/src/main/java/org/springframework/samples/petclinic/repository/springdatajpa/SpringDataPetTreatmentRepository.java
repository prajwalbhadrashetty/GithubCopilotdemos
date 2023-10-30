package org.springframework.samples.petclinic.repository.springdatajpa;

//Repository interface for PetTreatment class with id of type Integer
//extends JPA repository for PetTreatment with id of type Integer 
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.samples.petclinic.model.PetTreatment;

public interface SpringDataPetTreatmentRepository extends JpaRepository<PetTreatment, Integer> {
    
}
