package Example;

import java.util.Scanner;

public class Example028 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int input = sc.nextInt();

        for(int k=1; k<=input; k++){
            if(input%k == 0){
                System.out.print(k + " ");
            }
        }

        sc.close();
    }
}
