package com.mjc.studyjava.Computer;

public class Main {
    public static void main(String[] args) {
        Computer comp = new Computer("Samsung NT530", "Gen9_i7", "32GB", null);

        comp.printInfo();
        comp.clickMouseLeftButton(200, 400);
        comp.clickMouseRightButton(600, 800);
    }
}
