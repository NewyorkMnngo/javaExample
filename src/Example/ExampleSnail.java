package Example;

import java.util.Scanner;

public class ExampleSnail {
    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

        draw(sc.nextInt());
    }

    private static void draw(int size) {

        int input = size;
        int i, j, m, n;
        int cnt = 1;
        int right = 0, bottom = -1, top = 1;
        int[][] snailArr = new int[size][size];  //저장할 2차원 배열 생성

        for(i=input; i>=0; i--) {

            for(j=0; j<input; j++) {            //초기에는 (0,0)에서 시작해서 (0,input-1)까지 간다.
                bottom = bottom + top;          //(right, bottom) 값 조정, bottom 값만 1씩 증가
                snailArr[right][bottom] = cnt;  //2차원 배열에 cnt 값 저장
                cnt++;                          // cnt값 1씩 증가
            }

            input--;                            // 내려갈때는 size-1 을 가야하므로 input --를 해준다

            for(j=0; j<input; j++) {            // size-1 만큼 아래로 내려가면서
                right = right + top;            //(right, bottom) 값 조정, right 값만 1씩 증가
                snailArr[right][bottom] = cnt;  // 2차원 배열에 cnt 값 저장
                cnt++;                          // cnt값 1씩 증가
            }

            top = top*(-1);                     //방향을 반대방향으로 전환
        }

        for(m=0; m<size; m++) {                             // 출력문
            for(n=0; n<size; n++) {                         //(0, n+1)
                System.out.print(snailArr[m][n] + "\t");   // \t = tab키 한번 눌러주기
            }
            System.out.println("");
        }
        System.out.println("");
    }

}





