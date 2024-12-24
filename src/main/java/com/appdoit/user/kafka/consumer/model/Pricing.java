package com.appdoit.user.kafka.consumer.model;

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
