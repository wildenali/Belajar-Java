package com.wildenali;

public class Main {

    public static void main(String[] args) {

        // integer, byte, short, long, double, float, char, boolean

        // integer (satuan)
        int i = 2147483647;
        System.out.println("==========INTEGER==========");
        System.out.println("nilai integer i = " + i);
        System.out.println("nilai max = " + Integer.MAX_VALUE);
        System.out.println("nilai min = " + Integer.MIN_VALUE);
        System.out.println("Besar integer = " + Integer.BYTES + " bytes");
        System.out.println("Besar integer = " + Integer.SIZE + " bit");
        System.out.println("nilai integer maksimal 2147483647 + 1 maka hasilnya jadi begini = " + (i + 1));

        // byte (satuan)
        byte b = 127;
        System.out.println("==========BYTE==========");
        System.out.println("nilai Byte i = " + b);
        System.out.println("nilai max = " + Byte.MAX_VALUE);
        System.out.println("nilai min = " + Byte.MIN_VALUE);
        System.out.println("Besar Byte = " + Byte.BYTES + " bytes");
        System.out.println("Besar Byte = " + Byte.SIZE + " bit");

        // short (satuan)
        short s = 99;
        System.out.println("==========SHORT==========");
        System.out.println("nilai short s = " + s);
        System.out.println("nilai max = " + Short.MAX_VALUE);
        System.out.println("nilai min = " + Short.MIN_VALUE);
        System.out.println("Besar Short = " + Short.BYTES + " bytes");
        System.out.println("Besar Short = " + Short.SIZE + " bit");

        // long (satuan)
        long l  = 989;
        System.out.println("==========LONG==========");
        System.out.println("nilai Long l = " + l);
        System.out.println("nilai max = " + Long.MAX_VALUE);
        System.out.println("nilai min = " + Long.MIN_VALUE);
        System.out.println("Besar Long = " + Long.BYTES + " bytes");
        System.out.println("Besar Long = " + Long.SIZE + " bit");

        // double (koma koma an, bilangan real)
        double d  = 10.5d;
        System.out.println("==========DOUBLE==========");
        System.out.println("nilai Double d = " + d);
        System.out.println("nilai max = " + Double.MAX_VALUE);
        System.out.println("nilai min = " + Double.MIN_VALUE);
        System.out.println("Besar Double = " + Double.BYTES + " bytes");
        System.out.println("Besar Double = " + Double.SIZE + " bit");

        // float (koma koma an, bilangan real)
        float f  = -87.5f;
        System.out.println("==========FLOAT==========");
        System.out.println("nilai Float f = " + f);
        System.out.println("nilai max = " + Float.MAX_VALUE);
        System.out.println("nilai min = " + Float.MIN_VALUE);
        System.out.println("Besar Float = " + Float.BYTES + " bytes");
        System.out.println("Besar Float = " + Float.SIZE + " bit");

        // char (karakter berdasarkan ASCII)
        char c  = 'c';
        System.out.println("==========CHAR==========");
        System.out.println("nilai Char c = " + c);
        System.out.println("nilai max = " + Character.MAX_VALUE);
        System.out.println("nilai min = " + Character.MIN_VALUE);
        System.out.println("Besar Char = " + Character.BYTES + " bytes");
        System.out.println("Besar Char = " + Character.SIZE + " bit");

        // boolean (true atau false)
        boolean bol  = true;
        System.out.println("==========BOOLEAN==========");
        System.out.println("nilai Boolean bol = " + bol);
        System.out.println("nilai max = " + Boolean.TRUE);
        System.out.println("nilai min = " + Boolean.FALSE);



    }

}
