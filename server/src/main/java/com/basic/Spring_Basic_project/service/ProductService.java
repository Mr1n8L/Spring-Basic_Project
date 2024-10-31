package com.basic.Spring_Basic_project.service;

import com.basic.Spring_Basic_project.model.Product;
import com.basic.Spring_Basic_project.repository.ProductRepository;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Getter
@Service
public class ProductService {

    @Autowired
    private ProductRepository repo;

    public List<Product> getAllProdcut(){
        return repo.findAll();
    }
}
