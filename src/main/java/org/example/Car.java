package org.example;

public class Car extends Add {
    public void model(){
        System.out.println("model 2025");
    }
    public void brands(String b1){
        System.out.println("brand");
    }

    @Override
    void addition(int a, int b) {
        int c=a+b;
        System.out.println(c);
    }

    @Override
    void sub(int a, int b) {
        int c=a-b;
        System.out.println(c);
    }
}
