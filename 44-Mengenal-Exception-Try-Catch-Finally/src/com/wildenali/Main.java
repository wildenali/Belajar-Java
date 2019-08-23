package com.wildenali;


import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // Exception itu memberitahu kita tentang error ketika runtime, bukan saat compile
        int[] array = {1,2,3,4};

        Scanner userInput = new Scanner(System.in);
        FileInputStream fileInput = null;
        System.out.print("Nilai array ke: ");
        int index = userInput.nextInt();

        // Exception handling (try catch, finally)
//        try {
//            System.out.printf("index ke-%d, adalah %d", index, array[index]);
//        } catch (Exception exception_pesan){
//            System.out.println(exception_pesan);
//        }
        // atau
//        try {
//            System.out.printf("index ke-%d, adalah %d", index, array[index]);
//        } catch (ArrayIndexOutOfBoundsException exception_pesan){
//            System.out.println(exception_pesan);
//        }


        // Rungtime error jika file tidak ditemukan
//        try {
//            fileInput = new FileInputStream("input.txt");
//        } catch (IOException e) {
//            System.err.println(e);
//        }

        // Menggabungkan dua exception
        try {
            System.out.printf("index ke-%d\n", index, array[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("index yang anda masukan tidak sesuai dengan jumlah array");
        } catch (Exception e) {
            System.err.println("file tidak ditemukan");
        }

        // Finally
        System.out.println("========= Finally ==========");
        try {
            System.out.printf("index ke-%d\n", index, array[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("index yang anda masukan tidak sesuai dengan jumlah array");
        } finally {
            System.out.println("Finally");
        }


        System.out.println("Akhir dari program");



    }
}
