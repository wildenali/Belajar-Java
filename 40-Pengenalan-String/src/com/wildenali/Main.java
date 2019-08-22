package com.wildenali;

import java.util.Arrays;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        // Membuat String
        String kataString = "hallo";

        char[] kataChar = {'h','a','l','l','o'};

        // Menampilkan String
        System.out.println(kataString);
        System.out.println(Arrays.toString(kataChar));

        // Mengkases komponen dari String
        System.out.println("Komponen pertama dari char[] = " + kataChar[3]);
        System.out.println("Komponen pertama dari string = " + kataString.charAt(3));

        // MeRUBAH komponen
        System.out.println("MeRUBAH Komponen ======================");
        // Merubah komponen dari String tidak bisa
        // karena string di java itu immutable
        kataChar[0] = 'c';
        System.out.println(Arrays.toString(kataChar));
        // kataString[0] = "C";   <------------- TIDAK BISA
        // kataString.chartAt(0) = "C";   <------------- TIDAK BISA

        // kita bisa merubah komponen secara tidak langsung

        printAddress("kataString", kataString);

        System.out.println(kataString.substring(1,5));

        System.out.println("C" + kataString.substring(1,5));

        printAddress("kataString", kataString);

        String str_1 = "hallo";
        String str_2 = "test";
        String str_3 = "testing";

        str_3 = str_3.substring(0,4);

        // Memory dari string (String Pool)
        printAddress("str_1", str_1);
        printAddress("str_2", str_2);
        printAddress("str_3", str_3);

        String str_4 = "Callo";
        printAddress("str_4", str_4);

        kataString = "Callo";
        printAddress("kataString", kataString);

        // 1. String di java itu immutable
        // 2. String yang berada di string pool itu akan reusable, memorynya lebih efisien
        // 3. membuat string dengan method baru, maka dia akan di taro di memory lain bukan di string pool

        // lihat lebih dalam
        String a = new String("hallo");
        printAddress("a", a);


    }

    private static void printAddress(String nama, String data) {
        int address = System.identityHashCode(data);
        System.out.println(nama + " = " + data + "\t|| address = " + Integer.toHexString(address));
    }

}
