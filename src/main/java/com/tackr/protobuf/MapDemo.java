package com.tackr.protobuf;

import com.tackr.protobuf.models.BodyStyle;
import com.tackr.protobuf.models.Car;
import com.tackr.protobuf.models.Dealer;

public class MapDemo {

    public static void main(String[] args) {

        Car mustang = Car.newBuilder()
                .setMake("Ford")
                .setModel("Mustang")
                .setYear(2023)
                .setBodyStyle(BodyStyle.SPORTIVE)
                .build();

        Car civic = Car.newBuilder()
                .setMake("Honda")
                .setModel("Civic")
                .setYear(2021)
                .setBodyStyle(BodyStyle.SEDAN)
                .build();

        Dealer dealer = Dealer.newBuilder()
                .putModel(2023, mustang)
                .putModel(2021, civic)
                .build();

        System.out.println(dealer.getModelOrThrow(2023).getBodyStyle());
    }
}
