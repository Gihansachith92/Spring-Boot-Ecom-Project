package com.gihan.ecomproject.repository;

import com.gihan.ecomproject.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {

    @Query()
    List<Product> searchProducts(String keyword);
}
