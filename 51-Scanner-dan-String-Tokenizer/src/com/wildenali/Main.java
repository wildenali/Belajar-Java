package com.wildenali;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

//        Scanner inputUser = new Scanner(System.in);
//
//        String input = inputUser.next();
//        System.out.println(input);
//
//        input = inputUser.next();
//        System.out.println("kata kedua " + input);

        FileReader fileInput = new FileReader("input.txt");
        BufferedReader bufferedReader = new BufferedReader(fileInput);
        //System.out.println((char)bufferedReader.read());

        Scanner scanner = new Scanner(bufferedReader);
        // Cek ada kata selanjutnya atau tidak, hasilnya ini true
        System.out.println(scanner.hasNext());

        // untuk membaca kata, dengan pemisah/delimeter spasi
        System.out.println(scanner.next());
        System.out.println(scanner.next());
        System.out.println(scanner.next());

        // Cek ada kata selanjutnya atau tidak, hasilnya ini false, karena udah abis
        System.out.println(scanner.hasNext());


        // Menggunakan delimiter tertentu (bisa koma, titik, dan lain-lainnya yang penting konsisten)
        FileReader fileInput2 = new FileReader("input2.txt");
        bufferedReader = new BufferedReader(fileInput2);
        bufferedReader.mark(200);

        scanner = new Scanner(bufferedReader);
        scanner.useDelimiter(",");
        while (scanner.hasNext()) {
            System.out.println(scanner.next());
        }

        // Menggunakan String Tokenizer
        bufferedReader.reset();
        String data = bufferedReader.readLine();
        System.out.println(data);

        StringTokenizer stringToken = new StringTokenizer(data,",");

        while (stringToken.hasMoreTokens()) {
            System.out.println(stringToken.nextToken());
        }

        // Baris yang kedua
        data = bufferedReader.readLine();
        System.out.println(data);

        stringToken = new StringTokenizer(data,",");

        while (stringToken.hasMoreTokens()){
            System.out.println(stringToken.nextToken());
        }

    }
}
