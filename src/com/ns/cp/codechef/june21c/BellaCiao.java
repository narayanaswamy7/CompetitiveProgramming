package com.ns.cp.codechef.june21c;

import java.awt.desktop.SystemEventListener;
import java.util.Scanner;

/*
https://www.codechef.com/JUNE21C/problems/CHFHEIST
*/
public class BellaCiao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int D = scanner.nextInt();
            int d = scanner.nextInt();
            int P = scanner.nextInt();
            int Q = scanner.nextInt();
            System.out.println(getMoney(D, d, P, Q));
            //System.out.println(D - D / 2);
            //System.out.println(getTotalMoney(D, d, P, Q));
            //getTotalMoney(D, d, P, Q);
        }
    }

    public static int getMoney(int D, int d, int P, int Q) {
        int sum = 0;
        int n = 0;
        for (int i = 1; i <= D; i++) {
            sum += (P + n * Q);
            if (i % d == 0)
                n += 1;
        }
        return sum;
    }

    public static int getTotalMoney(int D, int d, int P, int Q) {
        int totalMoney;
        int n = D / d;
        totalMoney = ((D - n) * P + (D - n) * (D - n - 1) / 2 * Q) + (n * P + (n / 2) * (n - 1) * Q);
        //totalMoney = D * P + ((D - n) * (D - n) + 2 * n - 1) * Q/2;
        return totalMoney;
    }

    public static int getTotalMoney1(int D, int d, int P, int Q) {
        int totalMoney;
        int n = D / d;
        if (n%2==0) {
            totalMoney = n * Q;
        } else {
            totalMoney = (n+1) * Q;
        }
        totalMoney = totalMoney + D * P;
        return totalMoney;
    }
}
