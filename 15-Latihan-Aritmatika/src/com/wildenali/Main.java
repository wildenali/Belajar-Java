package com.wildenali;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // Menghitung LUAS
        // luas = panjang * lebar;
        Scanner userInput = new Scanner(System.in);
        int panjang, lebar, luas, tinggi, volume;

        System.out.println("Menghitung Luas");
        System.out.print("Panjang = ");
        panjang = userInput.nextInt();

        System.out.print("Lebar = ");
        lebar = userInput.nextInt();

        luas = panjang * lebar;
        System.out.println("Luas = " + luas);

        System.out.println("\nMenghitung Volume");
        System.out.print("tinggi = ");
        tinggi = userInput.nextInt();
        volume = luas*tinggi;
        System.out.println("volume = " + volume);


    }
}
