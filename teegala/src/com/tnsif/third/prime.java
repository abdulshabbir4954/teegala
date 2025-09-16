package com.tnsif.third;

public class prime {

	public static void main(String[] args) {
		System.out.println("Prime numbers from 1 to 100:");
        for (int a = 2; a <= 100; a++) { 
            boolean isPrime = true;
            for (int i = 2; i <= Math.sqrt(a); i++) {
                if (a % i == 0) {
                    isPrime = false;
                    break;
                }
            } 
            if (isPrime) {
                System.out.println(a);
            }
        }
    }
}
