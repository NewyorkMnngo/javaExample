package javaStudy;

import com.sun.tools.javac.Main;

import java.util.Scanner;

public class ReverseEx {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        String [] arr = {"i","ii","iii","iv","v","vi","vii","viii","ix","x"};
        String [] arr1 = {"1", "2", "3","4" , "5", "6", "7" ,"8" ,"9" ,"10"};
        String input = sc.nextLine();

        for (int i=0; i<arr.length; i++){
            if(input == arr[i]){
                arr[i] = arr1 [i];
                System.out.println(Integer.parseInt(arr[i]));
            }else{

            }
        }
    }




}
