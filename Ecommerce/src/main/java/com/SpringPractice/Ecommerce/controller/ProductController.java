package com.SpringPractice.Ecommerce.controller;

import com.SpringPractice.Ecommerce.DTO.productDTO;
import com.SpringPractice.Ecommerce.Entity.Products;
import com.SpringPractice.Ecommerce.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/rest/product")
public class ProductController {

    @Autowired
    ProductService productService;

    @GetMapping("/list")
    public ResponseEntity<List<productDTO>> getAllProducts(){
        try{
            return ResponseEntity.ok(productService.getAllProducts());
        } catch(Exception e){
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }

    @GetMapping("/most-expensive")
    public ResponseEntity<List<productDTO>> getMostExpensive(){
        try{
            return ResponseEntity.ok(productService.getMostExpensive());
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }



    @PostMapping("/create")
    public ResponseEntity<productDTO> savePoduct(@RequestBody Products products){
        try {
            return ResponseEntity.status(HttpStatus.CREATED).body(productService.saveProduct(products));
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }

    @PutMapping("/update")
    public ResponseEntity<productDTO> updateProduct(@RequestBody Products products) {
        try {
            return ResponseEntity.ok(productService.updateProduct(products));
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }

    @DeleteMapping("/delete")
    public ResponseEntity<Void> deleteProduct(@RequestBody Products products) {
        try {
            productService.deleteProduct(products);
            return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }

    @GetMapping("/byName")
    public ResponseEntity<List<productDTO>> getProductsByName(@RequestParam(name = "Name") String Name) {
        try {
            return ResponseEntity.ok(productService.getAllProductsByName(Name));
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }


    @GetMapping("/{id}")
    public ResponseEntity<productDTO> getProductByID(@PathVariable("id") Long id){
        try{
            return ResponseEntity.ok(productService.findByID(id));
        } catch (Exception e){
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }

}
