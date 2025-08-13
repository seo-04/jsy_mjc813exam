package com.mjc.studyjava;
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


    public static void main(String[] args) {
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
    }
}