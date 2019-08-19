package com.wildenali;

public class Main {

    public static void main(String[] args) {

        // break, continue dan return

        int a = 0;

        while (true){
            a++;
//            if (a == 10){
//                break;
//            } else if (a == 5){
//                continue;
//            } else if (a == 7){
//                return;
//            }

            // coba seperti ini
            if (a == 10){
                break;
            } else if (a == 5){
                continue;
            } else if (a == 18){
                return;
            }

            System.out.println("looping ke - " + a);
        }

        System.out.println("Selesai looping............");

    }
}
