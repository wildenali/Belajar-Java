package com.wildenali;

import javax.crypto.spec.PSource;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        // Assignment
        // tipedata []  nama = {komponen-komponen}

        System.out.println("Assisgnment Array");

        //            index = 0 1 2 3
        //                    | | | |
        int[] arrayInteger = {1,2,3,4};

        arrayInteger[0] = 11;

        System.out.println(arrayInteger[0]);
        System.out.println(arrayInteger[1]);
        System.out.println(arrayInteger[2]);
        System.out.println(arrayInteger[3]);


        // Deklarasi
        // tipedata[] nama = new int[jumlahArray];

        System.out.println("Deklarasi Array");
        float[] arrayFloat = new float[5];

        arrayFloat[3] = 11.5f;

        System.out.println(arrayFloat[0]);
        System.out.println(arrayFloat[1]);
        System.out.println(arrayFloat[2]);
        System.out.println(arrayFloat[3]);
        System.out.println(arrayFloat[4]);

        System.out.println(Arrays.toString((arrayInteger)));
        System.out.println(Arrays.toString((arrayFloat)));


        // Looping Array
        System.out.println("\n\nLooping Array");

        int[] arrayAngka = {11, 12, 13, 14, 15, 16, 17, 18, 19, 20};

        // Looping standard
        System.out.println("Looping standard");
        for (int i = 0; i < 8; i++) {
            System.out.println("index ke-" + i + " adalah = " + arrayAngka[i]);
        }

        // Looping dengan property Array
        System.out.println("\nLooping dengan Properti LENGTH");
        for (int i = 0; i < arrayAngka.length; i++) {
            System.out.println("index ke-" + i + " adalah = " + arrayAngka[i]);
        }

        // Looping khusus untuk collection <- Array
        System.out.println("Looping for each");
        for (int angka : arrayAngka) {
            System.out.println("Angka pada looping ini = " + angka);
        }



    }
}
