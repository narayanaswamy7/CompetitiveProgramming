package com.ns.cp.codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
https://codeforces.com/problemset/problem/339/A
 */

public class CfHelpfulMaths {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String [] input = reader.readLine().split("\\+");
        insertionSort(input);
    }

    public static void insertionSort(String [] arr) {
        for (int j=1; j<arr.length; j++) {
            int key = Integer.parseInt(arr[j]);
            int i = j-1;
            while (i>=0 && Integer.parseInt(arr[i])>key) {
                arr[i+1] = arr[i];
                i--;
            }
            arr[i+1] = String.valueOf(key);
        }

        System.out.print(String.join("+", arr));
    }
}
