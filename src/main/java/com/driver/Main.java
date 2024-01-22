package com.driver;

public class Main {

    public static void main(String args[]){
        Product p = new Product();
        int result = p.product(10,20,30);
        double dbans = p.product(3.2,4.5);
    }
    public static class Product{
        public int product(int x,int y){
            return x*y;
        }
        public int product(int x,int y,int z){
            return x*y*z;
        }
        public double product(double x,double y){
            return x*y;
        }
    }
}