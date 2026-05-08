//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.SpringPractice.Airlines.controller;

import com.SpringPractice.Airlines.DTO.PassengerDataResponseDto;
import com.SpringPractice.Airlines.Entity.Passengers;
import com.SpringPractice.Airlines.Service.passengersService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping({"rest/passengers"})
public class PassengerController {
    @Autowired
    passengersService passService;

    @GetMapping({"/allPassengers"})
    public ResponseEntity<List<PassengerDataResponseDto>> getAllPassengers() {
        try {
            return ResponseEntity.ok(this.passService.getAllPassengers());
        } catch (Exception var2) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }

    @PostMapping({"/create"})
    public ResponseEntity<PassengerDataResponseDto> savePaasengers(@RequestBody Passengers passengers) {
        try {
            return ResponseEntity.status(HttpStatus.CREATED).body(this.passService.savePassenger(passengers));
        } catch (Exception var3) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }

    @PutMapping({"/update"})
    public ResponseEntity<PassengerDataResponseDto> updatePassenger(@RequestBody Passengers passengers) {
        try {
            return ResponseEntity.ok(this.passService.updatePassenger(passengers));
        } catch (Exception var3) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }

    @DeleteMapping({"/delete"})
    public ResponseEntity<PassengerDataResponseDto> deletePassenger(@RequestBody Passengers passengers) {
        try {
            this.passService.deletePassenger(passengers);
            return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
        } catch (Exception var3) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }

    @GetMapping({"/{full_name}"})
    public ResponseEntity<PassengerDataResponseDto> getByfull_name(@PathVariable("full_name") String full_name) {
        try {
            return ResponseEntity.ok(this.passService.findByFullName(full_name));
        } catch (Exception var3) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }


    @GetMapping("/nationality/{nationality}")
    public ResponseEntity<List<PassengerDataResponseDto>>
    getPassengerByNationality(@PathVariable String nationality) {

        try {
            System.out.println("i am called");

            return ResponseEntity.ok(
                    this.passService.getPassengerByNationality(nationality)
            );

        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }
}
