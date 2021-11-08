package Example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Example032 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int tc = Integer.parseInt(sc.nextLine());
        ArrayList<Integer> arr = new ArrayList<>();



        for (int k=0; k<tc; k++){
            int index = Integer.parseInt(sc.nextLine());

            arr.add(Integer.parseInt(Arrays.toString(sc.nextLine().split(" "))));

//            for (int i=0; i<arr.size(); i++){
//                System.out.println(arr.get(i));
//            }
            for(int i =0; i<arr.size(); i++){
                System.out.println("#"+index+ arr.get(i));
            }

        }


        sc.close();
    }
}
