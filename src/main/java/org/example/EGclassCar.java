package org.example;

public class EGclassCar extends Car {

    private String brand;

    public String getBrand( String brand) {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
   public void displayBrand(){
        System.out.println(brand);
   }
    public void brands(String b1){
        System.out.println("brand 1="+b1 );
    }

}
