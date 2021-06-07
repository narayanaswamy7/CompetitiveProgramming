package com.ns.cp.others;

import java.util.Scanner;

public class AddOne {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for (int i=0; i<t; i++) {
            String n = scanner.next();
            int o = scanner.nextInt();
            for (int j=0; j<o; j++) {
                String s = "";
                for (int k=0; k<n.length(); k++) {
                    s += s.charAt(i)+1;
                }
                n = s;
            }
        }

    }
}
