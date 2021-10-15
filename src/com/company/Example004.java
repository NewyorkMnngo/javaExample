package com.company;

import java.util.Scanner;

public class Example004 {
    public static void main(String[] args) {
// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        int a = 0;
        for(int k=1; k<6; k++) {
            System.out.print("추가로 더할 숫자를 입력하세요 : ");
            int b = sc.nextInt();
            a = a + b;
            System.out.println(k+"번째로 추가로 더해진 값 : "+a);
        }
    }
}
