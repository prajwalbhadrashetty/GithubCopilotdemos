package org.springframework.samples.petclinic.service;

/* interface PetTreatmentService with abstract methods for CRUD operations */
import java.util.List;
import java.util.concurrent.CompletableFuture;

import org.springframework.samples.petclinic.dto.PetTreatmentDto;
import org.springframework.samples.petclinic.model.PetTreatment;

public interface PetTreatmentService {
    PetTreatment savePetTreatment(PetTreatment petTreatment);

    PetTreatmentDto findPetTreatmentById(int id);

    List<PetTreatmentDto> findAllPetTreatments();

    void deletePetTreatmentById(int id);

    //void deletePetTreatment(PetTreatment petTreatment);

   // PetTreatment updatePetTreatment(PetTreatment petTreatment);

    CompletableFuture<List<PetTreatment>> findAllAsync();

}
