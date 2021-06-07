package com.ns.cp.codechef;

import java.util.ArrayList;
import java.util.Scanner;

/*
https://www.codechef.com/START4C/problems/CORTSENT
*/
public class CorrectSentence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            ArrayList<String> list = new ArrayList<>();
            int k = scanner.nextInt();
            for (int i = 0; i < k; i++) {
                list.add(scanner.next());
            }

            boolean flag = true;
            for (String s : list) {
                if (!isLanguage1(s) && !isLanguage2(s)) {
                    flag = false;
                }
            }

            String result = flag ? "YES" : "NO";
            System.out.println(result);
        }
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
}
