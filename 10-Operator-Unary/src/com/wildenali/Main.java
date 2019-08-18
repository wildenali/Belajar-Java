package com.wildenali;

public class Main {

    public static void main(String[] args) {
	    // unary adalah operasi yang dilakukan pada satu variabel
        // Unary Operator ++ --

        // Unary + dan -
        int angka = 1;
        System.out.printf("unary '+', %d menjadi %d\n", angka, +angka);
        System.out.printf("unary '-', %d menjadi %d\n", angka, -angka);

        // Unary decrement dan increment
        int angka2 = 10;
        angka2++;
        System.out.println("Nilai dengan '++', menjadi = " + angka2);

        int angka3 = 10;
        angka3--;
        System.out.println("Nilai dengan '--', menjadi = " + angka3);

        int a = 5;
        System.out.printf("Nilai dengan '++' prefix menjadi  = %d \n", ++a);
        System.out.printf("Nilai hasil dari postfix menjadi  = %d \n", a);

        int b = 5;
        System.out.printf("Nilai dengan '++' postfix menjadi  = %d \n", b++);
        System.out.printf("Nilai hasil dari postfix menjadi  = %d \n", b);


        // Unary boolean dengan ! untuk negasi
        boolean ucup = true;
        System.out.println("nilai boolean = " + ucup);
        System.out.println("nilai boolean = " + !ucup);
    }
}
