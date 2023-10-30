package org.springframework.samples.petclinic.dto;
/* Data transfer object for PetTreatment class with fields as below
* id:int
* name:String
* treatment_date:LocalDate
* description:String
*/
import java.time.LocalDate;

import org.springframework.format.annotation.DateTimeFormat;

public class PetTreatmentDto {
    
        private int id;
    
        private String name;
    
        @DateTimeFormat(pattern = "yyyy/MM/dd")
        private LocalDate treatment_date;
    
        private String description;
    
        // Getters and Setters
    
        public int getId() {
            return id;
        }
    
        public void setId(int id) {
            this.id = id;
        }
        
        // Getters and Setters
    
        public String getName() {
            return name;
        }
    
        public void setName(String name) {
            this.name = name;
        }
    
        // Getters and Setters
    
        public LocalDate getTreatment_date() {
            return treatment_date;
        }
    
        public void setTreatment_date(LocalDate treatment_date) {
            this.treatment_date = treatment_date;
        }
    
        // Getters and Setters
    
        public String getDescription() {
            return description;
        }
    
        public void setDescription(String description) {
            this.description = description;
        }
    
}

