package com.basic.Spring_Basic_project.model;

import jakarta.persistence.*;
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
@Table(name="product")
public class Product {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    // we use the above statement to so that the id's for the products are
    // automatically generated and assigned to each product when we run the insert
    // query in the db
    private int id;

    private String name;
    private String description;
    private String brand;
    private BigDecimal price;
    private String category;
    private Date releaseDate;
    private Boolean availability;
    private int quantity;

}
