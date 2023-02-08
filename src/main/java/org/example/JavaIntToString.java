package org.example;

import java.util.Scanner;

public class JavaIntToString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = String.valueOf(n);
        if (str.matches("-?\\d+")) {
            System.out.println("Good job");
        } else {
            System.out.println("Wrong answer");
        }
    }
}
