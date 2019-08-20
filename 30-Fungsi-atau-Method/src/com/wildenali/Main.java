package com.wildenali;

public class Main {

    public static void main(String[] args) {

        int x, y;

        x = 5;
        y = hitung(x);
        System.out.println("x = " + x + ", y = " + y);

        x = 40;
        y = hitung(x);
        System.out.println("x = " + x + ", y = " + y);

        x = 55;
        y = hitung(x);
        System.out.println("x = " + x + ", y = " + y);



        System.out.println(simpel());

        fungsiVoid("apa pun");
        selamatPagi("Emak");
        selamatPagi("Abah");

    }

    // Fungi dengan Return
    public static int hitung(int input) {
        int hasil;

        hasil = input * input;
        return hasil;
    }

    // Fungi TANPA Return
    private static void selamatPagi(String nama) {
        System.out.println("Selamat pagi " + nama);
    }

    private static void fungsiVoid(String input) {
        System.out.println(input);
    }

    private static float simpel() {
        return 10.0f;
    }


}
