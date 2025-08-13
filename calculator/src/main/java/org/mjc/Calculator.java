package org.mjc;

public class Calculator {
    public int add(int a, int b) {
        return  a + b;
    }
    public int sub(int a, int b) {
        return  a - b;
    }
    public int mul(int a, int b) {
        return  a * b;
    }
    public int div(int a, int b) {
        return  a / b;
    }
    public long square(int a, byte b) {
        long result = 1;
        for (int i = 0; i < b; i++) {
            result *= a;
        }
        return result;
    }
    public int ary(int[] a) {
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.add(1, 2);
        calculator.sub(3, 2);
        calculator.mul(4, 2);
        calculator.div(6, 2);
        calculator.square(3, (byte) 2);
        calculator.ary(new int[]{1, 2, 3});

    }
}
