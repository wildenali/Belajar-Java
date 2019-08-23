package com.wildenali;

import java.lang.StringBuilder;

public class Main {

    public static void main(String[] args) {

        // Membuat String Builder
        System.out.println("================== Membuat String Builder ==================");
        StringBuilder builder = new StringBuilder("halo");
        printData(builder);

        // Append
        System.out.println("================== Append ==================");
        builder.append(" semuanya");
        printData(builder);

        builder.append(" warga surabaya");
        printData(builder);

        // Insert
        System.out.println("================== Insert ==================");
        builder.insert(19, " Kota");
        printData(builder);

        // Delete
        System.out.println("================== Delete ==================");
        builder.delete(19, 24);
        printData(builder);

        // Change Character
        System.out.println("================== Change Character ==================");
        builder.setCharAt(14, 'W');
        printData(builder);

        // Replace
        System.out.println("================== Replace ==================");
        builder.replace(20, 28, "Bandung");
        printData(builder);

        // Casting menjadi String
        System.out.println("================== Casting menjadi String ==================");
        String kalimat = builder.toString();
        System.out.println(kalimat);
        int addressString = System.identityHashCode(kalimat);
        System.out.println("address = " + Integer.toHexString(addressString));



    }

    public static void printData(StringBuilder dataBuilder) {
        System.out.println("data = " + dataBuilder);
        System.out.println("panjang = " + dataBuilder.length());
        System.out.println("kapasitas = " + dataBuilder.capacity());

        int addressBuilder = System.identityHashCode(dataBuilder);
        System.out.println("address = " + Integer.toHexString(addressBuilder));
    }

}
