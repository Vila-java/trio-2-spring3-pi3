package com.br.meli.spring03.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Vehicle {
    private String brand, model, currency;
    private double numKilometers, price;
    private int doors, numOwners;
//    private String [] services = {""};
}
