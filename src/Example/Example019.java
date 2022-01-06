package Example;

import java.util.Scanner;

public class Example019 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int tc = Integer.parseInt(sc.nextLine());
        for (int i = 1; i <= tc; i++) {
            String[] list = sc.nextLine().split("");
            int c = Integer.parseInt(list[0]) * 1000 + Integer.parseInt(list[1]) * 100 + Integer.parseInt(list[2]) * 10
                    + Integer.parseInt(list[3]);
            int a = Integer.parseInt(list[4]) * 10 + Integer.parseInt(list[5]);
            int b = Integer.parseInt(list[6]) * 10 + Integer.parseInt(list[7]);
            int error = -1;

            if ((a == 1) || (a == 3) || (a == 5) || (a == 7) || (a == 8) || (a == 10) || (a == 12)) {
                if ((b <= 31)) {
                    System.out.println("#" + i + " " + c + "/" + a + "/" + b);
                } else {
                    System.out.println("#" + i + "  " + error);
                }

            } else if ((a == 2)) {
                if (b <= 28) {
                    System.out.println("#" + i + " " + c + "/" + a + "/" + b);
                } else {
                    System.out.println("#" + i + "  " + error);
                }

            } else if ((a == 4) || (a == 6) || (a == 9) || (a == 11)) {
                if (b <= 30) {
                    System.out.println("#" + i + " " + c + "/" + a + "/" + b);
                }
            } else {
                System.out.println("#" + i + "  " + error);
            }

        }
        sc.close();
    }

}
