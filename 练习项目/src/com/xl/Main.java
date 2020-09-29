package com.xl;

public class Main {

    public static void main(String[] args) {
         Main main=new Main();
         int x=main.add(20);
        System.out.println(x);
<<<<<<< HEAD
        System.out.println("2号主机1");
        System.out.println("aaa");
        System.out.println("master2");
=======
        System.out.println("abc");
>>>>>>> 5c02cf67790e72f1cc9474545c2efef32bde2fe3
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
