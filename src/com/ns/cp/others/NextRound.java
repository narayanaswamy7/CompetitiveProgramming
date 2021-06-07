package com.ns.cp.others;

import java.util.Scanner;

public class NextRound {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int [] scores = new int[n+1];
        int minScore = 0;
        for (int i=1; i<=n; i++) {
            int score = scanner.nextInt();
            scores[i] = score;
            if (i == k)
                minScore = score;
        }
        int count =0;
        for (int i=1; i<=n; i++) {
            if (scores[i] >= minScore && scores[i]>0)
                count++;
        }
        System.out.println(count);
    }
}
