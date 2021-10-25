package Example;

import java.util.Scanner;

public class Example030 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int input = sc.nextInt();

        for(int k=1; k<=input; k++){

            double a = Math.pow(2,k);

            System.out.print((int)a+" ");


        }


        sc.close();
    }
}
