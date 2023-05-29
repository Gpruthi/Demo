package org.example;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Vehicle {

    private int vehicleId;

    private Capacity totalCapacity;

    private Capacity remainingCapacity;
}
