package com.tnsif.third;

public class armstrongnumber {

    public static void main(String[] args) {
        int num = 153;
        int originalNum = num;
        int result = 0;
        int digits = String.valueOf(num).length();

        while (num > 0) {
            int digit = num % 10;
            result += Math.pow(digit, digits);
            num /= 10;
        }

        if (result == originalNum) {
            System.out.println(originalNum + " is an Armstrong Number");
        } else {
            System.out.println(originalNum + " is not an Armstrong Number");
        }
    }
}
