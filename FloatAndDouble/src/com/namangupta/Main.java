package com.namangupta;

public class Main {

    public static void main(String[] args) {

        /*// width of int = 32 (4 bytes)
        int myIntValue = 5/3;
        // width of int = 32 (4 bytes)
        float myFloatValue = 5f/3f;
        // width of int = 64 (8 bytes)
        double myDoubleValue = 5d/3d;

        System.out.println("myIntValue = " + myIntValue);
        System.out.println("myFloatValue = " + myFloatValue);
        System.out.println("myDoubleValue = " + myDoubleValue);*/

        double poundValue = 200d;
        double kgValue = 0.45359237d * poundValue;
        System.out.println(poundValue + " Pounds = " + kgValue + " Kilograms");

    }
}
