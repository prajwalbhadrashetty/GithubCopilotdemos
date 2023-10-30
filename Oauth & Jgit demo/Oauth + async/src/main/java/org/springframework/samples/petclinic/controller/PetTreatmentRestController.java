package org.springframework.samples.petclinic.controller;

/* Rest Controller for PetTreatment with a mapping of /pettreatment 
* with methods for CRUD operations
* inject PetTreatmentService use constructor injection
* use PetTreatmentDto to transfer data 
*/
import java.util.List;
import java.util.concurrent.CompletableFuture;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.samples.petclinic.dto.PetTreatmentDto;
import org.springframework.samples.petclinic.model.PetTreatment;
import org.springframework.samples.petclinic.service.PetTreatmentService;
import org.springframework.scheduling.annotation.Async;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/pettreatment")

public class PetTreatmentRestController {

    @Autowired
    private PetTreatmentService petTreatmentService;

    //Get mapping to return a completable future of PetTreatment with path and annotation as async use findAllAsync of service
    @GetMapping("/async")
    @Async
    public CompletableFuture<ResponseEntity<List<PetTreatment>>> findAllAsync() {
        return petTreatmentService.findAllAsync().thenApply(ResponseEntity::ok);
    } 


    @PostMapping("/save")
    public ResponseEntity<PetTreatment> savePetTreatment(@RequestBody PetTreatmentDto petTreatmentDto) {
        PetTreatment petTreatment = new PetTreatment();
        petTreatment.setId(petTreatmentDto.getId());
        petTreatment.setName(petTreatmentDto.getName());
        petTreatment.setTreatment_date(petTreatmentDto.getTreatment_date());
        petTreatment.setDescription(petTreatmentDto.getDescription());
        return new ResponseEntity<PetTreatment>(petTreatmentService.savePetTreatment(petTreatment), HttpStatus.OK);
    }

    @GetMapping("/find/{id}")
    public ResponseEntity<PetTreatmentDto> findPetTreatmentById(@PathVariable("id") int id) {
        PetTreatmentDto petTreatmentDto = petTreatmentService.findPetTreatmentById(id);
        return new ResponseEntity<PetTreatmentDto>(petTreatmentDto, HttpStatus.OK);
    }

    @GetMapping("/all")
    public ResponseEntity<List<PetTreatmentDto>> findAllPetTreatments() {
        List<PetTreatmentDto> petTreatmentDtos = petTreatmentService.findAllPetTreatments();
        return new ResponseEntity<List<PetTreatmentDto>>(petTreatmentDtos, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> deletePetTreatmentById(@PathVariable("id") int id) {
        petTreatmentService.deletePetTreatmentById(id);
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

}
