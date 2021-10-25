package com.company;

import java.util.Scanner;

public class Example006 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String [] input = sc.nextLine().split(" ");


        System.out.println(Integer.parseInt(input[0])+Integer.parseInt(input[1]));
        System.out.println(Integer.parseInt(input[0])-Integer.parseInt(input[1]));
        System.out.println(Integer.parseInt(input[0])*Integer.parseInt(input[1]));
        System.out.println(Integer.parseInt(input[0])/Integer.parseInt(input[1]));


    }
}
