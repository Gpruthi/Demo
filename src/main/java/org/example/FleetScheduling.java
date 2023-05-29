package org.example;

import java.util.*;

public class FleetScheduling {

    public void getFleetScheduling(double numberOfHours, List<VehicleCharger> chargersList, List<Vehicle> trucks) {

        if(trucks.isEmpty() || numberOfHours ==0 || chargersList.isEmpty()) {
            System.out.println("Fleet Scheduling can't be performed");
        } else {
            trucks.sort(Comparator.comparing(vehicle -> vehicle.getRemainingCapacity().getCapacity()));
            chargersList.sort(Comparator.comparing(VehicleCharger::getChargingRate));
            int nextIndex =0;
            for (VehicleCharger vehicleCharger : chargersList) {
                List<Integer> vehicleIds = new ArrayList<>();
                double totalChargerCapacity = vehicleCharger.getChargingRate() * numberOfHours;
                while (nextIndex < trucks.size() && totalChargerCapacity >= trucks.get(nextIndex).getRemainingCapacity().getCapacity()) {
                    vehicleIds.add(trucks.get(nextIndex).getVehicleId());
                    totalChargerCapacity = totalChargerCapacity - trucks.get(nextIndex).getRemainingCapacity().getCapacity();
                    nextIndex++;
                }
                System.out.println("ChargerId :" + vehicleCharger.getChargerId() + " VehicleIds : " + vehicleIds);
            }
        }
    }
}
