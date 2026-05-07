//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.SpringPractice.Airlines.Respository;

import com.SpringPractice.Airlines.Entity.Passengers;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface PassengerReposoitory extends JpaRepository<Passengers, Long> {
    @Query("select p from Passengers p where p.name=:n")
    List<Passengers> findByfull_name(@Param("n") String full_Name);

    @Query("select p from Passengers p where p.nationality=:n")
    List<Passengers> findBynationality(@Param("n") String nationality);

    @Query(
            value = "select email from passengers",
            nativeQuery = true
    )
    List<Passengers> findemail();
}
