package com.company;

import java.util.Scanner;

public class Example005 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = Integer.parseInt(sc.nextLine());

        System.out.println(input *(input + 1)/2);



        sc.close();
    }
}
