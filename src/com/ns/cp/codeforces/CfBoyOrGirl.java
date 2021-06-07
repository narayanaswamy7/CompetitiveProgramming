package com.ns.cp.codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

/*
https://codeforces.com/problemset/problem/236/A
*/
public class CfBoyOrGirl {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input = reader.readLine();
        int result = countOccurrence(input);
        if (result % 2 == 0) {
            System.out.println("CHAT WITH HER!");
        }else {
            System.out.println("IGNORE HIM!");
        }
    }

    public static int countOccurrence(String string) {
        HashMap<Character, Integer> charCount = new HashMap<Character, Integer>();
        for (char c : string.toCharArray()) {
            if (charCount.containsKey(c)) {
                charCount.put(c, charCount.get(c) + 1);
            } else {
                charCount.put(c, 1);
            }
        }

        return charCount.size();
    }
}
