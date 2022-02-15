package Example;

import java.util.Scanner;

public class Example021 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub


        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();

        char arr[] = input.toCharArray();

		/*for (int k = 0; k < arr.length; k++) {

			if (arr[k] >= 'a' && arr[k] <= 'z') {
				arr[k] = ((char) (arr[k] - 32));
			}
		}*/
        input = input.toUpperCase();

		/*for(int k=0; k<arr.length; k++) {
			System.out.print(arr[k]);
		}*/
        System.out.println(input);

        sc.close();


    }

}
