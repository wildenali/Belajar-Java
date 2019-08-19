package com.wildenali;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        String input;
        Scanner inputUser = new Scanner(System.in);

        System.out.print("Panggil nama: ");
        input = inputUser.next();

        // Ekspresinya berupa satuan (int, long, byte, short), String, atau enum
        switch (input){
            case "otong":
                System.out.println("Saya otong dan hadir Bos");
                break;
            case "ucup":
                System.out.println("Saya ucup dan hadir Bos");
                break;
            case "mario":
                System.out.println("Saya mario dan hadir Bos");
                break;
            default:
                System.out.println(input + " tidak hadir Bos");
        }

        System.out.println("Selesai program");

    }
}
