package com.mjc.studyjava.MyMathMathic;

import java.util.ArrayList;

public class ThisIsJavaChap04Exam {
    public static void main(String[] args) {
        ThisIsJavaChap04Exam tij = new ThisIsJavaChap04Exam();
        System.out.println( "문제4:"+ tij.solve04());
        System.out.println("문제5: "+tij.solve05());
    }
    //  * 주사위 2개 던져서 합 5 만들기 : (1,4), (4,1), (2,3), (3,2) => {{}, {}, {}, {}}
    public String solve04() {
        String result = "";
        while( "".equals(result) ) {
            int dice01 = this.getRandomDice();
            int dice02 = this.getRandomDice();
            if(dice01 + dice02 == 5) {
                result = "(" + dice01 + "," + dice02 + ")";
                break;
            }
        }
        return result;
    }
    //  * 1~6까지의 랜덤한 숫자를 리턴한다.
    private int getRandomDice() {
        return (int)(Math.random() * 6);
    }

    //  4x + 5y = 60 이라는 x 값과 y 값이 해당하는 모든 x, y 항을 구해야 한다.
    // 4x + 5y = 60을 만족하는 모든 x, y 쌍을 출력한다.
    public String solve05() {
        ArrayList<int[]> result = new ArrayList<int[]>();

        for (int x = 1; x <= 10; x++) {
            for (int y = 1; y <= 10; y++) {
                if (4 * x + 5 * y == 60) {
                    result.add(new int[]{x, y});
                }
            }
        }
        String answer = "";
        for (int i = 0; i < result.size(); i++) {
            answer += this.getResultString(result.get(i));
        }
        return answer;
    }

    // 결과를 문자열로 변환
    private String getResultString(int[] result) {
        return "(" + result[0] + "," + result[1] + ") ";
    }
}
