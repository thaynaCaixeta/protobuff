package com.tackr.protobuf;

import com.tackr.protobuf.model.Address;
import com.tackr.protobuf.model.Car;
import com.tackr.protobuf.model.Person;

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
                .setCar(Car.newBuilder()
                        .setMake("Ford")
                        .setModel("Mustang")
                        .setYear(2023)
                        .build())
                .build();

        System.out.println(lorena);
    }
}
