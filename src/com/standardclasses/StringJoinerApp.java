package com.standardclasses;

import java.util.StringJoiner;

public class StringJoinerApp {
    public static void main(String[] args) {
        StringJoiner joiner = new StringJoiner(", ", "[", "]");

        joiner.add("Dhimas");
        joiner.add("Bayu");
        joiner.add("Ilham");
        joiner.add("Ramadhan");

        String result = joiner.toString();
        System.out.println(result);
    }
}
