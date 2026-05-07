//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.SpringPractice.Airlines.Service.impl;
import com.SpringPractice.Airlines.DTO.PassengerDataResponseDto;
import com.SpringPractice.Airlines.Entity.Passengers;
import com.SpringPractice.Airlines.Respository.PassengerReposoitory;
import com.SpringPractice.Airlines.Service.passengersService;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class ServiceImpl implements passengersService {
    @Autowired
    PassengerReposoitory passengerReposoitory;

    public PassengerDataResponseDto findByFullName(String full_name) {
        List<Passengers> passengers = this.passengerReposoitory.findByfull_name(full_name);
        List<PassengerDataResponseDto> passengerList = new ArrayList();

        for(Passengers passenger : passengers) {
            passengerList.add(this.maptoDto(passenger));
        }

        return (PassengerDataResponseDto)passengerList.get(0);
    }

    public PassengerDataResponseDto savePassenger(Passengers passengers) {
        Passengers savedPassengers = (Passengers)this.passengerReposoitory.save(passengers);
        return this.maptoDto(savedPassengers);
    }

    public PassengerDataResponseDto updatePassenger(Passengers passengers) {
        Passengers updatedpassenger = (Passengers)this.passengerReposoitory.save(passengers);
        return this.maptoDto(updatedpassenger);
    }

    public void deletePassenger(Passengers passengers) {
        this.passengerReposoitory.delete(passengers);
    }

    public List<PassengerDataResponseDto> getAllPassengers() {
        List<Passengers> passengers = this.passengerReposoitory.findAll();
        List<PassengerDataResponseDto> allPassengerList = new ArrayList();

        for(Passengers passe : passengers) {
            allPassengerList.add(this.maptoDto(passe));
        }

        return allPassengerList;
    }

    public List<PassengerDataResponseDto> getPassengerBynationality(String nationality) {
        List<Passengers> passengers = this.passengerReposoitory.findBynationality(nationality);
        List<PassengerDataResponseDto> passengerNationalityList = new ArrayList();

        for(Passengers passe : passengers) {
            passengerNationalityList.add(this.maptoDto(passe));
        }

        return passengerNationalityList;
    }

    public PassengerDataResponseDto maptoDto(Passengers passengers) {
        PassengerDataResponseDto dto = new PassengerDataResponseDto();
        dto.setId(passengers.getId());
        dto.setName(passengers.getName());
        dto.setEmail(passengers.getEmail());
        dto.setNationality(passengers.getNationality());
        return dto;
    }
}
