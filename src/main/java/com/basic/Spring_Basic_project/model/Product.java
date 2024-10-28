package com.basic.Spring_Basic_project.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.Date;
@Component
@AllArgsConstructor
@NoArgsConstructor
// Lombok annotations for generating getters and setters automatically.
@Entity
@Data
public class Product {

    @Id
    private int Id;
    private String Name;
    private String Description;
    private String Brand;
    private BigDecimal Price;
    private String Category;
    private Date ReleaseDate;
    private Boolean Availability;
    private int Quantity;

}
