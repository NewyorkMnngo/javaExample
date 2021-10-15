package com.company;

import java.util.Scanner;

public class Example003 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("구구단을 구할 단을 구하세요 : ");
        int a = sc.nextInt();
        for(int k=1; k<10;k++) {
            System.out.println(a+" * "+k+" = "+a*k);
        }
    }

}
