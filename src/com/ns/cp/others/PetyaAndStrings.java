package com.ns.cp.others;

import java.util.Scanner;

public class PetyaAndStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s1 = scanner.next();
        String s2 = scanner.next();
        if (s1.compareToIgnoreCase(s2)<0) {
            System.out.println(-1);
        } else if (s1.compareToIgnoreCase(s2)>0) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}
