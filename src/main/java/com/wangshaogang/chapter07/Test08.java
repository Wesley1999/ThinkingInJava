// 向上转型
// 参数为基类对象，同样可以接受导出类对象
package com.wangshaogang.chapter07;

public class Test08 {

}

class Instrument {
    static void play (Instrument instrument) {
        System.out.println("Play Instrument.");
    }
}

class Violin extends Instrument {
    public static void main(String[] args) {
        Violin violin = new Violin();
        Instrument.play(violin);
        System.out.println(violin);
        System.out.println((Instrument) violin);
    }
}