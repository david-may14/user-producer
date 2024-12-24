package com.appdoit.user.consumer.acceptedtask;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class Pricing {
    private String tariff;
    private double price;
    private boolean isDynamicTariff;
}
