package com.mjc.studyjava.Computer;

public class Computer {
    private String name;
    private String CPU;
    private String RAM;
    private String storage;
    private String graphic;
    private Mouse mouse;

    // 네 번째 비기본 생성자
    public Computer(String name, String CPU, String RAM, String storage) {
        this.name = name;
        this.CPU = CPU;
        this.RAM = RAM;
        this.storage = storage;
        this.graphic = null;
        this.mouse = new Mouse();
    }

    // 다섯 번째 비기본 생성자
    public Computer(String name, String CPU, String RAM, String storage, String graphic) {
        this.name = name;
        this.CPU = CPU;
        this.RAM = RAM;
        this.storage = storage;
        this.graphic = graphic;
        this.mouse = new Mouse();
    }

    // 컴퓨터 정보 출력
    public void printInfo() {
        System.out.println("이름 : " + (name != null ? name : "조립중입니다"));
        System.out.println("CPU : " + (CPU != null ? CPU : "조립중입니다"));
        System.out.println("RAM : " + (RAM != null ? RAM : "조립중입니다"));
        System.out.println("Storage : " + (storage != null ? storage : "조립중입니다"));
        System.out.println("Graphic : " + (graphic != null ? graphic : "조립중입니다"));
    }

    // 마우스를 좌표로 이동 후 왼쪽 버튼 클릭
    public void clickMouseLeftButton(int x, int y) {
        mouse.moveMouse(x, y);
        mouse.clickLeftButton();
    }

    // 마우스를 좌표로 이동 후 오른쪽 버튼 클릭
    public void clickMouseRightButton(int x, int y) {
        mouse.moveMouse(x, y);
        mouse.clickRightButton();
    }
}