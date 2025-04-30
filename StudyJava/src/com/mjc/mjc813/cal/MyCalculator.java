package com.mjc.mjc813.cal;

//com.mjc.mjc813.cal.MyCalculator 클래스를 만든다.
//int myAdd(int a, int b) 라는 멤버메소드를 만든다.
//long myAdd(long a, long b) 라는 멤버메소드를 만든다.
//main 정적메소드에서 MyCalculator 를 인스턴스 객체로 생성한다. 이름은 예:mCal
//mCal 객체의 myAdd(10, 30)멤버메소드를 실행하여 40 결과를 화면에 출력한다.
//mCal 객체의 myAdd(123456789012345L, 98765432198765L)멤버메소드를 실행하여 결과를 화면에 출력한다.
//화면에 출력할때는 "두 수(a, b)의 값은 n 입니다." 출력하자. a, b, n 은 각 값을 출력

public class MyCalculator {
    public int myAdd(int a, int b) {
        return a + b;
    }


    public long myAdd(long a, long b) {
        return a + b;
    }

    public static void main(String[] args) {
        MyCalculator cal = new MyCalculator();

        int a1 = 10;
        int b1 = 30;
        int result1 = cal.myAdd(a1, b1);
        System.out.println("두 수(" + a1 + ", " + b1 + ")의 값은 " + result1 + " 입니다.");


        long a2 = 123456789012345L;
        long b2 = 98765432198765L;
        long result2 = cal.myAdd(a2, b2);
        System.out.println("두 수(" + a2 + ", " + b2 + ")의 값은 " + result2 + " 입니다.");
    }
}
