package SmartCity.main;

import SmartCity.model.Passenger;

import SmartCity.service.*;
import SmartCity.serviceimpl.*;

import SmartCity.util.GEoUtils;
import SmartCity.service.FareCCalculator;

import java.util.*;
import java.util.stream.Collectors;

public class SmartCityApp {

    public static void main(String[] args) {

        
        // SERVICES
       
    	List<TransportService> services = new ArrayList<>();

    	services.add(new BusService());
    	services.add(new MetroService());
    	services.add(new TaxiService());
    	services.add(new AmbulanceService());

    	System.out.println("LIVE SERVICES");

    	services.forEach(service ->
    	        service.printServiceDetails()
    	);


       
        // Lambda sorting
      
        System.out.println(" Lowest Fare First");

        services.stream()
                .sorted((a, b) ->
                        Double.compare(a.getFare(), b.getFare()))
                .forEach(service ->
                service.printServiceDetails());

       
        // Functional interface
    
        FareCCalculator calc =
                d -> d * 5;

        double distance =
                GEoUtils.calculateDistance(2, 3, 6, 9);

        System.out.println(
                "\nDistance = " + distance +
                " | Fare = ₹" +
                calc.calculateFare(distance)
        );

      
        // Passenger data
       
        List<Passenger> passengers = Arrays.asList(
                new Passenger("A-D", 40, true),
                new Passenger("A-D", 50, true),
                new Passenger("B-C", 30, false)
        );

        // groupingBy
        System.out.println("\n Group By Route");
        System.out.println(
                passengers.stream()
                        .collect(Collectors.groupingBy(
                                Passenger::getRoute))
        );

        // partitioningBy
        System.out.println("\n Peak / Non-Peak");
        System.out.println(
                passengers.stream()
                        .collect(Collectors.partitioningBy(
                                Passenger::isPeak))
        );

        // summarizingDouble
        System.out.println("\n Revenue Summary");
        System.out.println(
                passengers.stream()
                        .collect(Collectors.summarizingDouble(
                                Passenger::getFare))
        );

     // marker interface 
        System.out.println("\n Emergency Services");

        services.forEach(s -> {
            if (s instanceof EmergencyService) {
                System.out.println(
                        s.getName() + " → PRIORITY");
            }
        });
    }
}
