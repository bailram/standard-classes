package com.standardclasses;

public class StringBufferStringBuilderApp {
    public static void main(String[] args) {
        /**
         * ketika membuat String seperti beriku, sebenarnya java tidak membuat 1 object dimemory. tetapi membuat
         * 3 object string data
         * Dhimas
         * Dhimas Bayu
         * Dhimas Bayu Ilham
         *
         * dan ini tentunya tidak direkomendasikan oleh java untuk menggunakan String object untuk keperluan manipulasi
         * string
         */
        String name = "Dhimas";
        name = name + " Bayu";
        name = name + " Ilham";
        System.out.println(name);

        /**
         * String builder. penggunaan string untuk keperluan manipulasi data direkomendasikan menggunakan ini.
         * karena string yang disimpan di memory hanya 1 object
         */
        StringBuilder builder = new StringBuilder();
        builder.append("Dhimas");
        builder.append(" Bayu");
        builder.append(" Ilham");
        String nama = builder.toString();
        System.out.println(nama);
        System.out.println(nama);

        /**
         * String buffer. penggunaan string yang bisa diakses bersamaan secara paralel di thread. atau bisa bisa disebut
         * thread safe. tapi memakan banyak memori
         */


    }
}
