package com.wildenali;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        // a operator b
        Scanner inputUser;
        float a, b, hasil;
        char operator;

        inputUser = new Scanner(System.in);

        System.out.print("nilai a = ");
        a = inputUser.nextFloat();

        System.out.print("operator = ");
        operator = inputUser.next().charAt(0);

        System.out.print("nilai b = ");
        b = inputUser.nextFloat();

        System.out.println("input user: " + a + " " + operator + " " + b);

        // Operator tersedia * / + -
        if (operator == '+'){
            hasil = a + b;
            System.out.println("Hasil = " + hasil);
        } else if (operator == '-'){
            hasil = a - b;
            System.out.println("Hasil = " + hasil);
        } else if (operator == '*'){
            hasil = a * b;
            System.out.println("Hasil = " + hasil);
        } else if (operator == '/'){
            if (b == 0){
                System.out.println("Pembagi nol menghasilkan tak hingga");
            } else{
                hasil = a / b;
                System.out.println("Hasil = " + hasil);
            }
        } else {
            System.out.println("Operator salah, hanya bisa + atau - atau * atau /");
        }



    }
}
