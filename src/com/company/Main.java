package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader inputan = new BufferedReader(new InputStreamReader(System.in));
        String input;
        int bilangan = 0;
        int a = 1;
        int b = 1;
        int c;
        int i;
        System.out.print("input: ");
        try{
            input = inputan.readLine();
            bilangan = Integer.parseInt(input);
        }catch (NumberFormatException error){
            System.out.println("Eror");
        }
        System.out.print("Output: " + a + " " + b + " ");
        for (i = 0; i < bilangan -2; i++) {
            c = a + b;
            System.out.print(c + " ");
            a = b;
            b = c;
        }
        System.out.print(" ");
    }
}
