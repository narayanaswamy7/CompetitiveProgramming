package com.ns.cp.others;

import java.util.Scanner;

/*
https://codeforces.com/problemset/problem/546/A
*/
public class SoldierAndBananas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        int n = scanner.nextInt();
        int w = scanner.nextInt();
        int totalAmount = 0;

        for (int i = 1; i <= w; i++) {
            totalAmount += i * k;
        }

        if (totalAmount <= n) {
            System.out.println(0);
        } else {
            System.out.println(totalAmount - n);
        }
    }
}