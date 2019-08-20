package com.wildenali;

import java.sql.SQLOutput;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        // Fungsi rekursive adalah fungsi yang memanggil fungsi dirinya sendiri

        Scanner userInput = new Scanner(System.in);
        System.out.print("Masukan nilai: ");
        int nilai = userInput.nextInt();
        System.out.println("Anda memasukan nilai = " + nilai);

        printNilai(nilai);
        int jumlah = jumlahNilai(nilai);
        System.out.println("Jumlah = " + jumlah);

        int faktorial = hitungFaktorial(nilai);
        System.out.println("Hasil Faktorial = " + faktorial);

    }

    // Fungsi Rekursif sederhana
    private static int hitungFaktorial(int parameter) {
        System.out.println("Parameter = " + parameter);
        if (parameter == 1) {
            return parameter;
        }
        return parameter * hitungFaktorial(parameter - 1);
    }

    private static int jumlahNilai(int parameter) {
        System.out.println("Parameter = " + parameter);
        if (parameter == 0) {
            return parameter;
        }
        return parameter + jumlahNilai(parameter - 1);
    }

    private static void printNilai(int parameter) {
        System.out.println("Nilai = " + parameter);
        if (parameter == 0) {
            return;
        }
        parameter--;
        printNilai(parameter);
    }


}
