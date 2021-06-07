package com.ns.cp.others;

import java.util.Scanner;

public class ArrayAndPeaks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for(int i=0; i<t; i++){
            int n = scanner.nextInt();
            int k = scanner.nextInt();
            if (k * 2 + 1 > n) {
                System.out.println("-1");
            }
            else{
                int [] p = new int[n];
                int c = n;
                for (int j = 0; j < k; j += 1)
                    p[2 * j + 1] = c --;
                for (int j = 0; j < n; j += 1)
                    if (!(p[j] == 2))
                        p[j] = c --;
                for(int j = 0; j < n; j += 1)
                    System.out.print(p[j]+"\t");
                System.out.println();
            }
        }
    }
}
