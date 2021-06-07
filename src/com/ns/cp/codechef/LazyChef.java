package com.ns.cp.codechef;

import java.awt.desktop.SystemEventListener;
import java.util.Scanner;

/*
https://www.codechef.com/START4C/problems/LAZYCHF
*/
public class LazyChef {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-->0){
            int x = scanner.nextInt();
            int m = scanner.nextInt();
            int d = scanner.nextInt();
            System.out.println(Math.min(x*m, x+d));
        }
    }
}
