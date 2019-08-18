package com.wildenali;

public class Main {

    public static void main(String[] args) {
        int variabel1 = 5;
        int variabel2 = 3;
        int hasil;
        float hasil_pecahan;

        // 1. Penjumlahan
        hasil = variabel1 + variabel2;
        System.out.println(variabel1 + " + " + variabel2 + " = " + hasil);

        // 2. Pengurangan
        hasil = variabel1 - variabel2;
        System.out.printf("%d - %d = %d \n", variabel1, variabel2, hasil);

        // 3. Perkalian
        hasil = variabel1 * variabel2;
        System.out.printf("%d x %d = %d \n", variabel1, variabel2, hasil);

        // 4. Pembagian
        hasil = variabel1 / variabel2;
        hasil_pecahan = (float) variabel1 / variabel2;
        System.out.printf("%d / %d = %d \n", variabel1, variabel2, hasil);
        System.out.printf("%d / %d = %f \n", variabel1, variabel2, hasil_pecahan);

        float a = 5;
        float b = 3;
        hasil_pecahan = a / b;
        System.out.printf("%f / %f = %.3f \n", a, b, hasil_pecahan);

        // 5. modulus
        hasil = variabel1 % variabel2;
        System.out.printf("sisa bagi dari %d %% %d = %d \n", variabel1, variabel2, hasil);


        // ================= Konversi Data =================
        System.out.println("\n================= Konversi Data =================");

        int nilaiInt = 450;     // 32 bit
        System.out.println("nilai int = " + nilaiInt);

        // Memperluas rentang ke tipe data yang lebih besar
        long nilaiLong = nilaiInt;
        System.out.println("nilai long = " + nilaiLong);

        // Memperluas rentang ke tipe data yang lebih besar
        byte nilaiByte = (byte)nilaiInt;
        System.out.println("nilai byte = " + nilaiByte);


    }
}
