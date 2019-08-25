package com.wildenali;

import java.io.FileInputStream;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

        FileInputStream fileInput = null;

        System.out.println("file input bernilai  = " + fileInput);

        fileInput = new FileInputStream("input.txt" + fileInput);


    }
}
