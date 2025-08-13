package com.mjc.studyjava.MyMathMathic;

import java.math.BigDecimal;
import java.util.Random;

public class MyMathMathic {

    // 산술 연산
    public int add(int a, int b) { // 두수를 더한 결과 리턴
        return a + b;
    }

    public int sub(int a, int b) { // 두수를 뺀 결과 리턴
        return a - b;
    }

    public long mul(int a, int b) { // 두수를 곱한 결과 리턴
        return (long) a * b;
    }

    public int divM(int a, int b) { // 두수를 나눈 몫 결과 리턴
        if (b == 0) throw new ArithmeticException("0으로 나눌 수 없습니다.");
        return a / b;
    }

    public int divN(int a, int b) { // 두수를 나눈 나머지 결과 리턴
        if (b == 0) throw new ArithmeticException("0으로 나눌 수 없습니다.");
        return a % b;
    }

    // 비교 연산
    public boolean same(int a, int b) { // 두수가 같으면 true 리턴, 아니면 false
        return a == b;
    }

    public boolean same(String a, String b) { // 두 문자열이 같으면 true 리턴, 아니면 false
        if (a == null || b == null) return false;
        return a.equals(b);
    }

    public boolean notsame(int a, int b) { //  두수가 다르면 true 리턴, 아니면 false
        return a != b;
    }

    public boolean big(int a, int b) { // a가 b보다 크면 true 리턴, 아니면 false
        return a > b;
    }

    public boolean small(int a, int b) { //  a가 b보다 작으면 true 리턴, 아니면 false
        return a < b;
    }

    // 기타 연산
    public int shiftLeft(int a, byte b) { //  a를 b 만큼 왼쪽 시프트 결과 값을 리턴
        return a << b;
    }

    public int shiftRight(int a, byte b) { // a를 b 만큼 오른쪽 시프트(부호유지) 결과 값을 리턴
        return a >> b;
    }

    public int shiftRight0(int a, byte b) { // a를 b 만큼 오른쪽 시프트(부호를0으로) 결과 값을 리턴
        return a >>> b;
    }

    public long square(int a, byte b) { // a를 b만큼 제곱한 결과 값을 리턴, *= 이용하여 코딩하세요
        long result = 1;
        for (int i = 0; i < b; i++) {
            result *= a;
        }
        return result;
    }

    public int absolute(int a) { // a의 절대값을 리턴
        return Math.abs(a);
    }

    public String toHex(int a) { //  a 값을 16진수 문자열로 리턴
        return Integer.toHexString(a);
    }

    public String toBin(int a) { // a 값을 2진수 문자열로 리턴
        return Integer.toBinaryString(a);
    }

    public String toOct(int a) { //  a 값을 8진수 문자열로 리턴
        return Integer.toOctalString(a);
    }

    public int toDec(String a) { // a 문자열을 10진수 정수로 리턴
        return Integer.parseInt(a);
    }

    // 5/9 일
    // int 배열 array 의 평균값을 리턴한다
    public static int avg(int[] array) {
        if (array.length == 0) return 0;
        return sum(array) / array.length;

    }

    // int 배열 array 의 총합계값을 리턴한다.
    public static int sum(int[] array) {
        int total = 0;
        for (int num : array) {
            total += num;
        }
        return total;
    }

    //  int 배열 array 의 원소중에서 n의 배수인 값의 총합계값을 리턴한다.
    public static int sumOfNumber(int[] array, int number) {
        int total = 0;
        for (int num : array) {
            if (num % number == 0) {
                total += num;
            }
        }
        return total;
    }

    //  a부터 b 까지의 총합계값을 리턴한다. 루프제어를 사용한다.
    public static int sumOfLoop(int a, int b) {
        int total = 0;
        for (int i = 0; i <= b; i++) {
            total += b;
        }
        return total;
    }

    // a 부터 b 까지의 총합계값을 리턴한다. 재귀호출을 사용한다.
    public static int sumOfFav(int a, int b) {
        if (a > b) {
            return 0;
        }
        return a + sumOfFav(a + 1, b);
    }

//    BigDecimal getBigDecimal(int n, int s);	// 정수 n 값과 소수 s 값인 BigDecimal 데이터형을 리턴하세요
//    예를 들어 getBigDecimal(3643, 5630932);	// BigDecimal 3643.5630932 를 리턴
public BigDecimal getBigDecimal(int n, int s) {
    String decimalString = n + "." + s;
    return new BigDecimal(decimalString);
}

//    Integer[] getIntegerArray(int[] array);	// int[] 배열을 Integer[] 로 변환해서 리턴
public Integer[] getIntegerArray(int[] array) {
    if (array == null) return null;

    Integer[] result = new Integer[array.length];
    for (int i = 0; i < array.length; i++) {
        result[i] = array[i];
    }
    return result;
}

//    int[] makeRandomIntArray(int n); n 개의 랜덤한 int 값을 가지는 int[] 배열을 리턴
    public int[] makeRandomIntArray(int n){
        int[] re = new int[n];
        Random r = new Random();
        int[] result = new int[n];
        for (int i = 0; i < n; i++) {
            result[i] = r.nextInt();
        }
        return result;
    }
//    String makeEncryptString(String text, int n);	// text 문자열의 각 한 문자를 n 번째 배수 인덱스에 배치하는 랜덤 문자열을 리턴하세요.
//    랜덤문자열은 영문대문자, 영문소문자, 숫자 가능하다.
//    n 은 5이상 이어야 한다.
//    예를 들어 makeEncryptString("mjc813", 5);	=> A8dkIm8TkdjKLi9cu4Rs893sw1ksNm3
//        public String makeEncryptString(String text, int n){
//        if(text == null || n == null || n < 5){
//            return "";
//
//            Random r = new Random();
//
//        }
//        }
//    String makeDecryptString(String code, int n);	// code 문자열에서 n번째 배수 인덱스 문자를 뽑아서 하나의 문자열로 리턴하세요.
//    예를 들어 makeDecryptString("A8dkIm8TkdjKLi9cu4Rs893sw1ksNm3", 5);	=> mjc813
//    지금까지 만든 모든 메소드들에서 참조타입 매개변수의 값이 null 이면 기본데이터 값 0 또는 "" 또는 null 을 리턴하도록 수정하세요.
//        public String makeDecryptString(String code, int n){
//            if (code == null || n == null || n < 5) {
//                return "";
//            }
//        }
////```

        public static void main (String[]args){
            MyMathMathic math = new MyMathMathic();


            System.out.println("덧셈: " + math.add(10, 5));
            System.out.println("뺄셈: " + math.sub(10, 5));
            System.out.println("곱셈: " + math.mul(10, 5));
            System.out.println("몫: " + math.divM(10, 3));
            System.out.println("나머지: " + math.divN(10, 3));


            System.out.println("수: " + math.same(10, 10));
            System.out.println("문자열: " + math.same("hi", "hello"));
            System.out.println("두 수 다름: " + math.notsame(10, 5));
            System.out.println("큰 쪽: " + math.big(2, 1));
            System.out.println("작은 쪽: " + math.small(1, 2));


            System.out.println("왼쪽 시프트: " + math.shiftLeft(5, (byte) 2));
            System.out.println("오른쪽 시프트: " + math.shiftRight(20, (byte) 2));
            System.out.println("부호 0 오른쪽 시프트: " + math.shiftRight0(-8, (byte) 1));
            System.out.println("제곱: " + math.square(3, (byte) 4));
            System.out.println("절대값: " + math.absolute(-15));
            System.out.println("16진수: " + math.toHex(200));
            System.out.println("2진수: " + math.toBin(10));
            System.out.println("8진수: " + math.toOct(20));
            System.out.println("10진수: " + math.toDec("800"));

            int[] arr = {1, 2, 3, 4};

            System.out.println("평균: " + avg(arr));
            System.out.println("총 합계값: " + sum(arr));
            System.out.println("총 합계값 리턴: " + sumOfNumber(arr, 1));
            System.out.println("루프제어: " + sumOfLoop(1, 2));
//        System.out.println("재귀 호출: " + sumOfFav(1, 2));
        }
    }

