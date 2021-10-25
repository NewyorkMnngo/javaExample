package Example;

import java.util.Scanner;

public class ExampleException001 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("성적을 입력하세요 : ");
        int a = sc.nextInt();
        if(a>=90) {
            System.out.println("A 학점입니다.");
        }
        else if(a>=80) {
            System.out.println("B 학점입니다.");
        }
        else if(a>=70) {
            System.out.println("C 학점입니다.");
        }
        else if(a>=60) {
            System.out.println("D 학점입니다.");
        }
        else {
            System.out.println("F 학점입니다.");
        }
    }


}
