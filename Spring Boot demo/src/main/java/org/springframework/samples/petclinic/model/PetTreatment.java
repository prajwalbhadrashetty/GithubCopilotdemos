package org.springframework.samples.petclinic.model;

/* PetTreatment class with fields as below
 * id:int
 * name:String
 * treatment_date:LocalDate
 * description:String
 * add @Entity and @Table at class level
 * add @Column to all fields
 * add Getters and Setters
 * use jakarta persistence annotations
 */
import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotEmpty;

import org.springframework.format.annotation.DateTimeFormat;



@Entity
@Table(name = "pet_treatments")
public class PetTreatment extends BaseEntity {

    @Column(name="id")
    private int id;

    @Column(name = "name")
    private String name;
  
    @Column(name = "treatment_date")
    private LocalDate treatment_date;

    @Column(name = "description")
    private String description;

    // Getters and Setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getTreatment_date() {
        return treatment_date;
    }

    public void setTreatment_date(LocalDate treatment_date) {
        this.treatment_date = treatment_date;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    //setter and getter for id
    public Integer getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}