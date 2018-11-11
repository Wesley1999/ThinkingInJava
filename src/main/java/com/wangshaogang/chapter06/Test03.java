// 方法访问权限
package com.wangshaogang.chapter06;
import com.wangshaogang.chapter06.testpackage.*;

public class Test03 {
    public static void main(String[] args) {
        Test03_2 test03_2 = new Test03_2();
        test03_2.fPublic();
        test03_2.f();
        test03_2.fProtected();
        // private不能访问
//        test03_2.fPrivate();
        System.out.println("---------------");

        Test03_3 test03_3 = new Test03_3();
        test03_3.fPublic();
        // 包访问权限无法访问
//        test03_3.f();
        // protected不能访问
//        test03_3.fProtected();
        // private不能访问
//        test03_3.fPrivate();

        System.out.println("---------------");
        Test03_2_2 test03_2_2 = new Test03_2_2();
        test03_2_2.fPublic();
        test03_2_2.f();
        test03_2_2.fProtected();
        // private不能访问
//        test03_2.fPrivate();
        System.out.println("---------------");
    }
}

class Test03_2 {
    // public
    public void fPublic() {
        System.out.println("fPublic()");
    }
    // 包访问权限
    void f() {
        System.out.println("f()");
    }
    // protected
    protected void fProtected() {
        System.out.println("fProtected()");
    }
    // private
    private void fPrivate() {
        System.out.println("fPrivate()");
    }
}

class Test03_2_2 extends Test03_2 {

}
