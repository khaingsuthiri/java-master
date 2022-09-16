package com.kstr;

public class Main {

    public static void main(String[] args) {
        byte validByteNumber = 127;
        short validShortNumber = 10000;
        int validIntNumber = 300000000;

        long myLongResult = 50000L + 10L * (validByteNumber + validShortNumber + validIntNumber);
        System.out.println("Result is : " + myLongResult);
    }
}
