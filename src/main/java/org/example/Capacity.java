package org.example;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Capacity {

    private int capacity;

    private CapacityUnit unit;
}
