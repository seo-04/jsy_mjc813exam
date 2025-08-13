package Programmers;

public class comparison {
    public int solution(int a, int b) {
        int m  = Integer.valueOf((String.valueOf(a) + String.valueOf(b)));
        int mul = 2*a*b;
        return Math.min(m, mul);
    }

    public static void main(String[] args) {
        comparison com = new comparison();
        int result = com.solution(2, 4);
        System.out.println(result);
    }
}
