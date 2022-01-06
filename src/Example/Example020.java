package Example;

import java.util.Scanner;

public class Example020 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();


        char[] arr = input.toCharArray();

        for (int k = 0; k < arr.length; k++) {

            if (arr[k] >= 'a' && arr[k] <= 'z') {
                arr[k] = ((char) (arr[k] - 32));
            }
        }

        for(int k=0; k<arr.length; k++) {
            System.out.print(((int)arr[k])-64+" ");
        }

        //System.out.println(sb.toString());
        sc.close();

    }

}
