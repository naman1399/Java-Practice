package com.company;

public class Main {

    public static void main(String[] args) {

        // int has a width of 32
        int myMinValue = -2147483648;
        int myMaxValue = 2147483647;
        int myTotal = (myMinValue/2);
        System.out.println("myTotal = " + myTotal);

        // byte has a width of 8
        byte myByteValue = -128;
        byte myNewByteValue = (byte) (myByteValue/2);
        System.out.println("myNewByteValue = " + myNewByteValue);

        // short has a width of 16
        short myShortValue = 32767;
        short myNewShortValue = (short) (myShortValue/2);

        // long has a width of 64
        long myLongValue = 9223372036854775807L;

        byte a = 10;

        short b = 20;

        int c = 50;

        long d = 50000L + 10L * (a + b + c);
        short total = (short) (1000 + 10 * (a + b + c));
        System.out.println(d);
        System.out.println(total);

    }
}
