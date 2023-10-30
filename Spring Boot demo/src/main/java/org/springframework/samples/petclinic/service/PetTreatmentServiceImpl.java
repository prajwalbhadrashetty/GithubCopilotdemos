package org.springframework.samples.petclinic.service;

/* class implementing PetTreatmentService interface
* having a dependency of Springdatajpa.PetRepository
*/
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.samples.petclinic.dto.PetTreatmentDto;
import org.springframework.samples.petclinic.mapper.PetTreatmentMapper;
import org.springframework.samples.petclinic.model.PetTreatment;
import org.springframework.samples.petclinic.repository.springdatajpa.SpringDataPetTreatmentRepository;
import org.springframework.stereotype.Service;

@Service
public class PetTreatmentServiceImpl implements PetTreatmentService {

    @Autowired
    private SpringDataPetTreatmentRepository petTreatmentRepository;

    @Override
    public PetTreatment savePetTreatment(PetTreatment petTreatment) {
        return petTreatmentRepository.save(petTreatment);
    }

    @Override
    public PetTreatmentDto findPetTreatmentById(int id) {
        Optional<PetTreatment> petTreatment = petTreatmentRepository.findById(id);
        if (petTreatment.isPresent()) {
            return PetTreatmentMapper.INSTANCE.petTreatmentToPetTreatmentDto(petTreatment.get());
        } else {
            return null;
        }
    }

    @Override
    public List<PetTreatmentDto> findAllPetTreatments() {
        List<PetTreatment> petTreatments = petTreatmentRepository.findAll();
        List<PetTreatmentDto> petTreatmentDtos = new ArrayList<>();
        for (PetTreatment petTreatment : petTreatments) {
            petTreatmentDtos.add(PetTreatmentMapper.INSTANCE.petTreatmentToPetTreatmentDto(petTreatment));
        }
        return petTreatmentDtos;
    }

    @Override
    public void deletePetTreatmentById(int id) {
        petTreatmentRepository.deleteById(id);
    }

}
