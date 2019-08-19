package com.wildenali;

public class Main {

    public static void main(String[] args) {
	    // Operator komparasi ini akan menghasilkan nilai dalam bentuk boolean

        int a, b;
        boolean hasilKomparasi;

        // operator equal atau persamaan
        System.out.println("------PERSAMAAN------");
        a = 10;
        b = 10;
        hasilKomparasi = (a == b);
        System.out.printf("%d == %d --> %s \n", a, b, hasilKomparasi);

        a = 10;
        b = 11;
        hasilKomparasi = (a == b);
        System.out.printf("%d == %d --> %s \n", a, b, hasilKomparasi);

        // Operator not Equal atau PERTIDAKSAMAAN
        System.out.println("------PERTIDAKSAMAAN------");
        a = 5;
        b = 5;
        hasilKomparasi = (a != b);
        System.out.printf("%d != %d --> %s \n", a, b, hasilKomparasi);

        a = 6;
        b = 5;
        hasilKomparasi = (a != b);
        System.out.printf("%d != %d --> %s \n", a, b, hasilKomparasi);

        // Operator Less Than atau Kurang Dari
        System.out.println("------KURANG DARI------");
        a = 3;
        b = 5;
        hasilKomparasi = (a < b);
        System.out.printf("%d < %d --> %s \n", a, b, hasilKomparasi);

        a = 3;
        b = 2;
        hasilKomparasi = (a < b);
        System.out.printf("%d < %d --> %s \n", a, b, hasilKomparasi);

        // Operator Greater Than atau Lebih Dari
        System.out.println("------LEBIH DARI------");
        a = 3;
        b = 5;
        hasilKomparasi = (a > b);
        System.out.printf("%d > %d --> %s \n", a, b, hasilKomparasi);

        a = 3;
        b = 2;
        hasilKomparasi = (a > b);
        System.out.printf("%d > %d --> %s \n", a, b, hasilKomparasi);

        // Operator Less Than Equal atau Kurang Dari SamaDengan
        System.out.println("------KURANG DARI SAMA DENGAN------");
        a = 6;
        b = 5;
        hasilKomparasi = (a <= b);
        System.out.printf("%d <= %d --> %s \n", a, b, hasilKomparasi);

        a = 2;
        b = 2;
        hasilKomparasi = (a <= b);
        System.out.printf("%d <= %d --> %s \n", a, b, hasilKomparasi);

        // Operator Greater Than Equal atau Lebih Dari Sama Dengan
        System.out.println("------LEBIH DARI SAMA DENGAN------");
        a = 3;
        b = 5;
        hasilKomparasi = (a >= b);
        System.out.printf("%d >= %d --> %s \n", a, b, hasilKomparasi);

        a = 7;
        b = 7;
        hasilKomparasi = (a >= b);
        System.out.printf("%d >= %d --> %s \n", a, b, hasilKomparasi);

    }
}
