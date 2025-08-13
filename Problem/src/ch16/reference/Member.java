package ch16.reference;

public class Member {
    private String id;
    private String name;
    public Member(String id, String name) {
        this.id = id;
        this.name = name;
        System.out.println("Member(String id)");
    }
   
}
