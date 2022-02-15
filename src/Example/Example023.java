package Example;

import java.util.Scanner;

public class Example023 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub


        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();

        String[] str = input.split(" ");

        int input1 = Integer.parseInt(str[0]);
        int input2 = Integer.parseInt(str[1]);

        if((input1>=0 && input1<=999) && (input2>=0 && input2<=999)) {
            if(input1>input2) {
                System.out.println((input1-input2) + 1 );
            }
        }


        sc.close();
    }

}
