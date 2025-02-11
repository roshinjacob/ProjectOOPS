package org.example;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello world!");
        EGclassCar car1= new EGclassCar();
        car1.setBrand("toyota");
        car1.displayBrand();
        car1.model();
        Kia k=new Kia();

        k.name();
        Car c1= new Kia();
        Car c2= new EGclassCar();
        Kia c3=new Kia();

      k.brands("hee");
car1.brands("lexus");



    }
}