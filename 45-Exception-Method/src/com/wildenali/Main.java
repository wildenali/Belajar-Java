package com.wildenali;

import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int[] arrayData = {1,2,3,4};

        Scanner userInput = new Scanner(System.in);
        System.out.print("data ke-: ");
        int indexInput = userInput.nextInt();

        // Exception Biasa
        System.out.println("================= Exception Biasa =================");
        try {
            System.out.printf("data dari array ke-%d adalah %d", indexInput, arrayData[indexInput]);
        } catch (Exception e) {
            System.err.println(e);
        }


        // Exception didalam fungsi
        System.out.println("================= Exception dalam Fungsi =================");
        int data = ambilDataDariArray(arrayData, indexInput);
        System.out.printf("data dari array ke-%d adalah %d\n\n", indexInput, data);



        // Exception Throws by method
        System.out.println("================= Exception Throws by method =================");
        int data2 = 0;
        try {
            data2 = ambilData(arrayData, indexInput);
        } catch (Exception e) {
            System.err.println(e);
        }
        System.out.printf("data dari array ke-%d adalah %d\n\n", indexInput, data2);



        System.out.println("Akhir dari Program");

    }

    private static int ambilDataDariArray(int[] array, int index) {
        int hasil = 0;
        try {
            hasil = array[index];
        } catch (Exception e) {
            System.err.println(e);
        }

        return hasil;
    }

    private static int ambilData(int[] array, int index) throws Exception{
        int hasil = array[index];
        return hasil;
    }

}
