package com.example.advanced;

import java.util.Scanner;

public class AdvancedHW2 {
    public static void main ( String[] args ) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("input A~Z:");
        String string = scanner.next();
        for(int i=string.length();i>0;i--){
            System.out.print(string.charAt(i-1));
        }
    }
}
