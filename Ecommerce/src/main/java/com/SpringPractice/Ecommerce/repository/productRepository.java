package com.SpringPractice.Ecommerce.repository;
import com.SpringPractice.Ecommerce.Entity.Products;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface productRepository extends JpaRepository<Products, Long> {

    //custome finder methods
    List<Products> findByprodName(String prodName);

    //JPQL
    @Query("select e from Products e where e.prodName = :n")
    List<Products> findProductByName(@Param("n") String name);

    //native Query ;
    @Query(value = "SELECT * FROM products WHERE prodName = :n", nativeQuery = true)
    List<Products> findProdByName(@Param("n") String name);

}
