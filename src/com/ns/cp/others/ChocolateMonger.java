package com.ns.cp.others;

import java.util.HashMap;
import java.util.Scanner;

public class ChocolateMonger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-->0) {
            int n = scanner.nextInt();
            int x = scanner.nextInt();
            int [] A = new int[n];
            for (int i=0; i<n; i++) {
                A[i] = scanner.nextInt();
            }

            HashMap <Integer, Integer> Chocolates = new HashMap<Integer, Integer>();
            int count = 0;
            for (Integer i : A) {
                Integer j = Chocolates.get(i);
                Chocolates.put(i, (j == null) ? 1 : j + 1);
            }

            if (x<=(A.length-Chocolates.size())) {
                System.out.println(Chocolates.size());
            } else {
                System.out.println(A.length-x);
            }
        }
    }
}
