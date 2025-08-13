package ch19.talk;

import java.io.IOException;
import java.net.ServerSocket;
import java.util.Scanner;

public class ClientApp {
    private static ServerSocket serverSoket = null;
    public static void main(String[] args) {
        System.out.println("==========================");
        System.out.println("1.대화명변경, 2.방목록보기, 3.방입장, 4.방만들기, 5.종료");
        System.out.println("==========================");


        Scanner sc = new Scanner(System.in);
        while(true){
            int number = sc.nextInt();
            if(number == 1){
                break;
            }
        }
        sc.close();
    }

    public static void startServer(){
        Thread thred = new Thread(){
            @Override
            public void run(){
                try{
                    ServerSocket serverSoket = new ServerSocket(50001);
                    System.out.println("");
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        };
    }
}
