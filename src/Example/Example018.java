package Example;

import java.util.Scanner;

public class Example018 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        int result = 0;
        String [] list = input.split("");

        for(int k=0; k<list.length; k++) {

            result = result + Integer.parseInt(list[k]);
        }
        System.out.println(result);
        sc.close();
    }
}
