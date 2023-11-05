package com.tackr.protobuf;

import com.tackr.protobuf.model.Car;
import com.tackr.protobuf.model.Dealer;

public class MapDemo {

    public static void main(String[] args) {

        Car mustang = Car.newBuilder()
                .setMake("Ford")
                .setModel("Mustang")
                .setYear(2023)
                .build();

        Car civic = Car.newBuilder()
                .setMake("Honda")
                .setModel("Civic")
                .setYear(2021)
                .build();

        Dealer dealer = Dealer.newBuilder()
                .putModel(2023, mustang)
                .putModel(2021, civic)
                .build();

        System.out.println(dealer.getModelOrDefault(2023, civic));
    }
}
