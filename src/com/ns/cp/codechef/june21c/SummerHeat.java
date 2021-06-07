package com.ns.cp.codechef.june21c;

import java.util.Scanner;

/*
https://www.codechef.com/JUNE21C/problems/COCONUT
*/
public class SummerHeat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int xa = scanner.nextInt();
            int xb = scanner.nextInt();
            int Xa = scanner.nextInt();
            int Xb = scanner.nextInt();
            findTotalCoconuts(xa, xb, Xa, Xb);
        }
    }

    public static void findTotalCoconuts(int xa, int xb, int Xa, int Xb) {
        int totalCoconutWater = Xa / xa;
        int totalCoconutPulp = Xb / xb;
        int totalCoconut = totalCoconutWater + totalCoconutPulp;
        System.out.println(totalCoconut);
    }
}
