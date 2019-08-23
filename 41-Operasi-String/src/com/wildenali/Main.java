package com.wildenali;

import java.util.Scanner;
import java.lang.String;

public class Main {

    public static void main(String[] args) {

        String kalimat = "Saya suka makan pisang";

        // Mengambil komponen dari string
        System.out.println("========== charAt ==========");
        System.out.println(kalimat.charAt(5));

        // SUBSTRING
        System.out.println("========== SUBSTRING ==========");
        String kata = kalimat.substring(10,15);
        System.out.println(kata);

        // CONCATENATION (Concat)
        System.out.println("========== CONCAT ==========");
        String kalimat2 = kata + " Cireng";
        System.out.println(kalimat2);

        kata = kata + " Cilok";
        System.out.println(kata);

        // CONCAT dengan NON STRING
        System.out.println("========== CONCAT NON STRING ==========");
        int jumlah = 20;
        String kalimat3 = kata + " " + jumlah;      // casting
        System.out.println(kalimat3);
        System.out.println(kata + " " + jumlah);

        // LOWERcase dan UPPERcase
        System.out.println("========== LOWERcase dan UPPERcase ==========");
        System.out.println(kalimat.toUpperCase());
        System.out.println(kalimat.toLowerCase());

        // REPLACE
        System.out.println("========== REPLACE ==========");
        String kalimat4 = kalimat.replace("pisang","combro");
        System.out.println(kalimat);
        System.out.println(kalimat4);

        // COMPARE, perlu penjelasannya
        System.out.println("========== COMPARE ==========");
        String motor1 = "royal enfield himalayan";
        String motor2 = "kawasaki w175";
        System.out.println(motor1.compareTo(motor2));       // hasilnya jadi 7,, WHYYYY??? karena ada tujuh step dari k, dari klmnopqr, dari k ke r ada 7 step
        System.out.println(motor2.compareTo(motor1));       // hasilnya jadi -7, karena dari r ke k ada -7 step, rqponmlk, dari r ke k

        String gorengan1 = "bakwan";
        String gorengan2 = "bakwin";
        System.out.println(gorengan1.compareTo(gorengan2)); // hasilnya jadi -8, lah kan sama, beda coy, jadi bakw nya sama, tapi yg gorengan1 bakwan, gorengan2 bakwin, nah bedanya pas di a dan i, jadi dari a ke i ada 8 step
        System.out.println(gorengan2.compareTo(gorengan1)); // hasilnya jadi 8

        // EQUALITY     (Persamaan)
        System.out.println("========== EQUALITY (Persamaan) ==========");
        // Untuk string yang di cek adalah address nya, jadi kalau address nya beda maka hasilnya akan FALSE
        // String kataInput = "test";
        String kataInput = new String("test");
        String kataTest = "test";
        System.out.println("Persamaan pada lokasi string pool");
        if (kataInput == kataTest) {
            System.out.println("Sama");
        } else {
            System.out.println("Tidak Sama");
        }

        Scanner userInput = new Scanner(System.in);
        System.out.print("\nMengambil input string dari user: ");
        kataInput = userInput.next();
        System.out.println("ini adalah input user: " + kataInput);

        if (kataInput.equals(kataTest)) {
            System.out.println("SAMA");
        } else {
            System.out.println("tidak SAMA");
        }


    }


}
