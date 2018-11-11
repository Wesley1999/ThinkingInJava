package com.wangshaogang.chapter02;

public class Test0 {
    public static void main(String[] args){
        String a = "This is a String";
        String b = "This is a String";
        System.out.println(a == b);

        String c = a;
        System.out.println(a == c);
        System.out.println(b == c);

        String d = new String("This is a String");
        String e = new String("This is a String");
        System.out.println(d == e);

        String f = new String(a);
        System.out.println(a == f);

        String g = d;
        System.out.println(g == d);

//        a = e;
//        System.out.println(a == e);

    }

}