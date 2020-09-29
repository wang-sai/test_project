package com.xl;

public class Main {

    public static void main(String[] args) {
         Main main=new Main();
         int x=main.add(20);
        System.out.println(x);
<<<<<<< HEAD
        System.out.println("aaa");
=======
        System.out.println("master2");
>>>>>>> 1473309d3685ad01c678fdf4516f9ff6a58c23c2
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
