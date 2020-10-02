package com.xl;

public class Main {

    public static void main(String[] args) {
         Main main=new Main();
         int x=main.add(20);
        System.out.println(x);
        System.out.println("2号主机1");
        System.out.println("aaa");
        System.out.println("master2");
        System.out.println("abc");
        System.out.println("2来了");
        System.out.println("1号主机先改了");

        System.out.println("主修改了");

        System.out.println("开发改了");


        System.out.println("shehuiren ");

    }

    public int add(int n){
        if(n==1){
            return 1;
        } if(n==2){
            return 2;
        }

        return add(n-1)+add(n-2);
    }
}
