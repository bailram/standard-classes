package com.standardclasses;

import java.io.*;
import java.util.Properties;

public class PropertiesApp {
    public static void main(String[] args) {
        // load
        try {
            Properties properties = new Properties();
            properties.load(new FileInputStream("application.properties"));
            var url = properties.getProperty("database.url");
            var username = properties.getProperty("database.username");
            var password = properties.getProperty("databse.password");

            System.out.println(url);
            System.out.println(username);
            System.out.println(password);
        } catch (FileNotFoundException e) {
            System.out.println("file tidak ditemukan");
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("gagal load data dari file");
            e.printStackTrace();
        }

        // store
        try {
            Properties prop = new Properties();
            prop.put("name.first", "dhimas");
            prop.put("name.last", "bayu");

            prop.store(new FileOutputStream("esbapplication.properties"), "person");
        } catch (FileNotFoundException e) {
            System.out.println("Error membuat file properties");
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("Error menyimpan properties");
            e.printStackTrace();
        }
    }
}
