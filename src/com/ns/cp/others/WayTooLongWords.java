package com.ns.cp.others;

import java.util.Scanner;

/*
 * https://codeforces.com/problemset/problem/71/A
 * */
public class WayTooLongWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int n = sc.nextInt();
        for (int i=0; i<n; i++) {
            String word = sc.next();
            if (word.length()>10) {
                sb.append(word.charAt(0)).append(word.length()-2).append(word.charAt(word.length()-1)).append("\n");
            } else {
                sb.append(word).append("\n");
            }
        }
        System.out.println(sb);
    }
}
