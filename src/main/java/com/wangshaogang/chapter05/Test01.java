package com.wangshaogang.chapter05;

public class Test01 {
    public static void main(String[] args) {
        new Rock();
        new Rock("wangshaogang");
    }
}

class Rock{
    Rock(){
        System.out.println("Thanks for creating me!");
    }
    Rock(String str){
        System.out.println("Thanks for creating " + str + "!");
    }
}
