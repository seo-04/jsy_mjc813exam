package ch17.problem;

import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
    Computer[] computers ={
            new Computer(1000,3),
            new Computer(2000,4),
            new Computer(3000,5),
            new Computer(3000,1),
            new Computer(4000,8),
    };
//        객체배열의 stream() 을 이용하여 Computer 객체의 재고 총 금액을 계산하세요. 모든 배열 원소들의 price * qty 의 합계금액이다.
//                - 객체배열의 stream() 을 이용하여 cpu 가 가장 낮은 Computer 객체의 재고 수량이 몇개인지 계산하세요
        int total = Arrays.stream(computers).mapToInt(computer->computer.getPrice()*computer.getQty()).sum();
        System.out.println("합계금액:"+total+"원");

        int lower= Arrays.stream(computers).min(Comparator.comparingInt(Computer::getPrice)).map(Computer::getQty).orElse(0);
        System.out.println("가장 낮은 재고수량:"+lower);

//    객체배열의 stream() 을 이용하여 연락처 사람의 평균 나이를 계산한다.
    Contact[] contacts = {
        new Contact(20),
        new Contact(21),
        new Contact(22),
        new Contact(23),
        new Contact(24),
    };
    double avg = Arrays.stream(contacts)
            .mapToInt(Contact::getAge)
            .average()
            .orElse(0);
        System.out.println("평균나이:"+avg+"세");
    }
}
