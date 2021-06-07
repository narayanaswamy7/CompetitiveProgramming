package com.ns.cp.others;

import java.util.Scanner;

public class Team {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int [] arr = new int[3];
        int [] res = new int[1001];
        int sum=0, count=0;
        for (int i=0; i<n; i++) {
            for (int j=0; j<=2; j++) {
                arr[j] = scanner.nextInt();
                sum = sum+arr[j];
            }
            res[i] = sum;
            sum = 0;
            if (res[i]>=2)
                count++;
        }
        System.out.println(count);
    }
}
