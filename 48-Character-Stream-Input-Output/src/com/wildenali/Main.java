package com.wildenali;

import com.sun.javaws.IconUtil;

import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        // ============= Buka File =============
        // byte stream -> FileInputStream
        // character stream -> FileReader
        FileInputStream byteFileInput = new FileInputStream("input.txt");
        FileReader      charFileInput = new FileReader("input.txt");

        FileOutputStream byteFileOutput = new FileOutputStream("outputByte.txt");
        FileWriter       charFileOutput = new FileWriter("outputChar.txt");

        // ============= Baca File =============
//        System.out.println((char)byteFileInput.read());
//        System.out.println((char)charFileInput.read());
//        System.out.println((char)byteFileInput.read());
//        System.out.println((char)charFileInput.read());

        // byte File
        int buffer = byteFileInput.read();
        while (buffer != -1) {
            System.out.print((char)buffer);
            byteFileOutput.write(buffer);
            buffer = byteFileInput.read();
        }

        System.out.println("\n\n");

        // char File
        buffer = charFileInput.read();
        while (buffer != -1) {
            System.out.print((char)buffer);
            charFileOutput.write(buffer);
            buffer = charFileInput.read();
        }

        // ============= Tutup File =============
        byteFileInput.close();
        charFileInput.close();
        byteFileOutput.close();
        charFileOutput.close();

    }
}
