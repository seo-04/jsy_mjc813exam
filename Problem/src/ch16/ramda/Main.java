package ch16.ramda;

import ch17.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        NumProc np = new NumProc();
        np.printHuman((a, b) -> {
            System.out.printf("{%s} 님의 나이는 {%d} 입니다.\n", a, b);
        }, "홍길동", 30);
        np.printCar("그랜저", 7, (m, n) -> {
            System.out.printf("자동자 {%s} 의 년식은 {%d} 입니다.\n", m, n);
        });

        Long res = loopStatic((list) -> {
            long l = 0;
            for(Integer i : list) {
                l += i;
            }
            return l;
        });
        System.out.printf("합은 {%d} 입니다.\n", res);

        Long res2 = loopStatic((list) -> {
            long l = 0;
            for(Integer i : list) {
                l += i;
            }
            return l / list.size();
        });
        System.out.printf("평균은 {%d} 입니다.\n", res2);
    }

    public static Long loopStatic(IArrayProc iap) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(70);
        Long result = iap.process(list);

        Stream<Integer> ar = list.stream();
        IntStream is = ar.mapToInt((aaa) -> aaa + 2);
        int[] arr2 = is.toArray();

        int[] arr = list.stream()
                .mapToInt((aaa) -> aaa + 2)
                .toArray();

        int[] arr3 = list.parallelStream()
                .mapToInt((aaa) -> aaa + 2)
                .toArray();

        return result;
    }

    public static void StreamExample() {
        List<Product> list = new ArrayList<>();
        for( int i = 0; i < 10; i++ ) {
            Product p = new Product(i+1, "상품"+i, "회사", (int)(100000 * Math.random()));
            list.add(p);
        }
        list.stream().forEach(
                p -> System.out.println(p.toString())
        );
    }
}
