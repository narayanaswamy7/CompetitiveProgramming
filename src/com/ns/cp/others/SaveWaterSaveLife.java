package com.ns.cp.others;

import java.util.Scanner;

public class SaveWaterSaveLife {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while(t-->0) {
            int H = scanner.nextInt();
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            int C = scanner.nextInt();
            int totalConsumption = x + y/2;
            if (totalConsumption*H <= C) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
