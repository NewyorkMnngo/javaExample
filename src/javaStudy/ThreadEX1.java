package javaStudy;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class ThreadEX1 {
    public static void main(String args[]){

        ThreadEx8_1 th1 = new ThreadEx8_1();
        ThreadEx8_2 th2 = new ThreadEx8_2();

        th2.setPriority(3);

        System.out.println("Priority of th1(-) : " + th1.getPriority());
        System.out.println("Priority of th2(|) : " + th2.getPriority());
        th1.start();
        th2.start();
    }
}
class ThreadEx8_1 extends Thread{
    public void run(){
       while (true){
           System.out.println("a");
       }
        }
    }

class ThreadEx8_2 extends Thread{
    public void run() {
        while (true) {
           System.out.println("b");
        }
    }
}
