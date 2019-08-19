package com.wildenali;

public class Main {

    public static void main(String[] args) {

        System.out.println("=========== Awal Program - While Loop ===========");
        /*
        while (kondisi){
            aksi
        }
         */
        int a = 0;
        boolean kondisi = true;

        while (kondisi){
            System.out.println("while loop ke- " + a);

            if (a == 10){
                kondisi = false;
            }
            a++;
        }

        System.out.println("----------- Akhir Program - While Loop -----------");

        System.out.println("=========== Awal Program - Do While Loop ===========");
        /*
        do {
            aksi
        } while (kondisi);
         */
        int b = 0;
        boolean kondisi_b = true;

        do {
            b++;
            System.out.println("do while loop ke- " + b);

            if (b == 5){
                kondisi_b = false;
            }

        } while(kondisi_b);

        System.out.println("=========== Akhir Program - Do While Loop ===========");

        System.out.println("=========== Awal Program - For Loop ===========");
        /*
        for (inisialisasi; kondisi; step nilai){
            aksi;
        }
         */
        System.out.println("Tipe Loop Pertama");
        for (int nilai = 0; nilai <= 10; nilai++){
            System.out.println("for loop ke- " + nilai);
        }

        System.out.println("Tipe Loop Kedua");
        for (int nilai = 0; nilai < 10; nilai++){
            System.out.println("for loop ke- " + nilai);
        }

        System.out.println("Tipe Loop Ketiga");
        for (int nilai = 10; nilai >= 5; nilai--){
            System.out.println("for loop ke- " + nilai);
        }

        System.out.println("Tipe Loop Keempat");
        int nilai_nih = 0;
        for (; nilai_nih < 10;){
            System.out.println("for loop ke- " + nilai_nih);
            nilai_nih++;
        }

        System.out.println("=========== Akhir Program - For Loop ===========");

    }
}
