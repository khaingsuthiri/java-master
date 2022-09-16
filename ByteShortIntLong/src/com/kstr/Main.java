package com.kstr;

public class Main {

    public static void main(String[] args) {
        int myValue = 10000;

        int maxIntValue = Integer.MAX_VALUE;
        int minIntValue = Integer.MIN_VALUE;

        System.out.println("Max Integer Value: " + maxIntValue);
        System.out.println("Min Integer Value: " + minIntValue);

        System.out.println("Busted Max Integer Value: " + (maxIntValue + 1));
        System.out.println("Busted Min Integer Value: " + (minIntValue - 1));

        int myMaxIntTest = 2_147_483_647;
        System.out.println(myMaxIntTest);

        byte maxByteValue = Byte.MAX_VALUE;
        byte minByteValue = Byte.MIN_VALUE;

        System.out.println("Max Byte Value: " + maxByteValue);
        System.out.println("Min Byte Value: " + minByteValue);

        short maxShortValue = Short.MAX_VALUE;
        short minShortValue = Short.MIN_VALUE;

        System.out.println("Max Short Value: " + maxShortValue);
        System.out.println("Min Short Value: " + minShortValue);

        long myLongNumber = 23000L; // if you don't add 'L/l' at the end, this value will be only int

        long maxLongValue = Long.MAX_VALUE;
        long minLongValue = Long.MIN_VALUE;

        System.out.println("Max Long Value: " + maxLongValue);
        System.out.println("Min Long Value: " + minLongValue);

        System.out.println(myLongNumber);

        int myInt = maxIntValue / 2;
        short myShort = (short) (maxShortValue / 2);
        byte myByte = (byte) (maxByteValue / 2);

    }
}
