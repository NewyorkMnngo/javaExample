package Example;

import java.io.IOException;
import java.util.Scanner;

public class ExampleException002 {
    public static void main(String[] args)throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.print("첫 번째 수를 입력하시오 : ");
        int a = sc.nextInt();
        System.out.print("계산할 연산자를 입력하시오 : ");
        char op = (char)System.in.read();
        System.out.print("두 번째 수를 입력하시오 : ");
        int b = sc.nextInt();
        int c = 0;
        if(op=='+'){
            c=a+b;
        }
        else if ((int)op==45) {
            c=a-b;
        }
        else if ((int)op==42) {
            c=a*b;
        }
        else if ((int)op==47) {
            c=a/b;
        }
        else if ((int)op==37) {
            c=a%b;
        }
        System.out.println(a+" "+op+" "+b+" = "+c);
    }
}
