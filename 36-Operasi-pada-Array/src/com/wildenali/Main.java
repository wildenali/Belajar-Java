package com.wildenali;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] arrayAngka1 = {1,2,3,4,5};

        // Merubah array menjadi STRING
        System.out.println("\nMerubah array menjadi STRING ======================");
        printArray(arrayAngka1);

        // mengKOPI Array
        System.out.println("\nKOPI Array ====================== ");
        int[] arrayAngka2 = new int[5];
        printArray(arrayAngka1);
        printArray(arrayAngka2);

        System.out.println("\nKOPI dengan LOOP ======================");
        for (int i = 0; i < arrayAngka1.length; i++) {
            arrayAngka2[i] = arrayAngka1[i];
        }
        printArray(arrayAngka1);
        System.out.println(arrayAngka1);
        printArray(arrayAngka2);
        System.out.println(arrayAngka2);

        System.out.println("\nKOPI dengan copyOf ======================");
        int[] arrayAngka3 = Arrays.copyOf(arrayAngka1, 3);
        printArray(arrayAngka1);
        System.out.println(arrayAngka1);
        printArray(arrayAngka3);
        System.out.println(arrayAngka3);

        System.out.println("\nKOPI dengan copyOfRange ======================");
        int[] arrayAngka4 = Arrays.copyOfRange(arrayAngka1, 2, 5);
        printArray(arrayAngka1);
        System.out.println(arrayAngka1);
        printArray(arrayAngka4);
        System.out.println(arrayAngka4);


        // Fill Array
        System.out.println("\nFILL Array ======================");
        int[] arrayAngka5 = new int[10];
        printArray(arrayAngka5);;
        Arrays.fill(arrayAngka5, 5);
        printArray(arrayAngka5);

        // KOMPARASI Array
        System.out.println("\nKOMPARASI Array ======================");
        int[] arrayAngka6 = {1,2,3,4,9};
        int[] arrayAngka7 = {1,2,3,4,5};

        System.out.println(Arrays.equals(arrayAngka6, arrayAngka7));
        if (Arrays.equals(arrayAngka6,arrayAngka7)) {
            System.out.println("Array ini sama");
        } else {
            System.out.println("Array ini beda");
        }

//        System.out.println("\nCek Array LEBIH BESAR ======================");
//        System.out.println(Arrays.compare(arrayAngka6,arrayAngka7));
//
//        System.out.println("\nCek Array INDEKS yang BERBEDA ======================");
//        System.out.println(Arrays.mismatch(arrayAngka6,arrayAngka7));

        System.out.println("\nSORT Array ======================");
        int[] arrayAngka8 = {1,6,4,3,8,6,2,6};
        printArray(arrayAngka8);
        Arrays.sort(arrayAngka8);
        printArray(arrayAngka8);;

        System.out.println("\nSEARCH Array ======================");
        int angka = 3;
        int posisi = Arrays.binarySearch(arrayAngka8, angka);
        System.out.println("angka " + angka + " ada di indeks " + posisi);




    }

    private static void printArray(int[] dataArray) {
        System.out.println("Array = " + Arrays.toString(dataArray));
    }

}
