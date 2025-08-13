package ch13.Hash;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();

        set.add("Java");
        set.add("JDBC");
        set.add("JSP");
        set.add("Java");
        set.add("Spring");

        // 갹체를 하나씩 가져와서 처리
        Iterator<String > iterator = set.iterator();
        while (iterator.hasNext()) {
            String element = iterator.next();
            System.out.println(element);
            if(element.equals("JSP")){
                iterator.remove();
            }
        }
        System.out.println();

        set.remove("JDBC");
        for (String element : set) {
            System.out.println(element);
        }
        int size = set.size();
        System.out.println("총 객체 수:"+size);


        int Member = 0;
        Set<Member> set2 = new HashSet<>(Member);
        set2.add(new Member("홍길동", 30));
        set2.add(new Member("홍길동", 30));

        System.out.println("총 객체 수:" + set2.size());

    }
}
