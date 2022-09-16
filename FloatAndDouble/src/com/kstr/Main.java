package com.kstr;

public class Main {
    public static void main(String[] args) {
        double myMinFloatValue = Float.MIN_VALUE;
        double myMaxFloatValue = Float.MAX_VALUE;
        System.out.println("My min double value = " + myMinFloatValue);
        System.out.println("My max double value = " + myMaxFloatValue);

        double myMinDoubleValue = Double.MIN_VALUE;
        double myMaxDoubleValue = Double.MAX_VALUE;
        System.out.println("My min double value = " + myMinDoubleValue);
        System.out.println("My max double value = " + myMaxDoubleValue);

        int myIntValue = 5 / 2;
        float myFloatValue = 5f / 2f;
        double myDoubleValue = 5d / 2d;

        System.out.println(myIntValue + "|" + myFloatValue + "|" + myDoubleValue);
    }
}
