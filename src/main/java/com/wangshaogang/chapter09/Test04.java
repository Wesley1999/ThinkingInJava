/**
 * 实现多个接口
 *
 * @author 王少刚
 * @create 2018-10-18 16:41
 */
package com.wangshaogang.chapter09;

public class Test04 {
    static void t(Test04_CanFight canFight) {canFight.fight();}
    static void u(Test04_CanSwim canSwim) {canSwim.swim();}
    static void v(Test04_CanFly canFly) {canFly.fly();}
    static void w(Test04_Action action) {action.fight();}

    public static void main(String[] args) {
        Test04_Hero hero = new Test04_Hero();
        // 支持向上转型
        t(hero);
        u(hero);
        v(hero);
        w(hero);
    }

}

interface Test04_CanFight {
    void fight();
}

interface Test04_CanSwim {
    void swim();
}

interface Test04_CanFly {
    void fly();
}

class Test04_Action implements Test04_CanFight {
    public void fight() {}
}

// 接口中所有的方法都要实现，除非已经在基类中实现
class Test04_Hero extends Test04_Action implements Test04_CanFly, Test04_CanSwim {
    public void swim() {}
    public void fly() {}
}

