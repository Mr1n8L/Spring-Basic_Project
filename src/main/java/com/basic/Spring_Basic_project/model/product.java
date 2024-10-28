package com.basic.Spring_Basic_project.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

import java.util.Date;

@Entity
@Data
public class product {
    @Id
    private int productId;
    private String productName;
    private double productPrice;
    private String productDescription;
    private String productBrand;
    private String productCategory;
    private Boolean productAvailability;
    private Date productReleaseDate;
    private int productQuantity;

}
