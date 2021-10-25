package Example;

import java.util.Scanner;

public class Example031 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int input = sc.nextInt();

        for (int k=0; k<=input; k++){
            System.out.print((input-k)+" ");
        }

        sc.close();
    }
}
