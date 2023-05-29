package org.example;

import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        String paragraph = "Bob hit a ball, the hit... BALL 'flew' far after it was hit.";

        String normalizedStr = paragraph.replaceAll("[^a-zA-Z0-9]"," ").toLowerCase();



        FleetScheduling fleetScheduling = new FleetScheduling();
        List<VehicleCharger> chargersList = new ArrayList<>();
        chargersList.add(new VehicleCharger(1, 40));
        chargersList.add(new VehicleCharger(2, 100));
        chargersList.add(new VehicleCharger(3, 20));

//        chargersList.add(new VehicleCharger(1, 110));
//        chargersList.add(new VehicleCharger(2, 140));
//        chargersList.add(new VehicleCharger(3, 84));

        List<Vehicle> trucks = new ArrayList<>();

        trucks.

        trucks.add(new Vehicle(101, new Capacity(100, CapacityUnit.KWH), new Capacity(10, CapacityUnit.KWH)));
        trucks.add(new Vehicle(102, new Capacity(100, CapacityUnit.KWH), new Capacity(50, CapacityUnit.KWH)));
        trucks.add(new Vehicle(103, new Capacity(100, CapacityUnit.KWH), new Capacity(25, CapacityUnit.KWH)));
        trucks.add(new Vehicle(104, new Capacity(100, CapacityUnit.KWH), new Capacity(15, CapacityUnit.KWH)));
        trucks.add(new Vehicle(105, new Capacity(100, CapacityUnit.KWH), new Capacity(20, CapacityUnit.KWH)));
        trucks.add(new Vehicle(106, new Capacity(100, CapacityUnit.KWH), new Capacity(16, CapacityUnit.KWH)));

//        trucks.add(new Vehicle(101, new Capacity(100, CapacityUnit.KWH), new Capacity(20, CapacityUnit.KWH)));
//        trucks.add(new Vehicle(102, new Capacity(100, CapacityUnit.KWH), new Capacity(27, CapacityUnit.KWH)));
//        trucks.add(new Vehicle(103, new Capacity(100, CapacityUnit.KWH), new Capacity(25, CapacityUnit.KWH)));
//        trucks.add(new Vehicle(104, new Capacity(100, CapacityUnit.KWH), new Capacity(24, CapacityUnit.KWH)));
//        trucks.add(new Vehicle(105, new Capacity(100, CapacityUnit.KWH), new Capacity(26, CapacityUnit.KWH)));
//        trucks.add(new Vehicle(106, new Capacity(100, CapacityUnit.KWH), new Capacity(22, CapacityUnit.KWH)));


        //fleetScheduling.getFleetScheduling(0.5, chargersList, trucks);
//        Hit hit = new Hit();
//        Date date = new Date(2023, 05,11, 17, 45, 03);
//        hit.saveHitCount(date.getTime());
//        hit.saveHitCount(date.getTime());
//
//        int counts = hit.getHits(date.getTime());
//
//        System.out.println("hit counts : " + counts);

        Cache cache = new Cache(5);


        cache.put(1);
        cache.put(2);
        cache.put(3);
        cache.put(1);
        cache.put(5);
        cache.put(6);
        cache.put(7);

        cache.printCache();











































    }
}