package Example;
import java.util.Scanner;

public class Example024 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        Scanner sc = new Scanner(System.in);



        int tc =  Integer.parseInt(sc.nextLine());

        for(int k=1;k<=tc; k++) {
            String input = sc.nextLine();

            String[] str = input.split(" ");

            int input1 = Integer.parseInt(str[0]);
            int input2 = Integer.parseInt(str[1]);

            int num1 = input1/input2;
            int num2 =  input1%input2;




            System.out.println("#"+k+" "+num1+" "+num2);
        }
        sc.close();

    }

}
