package com.ns.cp.others;

import java.util.Scanner;

public class PassingMarks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-->0) {
            int amin = scanner.nextInt();
            int bmin = scanner.nextInt();
            int cmin = scanner.nextInt();
            int tmin = scanner.nextInt();
            int A = scanner.nextInt();
            int B = scanner.nextInt();
            int C = scanner.nextInt();

            if ((A>=amin && B>=bmin && C>=cmin) && (A+B+C)>=tmin) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }
}
