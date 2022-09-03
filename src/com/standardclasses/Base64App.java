package com.standardclasses;

import java.util.Base64;

public class Base64App {
    public static void main(String[] args) {
        String query = "Dhimas cakep";

        String encode = Base64.getEncoder().encodeToString(query.getBytes());
        System.out.println("encode : " + encode);

        byte[] bytes = Base64.getDecoder().decode(encode);
        String decode = new String(bytes);
        System.out.println("decode : " + decode );
    }
}
