package Example;

import java.io.*;

public class snakeGame {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        System.out.println("Hello Goorm! Your input is " + input);

        String array[] = input.split(" ");
        int right = Integer.parseInt(array[1]);
        int bottom = Integer.parseInt(array[0]);
        int line = 1;
        while (line <= bottom) {
            if (line % 2 == 1) {
                for (int i = 0; i < right; i++) {
                    System.out.print("#");
                }
                System.out.println(" ");
                line++;
            }
            else if (line % 4 == 0) {
                System.out.print("#");
                for (int i = 0; i < right - 1; i++) {
                    System.out.print(".");
                }
                System.out.println(" ");
                line++;
            }
            else if (line % 4 == 2) {
                for (int i = 0; i < right - 1; i++) {
                    System.out.print(".");
                }
                System.out.print("#");
                System.out.println(" ");
                line++;
            }
        }
    }




}

