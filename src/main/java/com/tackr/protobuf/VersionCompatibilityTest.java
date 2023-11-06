package com.tackr.protobuf;

import com.tackr.protobuf.models.Television;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class VersionCompatibilityTest {

    public static void main(String[] args) throws IOException {
/*
        Path pathV1 = Paths.get("tv-v1");
        Path pathV2 = Paths.get("tv-v2");

        Television television = Television.newBuilder()
                .setBrand("Sony")
                .setModel(2015)
                .setType(Type.OLED)
                .build();*//*

        Files.write(pathV2, television.toByteArray());*/

        //deserialize
        Path pathV2 = Paths.get("tv-v2");
        byte[] bytes = Files.readAllBytes(pathV2);
        System.out.println(Television.parseFrom(bytes));
    }
}
