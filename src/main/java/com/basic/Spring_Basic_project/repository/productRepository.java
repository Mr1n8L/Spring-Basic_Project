package com.basic.Spring_Basic_project.repository;

import com.basic.Spring_Basic_project.model.product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface productRepository extends JpaRepository<product, Integer>{
}
