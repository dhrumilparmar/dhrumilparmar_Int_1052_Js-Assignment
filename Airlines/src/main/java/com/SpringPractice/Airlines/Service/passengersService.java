package com.SpringPractice.Airlines.Service;
import com.SpringPractice.Airlines.Entity.Passengers;
import com.SpringPractice.Airlines.DTO.PassengerDataResponseDto;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface passengersService {
    PassengerDataResponseDto findByFullName(String full_name);

    PassengerDataResponseDto savePassenger(Passengers passengers);

    PassengerDataResponseDto updatePassenger(Passengers passengers);

    void deletePassenger(Passengers passengers);

    List<PassengerDataResponseDto> getAllPassengers();

    List<PassengerDataResponseDto> getPassengerByNationality(String nationality);
}
