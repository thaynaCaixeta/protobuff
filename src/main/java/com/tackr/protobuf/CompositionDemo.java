package com.tackr.protobuf;

import com.tackr.protobuf.models.Address;
import com.tackr.protobuf.models.Car;
import com.tackr.protobuf.models.Person;

public class CompositionDemo {

    public static void main(String[] args) {
        Person lorena = Person.newBuilder()
                .setName("Lorena")
                .setAge(24)
                .setAddress(Address.newBuilder()
                        .setPostbox(123)
                        .setStreet("Eca de Queiroz")
                        .setCity("Leiria")
                        .build())
                .addCar(Car.newBuilder()
                        .setMake("Ford")
                        .setModel("Mustang")
                        .setYear(2023)
                        .build())
                .addCar(Car.newBuilder()
                        .setMake("Ford")
                        .setModel("Mustang")
                        .setYear(2023)
                        .build())
                .build();

        System.out.println(lorena);
    }
}
