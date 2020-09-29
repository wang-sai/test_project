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
<<<<<<< HEAD
        System.out.println("2来了");
=======
        System.out.println("1号主机先改了");

>>>>>>> 054ebdd217276f178acd747b5b16a0daf9a1c07d
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
