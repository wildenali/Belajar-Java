package com.wildenali;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        // MemBUAT array 2 Dimensi
        System.out.println("Array Multidimensi ========================");
        int[][] array2D = {
                {1,2},
                {3,4}
        };
        printArray2D(array2D);


        // MemBUAT Array 2 Dimensi dengan Deklarasi
        // int[baris][kolom]
        System.out.println("BUAT Array 2D dengan Deklarasi ========================");

        int[][] arrayAngka = new int[5][4];
        printArray2D(arrayAngka);

        // Looping lengkap secara manual
        System.out.println("Looping manual ========================");
        for (int i = 0; i < arrayAngka.length; i++) {
            System.out.print("[");
            for (int j = 0; j < arrayAngka[i].length; j++) {
                System.out.print(arrayAngka[i][j] + ",");
            }
            System.out.print("]\n");
        }

        // looping foreach
        System.out.println("Looping Foreach ========================");
        for (int[] baris: arrayAngka) {
            System.out.print("[");
            for (int angka: baris) {
                System.out.print(angka + ",");
            }
            System.out.print("]\n");
        }

        // Array secara manual, untuk pembuktian
        System.out.println("\nArray Manual, untuk Pembuktian ========================");
        int[][] array2D_a = {
                {1,2,3,4,5},
                {6,7,8,9,10},
                {11,12,13,14,15},
        };
        printArray2D(array2D_a);

        System.out.println("\nArray RAGGED ========================");
        int[][] array_ragged = {
                {1,2,3},
                {4,5,6,7},
                {8},
        };
        printArray2D(array_ragged);

        System.out.println("\nArray 2D latihan ========================");
        int[][] array_2D_b = {
                {1,2,3},
                {4,5},
        };
        System.out.println(array_2D_b);
        System.out.println(Arrays.toString(array_2D_b));
        System.out.println(array_2D_b[0]);
        System.out.println(array_2D_b[1]);

        System.out.println(Arrays.deepToString(array_2D_b));
        System.out.println("\n");

        System.out.println("Array Char ==============================");
        char[] array_char1 = {'a', 'b', 'c'};
        char[] array_char2 = {'d', 'e'};

        char[][] arrayChar_2D = {
                array_char1,
                array_char2,
        };
        System.out.println(arrayChar_2D);
        System.out.println(Integer.toHexString(System.identityHashCode(array_char1)));
        System.out.println(Integer.toHexString(System.identityHashCode(array_char2)));
        System.out.println(Arrays.toString(arrayChar_2D));
        System.out.println(Arrays.deepToString(arrayChar_2D));

    }

    private static void printArray2D(int[][] dataArray) {
        System.out.print("{\n");
        for (int[] baris: dataArray) {
            System.out.print("{");
            for (int angka: baris) {
                System.out.print(angka + ",");
            }
            System.out.print("}\n");
        }
        System.out.print("}\n");
    }


}
