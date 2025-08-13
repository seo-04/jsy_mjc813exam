package com.mjc.studyjava.Animal;

public class Animal {
    private  String name;
    private int age;

    public Animal() {
        this.name = name;
        this.age = age;
    }

    public void eat(Object feed){
        System.out.println(name + "은" + feed + "를 먹는다");
    }
    public void sleep(){
        System.out.println(name + "잔다");
    }
    public void move(){
        System.out.println(name + "이동한다");
    }
    public Animal reproduce(String newName){
        name = newName;
        return this;
    }
}
