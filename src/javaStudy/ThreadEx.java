package javaStudy;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import  java.awt.*;
public class ThreadEx extends Thread{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        new Thread(new Runnable() {
            @Override
            public void run() {
                String word = sc.nextLine();
                System.out.println(word);
            }
        }).start();

        new Thread(() -> {
            while (true) {
                SimpleDateFormat format1 = new SimpleDateFormat( "yyyy-MM-dd HH:mm:ss");
                Date time = new Date();
                String time1 = format1.format(time);
                System.out.println(time1);
                try {
                    Thread.sleep(5000);
                } catch (Exception e){}
            }
        }).start();

        System.out.println(Thread.currentThread());
    }
}
