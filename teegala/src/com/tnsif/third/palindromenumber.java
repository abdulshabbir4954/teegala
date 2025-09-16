package com.tnsif.third;

public class palindromenumber {

    public static void main(String[] args) {
        int num = 121;
        int originalNum = num;
        int reversed = 0;

        while (num > 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }

        if (originalNum == reversed) {
            System.out.println(originalNum + " is a Palindrome number");
        } else {
            System.out.println(originalNum + " is Not a Palindrome number");
        }
    }
}
