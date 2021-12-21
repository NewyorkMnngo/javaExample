package Example;

import java.util.Scanner;

public class Example016 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < tc; i++) {
            int max = 0;
            String[] list = sc.nextLine().split(" ");
            for (int k = 0; k < 10; k++) {
                if(Integer.parseInt(list[k])>max) {
                    max = Integer.parseInt(list[k]);
                }
            }
            System.out.println(max);
        }
        sc.close();
    }
}