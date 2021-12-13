package Example;

public class Example004 {
    public static void main(String[] args) {

        String str = "Hi, my name is kim. My git is Newyorkmango. Thank you";

        int[] arr = new int[26];

        for(int k=0; k<str.length(); k++){
            char c  =str.charAt(k);

            //소문자 조건문

            if('a'<=c&&c<='z'){
                arr[c-97]++;
            }
            
            //대문자 조건문
            if('A'<=c&&c<='Z'){
                arr[c-65]++;
            }
        }
        for(int k=0; k<arr.length; k++){
            System.out.println((char)(k+65)+" : " + arr[k]);
        }
    }
}
