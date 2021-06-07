package com.ns.cp.others;

import java.util.stream.IntStream;

public class GoogleReID {
    public static void main(String[] args) {
        System.out.println(Solution(0));
    }

    public static boolean isPrime(int n) {
        return n > 1 && IntStream.rangeClosed(2, n / 2).noneMatch(i -> n % i == 0);
    }

    public static String generatePrimeString () {
        String primeString = "";
        for (int i=0; i<=25000; i++) {
            if (isPrime(i)) {
                primeString += i;
            }
        }
        return primeString;
    }

    public static String Solution(int n) {
        return generatePrimeString().substring(n, n+5);
    }
}
