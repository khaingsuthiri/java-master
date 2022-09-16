package com.kstr;

public class Main {

    public static void main(String[] args) {
	    String myString = "This is a string";
        System.out.println(myString);
        myString = myString + " and this is more.";
        System.out.println(myString);
        myString = myString + " \u00A9 2019";
        System.out.println(myString);

        String numberString = "123.45";
        numberString = numberString + "67.89";
        System.out.println(numberString);

        String lastString = "100";
        int number = 200;
        lastString = lastString + number;
        System.out.println(lastString);

        double doubleNumber = 100.19d;
        lastString = lastString + doubleNumber;
        System.out.println(lastString);
    }
}
