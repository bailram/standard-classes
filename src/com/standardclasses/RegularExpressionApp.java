package com.standardclasses;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpressionApp {
    public static void main(String[] args) {
        String name = "Dhimas Bayu Ilham Ramadhan";

        Pattern pattern = Pattern.compile("[a-zA-Z]*[a][a-zA-Z]*");
        Matcher matcher = pattern.matcher(name);
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
