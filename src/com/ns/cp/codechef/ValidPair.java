package com.ns.cp.codechef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/*
* https://www.codechef.com/APRIL21C/problems/SOCKS1
* */
public class ValidPair {
    public static void main(String[] args) throws Exception {
        try {
            Scanner sc = new Scanner(System.in);
            int[] arr = new int[3];
            for (int i = 0; i < 3; i++) {
                arr[i] = sc.nextInt();
            }

            Map<Integer, Integer> totalPairs = new HashMap<Integer, Integer>();
            for (int i = 0; i < 3; i++) {
                if (totalPairs.containsKey(arr[i])) {
                    totalPairs.put(arr[i], totalPairs.get(arr[i]) + 1);
                } else {
                    totalPairs.put(arr[i], 1);
                }
            }

            System.out.println(totalPairs);

            ArrayList<Integer> validPairs = new ArrayList<Integer>();
            for (Integer pair : totalPairs.values()) {
                if (pair >= 2) {
                    validPairs.add(pair);
                }
            }
            if (!validPairs.isEmpty()) {
                System.out.print("Yes");
            } else {
                System.out.println("No");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
