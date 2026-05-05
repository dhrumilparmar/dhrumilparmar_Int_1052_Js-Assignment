package com.SpringPractice.Ecommerce.Service.Impl;

import com.SpringPractice.Ecommerce.DTO.productDTO;
import com.SpringPractice.Ecommerce.Entity.Products;
import com.SpringPractice.Ecommerce.Service.ProductService;
import com.SpringPractice.Ecommerce.repository.productRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    productRepository ProductRepository;

    @Override
   public productDTO findByID(Long ID){
        Optional<Products> products = ProductRepository.findById(ID);
        return maptoDto(products.get());
    }



    @Override
    public productDTO saveProduct(Products product){
        Products savedProduct = ProductRepository.save(product);
        return maptoDto(savedProduct);
    }
    @Override
    public productDTO updateProduct(Products product){
        Products updateProduct = ProductRepository.save(product);
        return maptoDto(updateProduct);
    }


    @Override
    public void deleteProduct(Products product){
        ProductRepository.delete(product);
    }

    @Override
    public List<productDTO> getAllProducts(){
        List<Products> products = ProductRepository.findAll();
        List<productDTO> productList = new ArrayList<>();

        for(Products product : products){
            productList.add(maptoDto(product));
        }

        return productList;
    }
    @Override
    public List<productDTO> getAllProductsByName(String Name){
        List<Products> products = ProductRepository.findProdByName(Name);
        List<productDTO> productList = new ArrayList<>();
        for(Products product : products){
            productList.add(maptoDto(product));
        }
        return productList;
    }


    private productDTO maptoDto(Products products) {
        productDTO dto = new productDTO();

        dto.setProdID(products.getProdID());
        dto.setProdName(products.getProdName());
        dto.setProdPrice(products.getProdPrice());

        return dto;
    }
}
