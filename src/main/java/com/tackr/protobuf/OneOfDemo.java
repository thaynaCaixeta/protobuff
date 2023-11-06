package com.tackr.protobuf;

import com.tackr.protobuf.models.Credentials;
import com.tackr.protobuf.models.EmailCredentials;
import com.tackr.protobuf.models.PhoneOTP;

public class OneOfDemo {

    public static void main(String[] args) {

        Credentials credentials = Credentials.newBuilder()
                .setEmailMode(EmailCredentials.newBuilder()
                        .setEmail("nobody@gmail.com")
                        .setPassword("admin123")
                        .build())
                .setPhoneMode(PhoneOTP.newBuilder()
                        .setNumber(1231234)
                        .setCode(456)
                        .build())

                .build();

        login(credentials);
    }

    private static void login(Credentials credentials) {

        switch (credentials.getModeCase()) {
            case EMAILMODE:
                System.out.println(credentials.getEmailMode());
                break;
            case PHONEMODE:
                System.out.println(credentials.getPhoneMode());
                break;
        }
    }
}
