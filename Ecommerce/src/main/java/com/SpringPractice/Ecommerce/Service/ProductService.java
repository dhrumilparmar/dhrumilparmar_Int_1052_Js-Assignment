package com.SpringPractice.Ecommerce.Service;

import com.SpringPractice.Ecommerce.DTO.productDTO;
import com.SpringPractice.Ecommerce.Entity.Products;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

public interface ProductService {
    productDTO findByID(Long ID);
    productDTO saveProduct(Products product);
    productDTO updateProduct(Products product);

    void deleteProduct(Products product);

    List<productDTO> getAllProducts();
    List<productDTO> getAllProductsByName(String Name);
    List<productDTO> getMostExpensive();

}
