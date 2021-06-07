package com.ns.cp.others;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class DistinctWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.next();
        System.out.println(permutation("", S));
    }

    static HashSet<String> set = new HashSet<String>();
    private static int permutation(String prefix, String str) {
        int n = str.length();
        if (n == 0 && (!prefix.startsWith("A") && !prefix.startsWith("E") && !prefix.startsWith("I") && !prefix.startsWith("O") && !prefix.startsWith("U"))) {
            set.add(prefix);
        }
        else {
            for (int i = 0; i < n; i++) {
                permutation(prefix + str.charAt(i), str.substring(0, i) + str.substring(i+1, n));
            }
        }
        return set.size();
    }
}
