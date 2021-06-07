package com.ns.cp.others;

import java.util.Scanner;

public class WordCapitalization {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.next();
        char [] ch = S.toCharArray();
        ch[0] = Character.toUpperCase(ch[0]);
        for (int i=0; i<ch.length; i++) {
            System.out.print(ch[i]);
        }
    }
}
