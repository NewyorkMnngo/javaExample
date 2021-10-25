package Example;

import java.util.Scanner;

public class Example029 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String [] input = sc.nextLine().split(" ");

        int a = Integer.parseInt(input[0]);
        int b = Integer.parseInt(input[1]);

        if(a==1&&b==2){
            System.out.println("B");
        }
        else if (a==1&&b==3){
            System.out.println("A");
        }
        else if(a==2&&b==1){
            System.out.println("B");
        }
        else if (a==2&&b==3){
            System.out.println("A");
        }
        else if(a==3&&b==1){
            System.out.println("B");
        }
        else if(a==3&&b==2){
            System.out.println("A");
        }
        else{
            System.out.println("잘못 입력하셨습니다.");
        }

    }
}


