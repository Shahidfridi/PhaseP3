package com.demo;

public class MathTools {
    public static double convertToDecimal(int numerator, int denominator) {
    	try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        if (denominator == 0) {
            throw new IllegalArgumentException("Denominator must not be 0");
        }
        return (double)numerator / (double)denominator;
    }
}