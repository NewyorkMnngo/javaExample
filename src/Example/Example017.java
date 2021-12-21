package Example;

import java.util.Scanner;

public class Example017 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = Integer.parseInt(sc.nextLine());
        String blank;
        for (int i = 0; i < tc; i++) {
            String[] list = sc.nextLine().split(" ");
            for (int k = 0; k < list.length - 1; k++) {

                if (Integer.parseInt(list[k]) > Integer.parseInt(list[k + 1])) {
                    blank = list[k];
                    list[k] = list[k + 1];
                    list[k + 1] = blank;
                }
            }
            System.out.println(list[tc / 2]);
        }
        sc.close();
    }
}