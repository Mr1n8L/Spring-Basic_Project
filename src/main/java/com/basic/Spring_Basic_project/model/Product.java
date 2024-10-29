package com.basic.Spring_Basic_project.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Generated;
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
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    // we use the above statement to so that the id's for the products are
    // automatically generated and assigned to each product when we run the insert
    // query in the db

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
