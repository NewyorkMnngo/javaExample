package Example;

public class Example001 {
    public static void main(String[] args) {
        int year = 2004;

        if(year%2 == 0) {
            System.out.println(year + "는 짝수 해입니다.");
        } else {
            System.out.println(year + "는 홀수 해입니다.");
        }
        if(year%2 != 1) {
            System.out.println(year + "는 짝수 해입니다.");
        } else {
            System.out.println(year + "는 홀수 해입니다.");
        }
        //if(year%2 == 0?"짝수":"홀수")
        if((year%4==0&&year%100!=0)||year%400==0) {
            System.out.println(year + "는 윤년입니다.");
        }else {
            System.out.println(year + "는 윤년이 아닙니다.");
        }
    }
}
