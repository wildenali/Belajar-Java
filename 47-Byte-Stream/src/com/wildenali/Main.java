package com.wildenali;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

        /*
        FileInputStream fileInput = null;

        System.out.println("file input bernilai  = " + fileInput);

        fileInput = new FileInputStream("input.txt");
        System.out.println("file input bernilai  = " + fileInput);
        fileInput.close();      // biar kosong dulu baru di isi sama bawahnya, biar ga ada masalah lah

        fileInput = new FileInputStream("input2.txt");
        System.out.println("file input bernilai  = " + fileInput);
        fileInput.close();
         */

        FileInputStream fileInput = null;

        // Buka File
        fileInput = new FileInputStream("input.txt");

//        System.out.println(fileInput.read());       // hasilnya menjadi 105, karena diambil sesuai dengan karakter nilainya, karena 105 adalah i
//        System.out.println(fileInput.read());       // hasilnya menjadi 110                                                , kareana 110 adalah n
//        System.out.println(fileInput.read());       // hasilnya menjadi 105                                                , kareana 110 adalah i

        // Baca File
        int data = fileInput.read();
        // while (true) {
        while (data != -1) {
            System.out.println((char)data);
            data = fileInput.read();
        }

        // Tutup File
        fileInput.close();


        // FileOutput
        FileOutputStream fileOutput = null;

        try {
            // Buka File
            fileInput = new FileInputStream("input2.txt");
            fileOutput = new FileOutputStream("output2.txt");

//            // Baca File
//            int buffer = fileInput.read();
//
//            // Tulis file
//            fileOutput.write(buffer);
//
//            // Baca File
//            buffer = fileInput.read();
//
//            // Tulis file
//            fileOutput.write(buffer);
            int buffer = fileInput.read();
            while (buffer != -1) {
                fileOutput.write(buffer);
                buffer = fileInput.read();
            }


        } finally {
            if (fileInput != null) {
                fileInput.close();
            }

            if (fileOutput != null) {
                fileInput.close();
            }
        }


        // Contoh yg Terakhir (try with resources)

        try (
                FileInputStream in = new FileInputStream("input.txt");
                FileOutputStream out = new FileOutputStream("output2.txt");
                ) {
            // Baca File
            int data2 = in.read();

            while (data2 != -1) {
                System.out.print((char) data2);
                out.write((char) data2);
                data2 = in.read();
            }
        }


    }
}
