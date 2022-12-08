package com.example.airline_api.components;


import com.example.airline_api.models.Flight;
import com.example.airline_api.models.Passenger;
import com.example.airline_api.repositories.FlightRepository;
import com.example.airline_api.repositories.PassengerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    FlightRepository flightRepository;

    @Autowired
    PassengerRepository passengerRepository;

    public DataLoader(){}

    @Override
    public void run(ApplicationArguments args) throws Exception {

        // Flights
        Flight istanbul = new Flight("Istanbul", 200, "09/12/22","14:00");
        flightRepository.save(istanbul);

        Flight istanbul501 = new Flight("Istanbul", 150, "11/12/22","12:00");
        flightRepository.save(istanbul501);

        Flight tokyo = new Flight("Tokyo", 350, "12/12/22","16:00");
        flightRepository.save(tokyo);

        Flight maldives = new Flight("Maldives", 50, "01/01/23","19:00");
        flightRepository.save(maldives);

        Flight bali = new Flight("Bali", 100, "20/12/22","10:00");
        flightRepository.save(bali);

        Flight paris = new Flight("Paris", 200, "15/01/23","15:00");
        flightRepository.save(paris);

        Flight la = new Flight("Los Angeles", 250, "30/12/22","12:30");
        flightRepository.save(la);

        // Passengers

        Passenger mem_laz = new Passenger("Mehmet Laz", "memlaz@gmail.com");
        passengerRepository.save(mem_laz);

        Passenger han_suz = new Passenger("Hanada Suzuki", "hansuz@gmail.com");
        passengerRepository.save(han_suz);

        Passenger ber_yas = new Passenger("Berna Yasar", "beryas@gmail.com");
        passengerRepository.save(ber_yas);

        Passenger bin_yas = new Passenger("Binnaz Yasar", "binyas@gmail.com");
        passengerRepository.save(bin_yas);

        Passenger chl_lau = new Passenger("Chloe Laurent", "chllau@gmail.com");
        passengerRepository.save(chl_lau);

        Passenger emm_smi = new Passenger("Emma Smith", "emmsmi@gmail.com");
        passengerRepository.save(emm_smi);

        // Multiple passengers on multiple flights

        Passenger billieHoliday = new Passenger("Billie Holiday", "bh@gmail.com");
        billieHoliday.add
    }
}
