package com.ns.cp.test;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.next();
        System.out.println('N'+0);
        System.out.println(isLanguage1(word));
    }

    public static boolean isLanguage1(String s) {
        for (char c : s.toCharArray()) {
            if (c - 'a' < 0 || c - 'a' >= 13) {
                return false;
            }
        }
        return true;
    }

    public static boolean isLanguage2(String s) {
        for (char c : s.toCharArray()) {
            if (c - 'A' < 13 || c - 'A' >= 26) {
                return false;
            }
        }
        return true;
    }

    public static boolean isAllLower(String s) {
        for (char c : s.toCharArray()) {
            if (!Character.isLowerCase(c)) {
                return false;
            }
        }
        return true;
    }
}
