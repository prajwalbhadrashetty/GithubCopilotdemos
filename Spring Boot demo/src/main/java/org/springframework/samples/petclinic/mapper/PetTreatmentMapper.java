package org.springframework.samples.petclinic.mapper;

/*interface PetTreatmentMapper for mapping fields of PetTreatment to PetTreatmentDto using mapstruct
*/
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;
import org.springframework.samples.petclinic.dto.PetTreatmentDto;
import org.springframework.samples.petclinic.model.PetTreatment;

@Mapper
public interface PetTreatmentMapper {
    PetTreatmentMapper INSTANCE = Mappers.getMapper(PetTreatmentMapper.class);

    @Mapping(source = "id", target = "id")
    @Mapping(source = "name", target = "name")
    @Mapping(source = "treatment_date", target = "treatment_date")
    @Mapping(source = "description", target = "description")
    PetTreatmentDto petTreatmentToPetTreatmentDto(PetTreatment petTreatment);
}
// Compare this snippet from src/main/java/org/springframework/samples/petclinic/service/PetTreatmentService.java:
// package org.springframework.samples.petclinic.service;
// /* PetTreatmentService interface with methods as below
//  * savePetTreatment(PetTreatment petTreatment)
//  * findPetTreatmentById(int id)
//  * findAllPetTreatments()
//  * deletePetTreatmentById(int id)
//  */
// import java.util.List;

