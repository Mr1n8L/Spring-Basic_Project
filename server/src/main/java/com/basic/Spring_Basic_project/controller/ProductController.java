package com.basic.Spring_Basic_project.controller;

import com.basic.Spring_Basic_project.model.Product;
import com.basic.Spring_Basic_project.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/Home")
public class ProductController {

    @Autowired
    private ProductService service;

    @RequestMapping("/Products")
    public List<Product> getAllProduct(){
        return service.getAllProdcut();
    }
}
