package com.wildenali;

import java.io.*;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {

        long waktuStart, waktuFinish;

        // Membaca dari File
        FileInputStream byteInput = new FileInputStream("input.txt");
        System.out.println(byteInput.available());  // Melihat berapa karakter nya

        // Menghitung waktu pembacaan
        waktuStart = System.nanoTime();
//        System.out.println(byteInput.readAllBytes());
        System.out.println(byteInput.read());
        waktuFinish = System.nanoTime();
        System.out.println("waktu = " + (waktuFinish - waktuStart));
        byteInput.close();

        // Membaca dari memory
        FileInputStream byteInput2 = new FileInputStream("input.txt");
        BufferedInputStream bufferedInput = new BufferedInputStream(byteInput2);

        bufferedInput.mark(200);
        // Menghitung waktu pembacaan
        waktuStart = System.nanoTime();
        System.out.println(bufferedInput.read());
        waktuFinish = System.nanoTime();
        System.out.println("waktu = " + (waktuFinish - waktuStart));

        // Baca ulang
        bufferedInput.reset();
        byte[] data = bufferedInput.read();
        String dataString = new String(data);
        System.out.println(dataString);
        bufferedInput.close();
        byteInput2.close();

        // Menulis dengan buffered output
        FileOutputStream byteOutput = new FileOutputStream("output.txt");
        BufferedInputStream bufferedOutput = new BufferedOutputStream(byteOutput);

        // Write data berupa byte
        bufferedOutput.write(data, 0, data.length);
        bufferedOutput.flush();
        bufferedOutput.close();
        byteOutput.close();


        // ini belum bener program nya, harus ganti versi java jre atau jdk nya nya




    }
}
