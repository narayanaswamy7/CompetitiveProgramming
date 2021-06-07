package com.ns.cp.others;

import java.util.Scanner;

public class VirusOutbreak {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String V = scanner.next();
        int N = scanner.nextInt();
        for (int i=0; i<N; i++) {
            String Bi = scanner.next();
            System.out.println(isCovidPositive(Bi, V));
        }
    }

    public static String isCovidPositive(String s, String t) {
        if(s.length()==0)
            return "POSITIVE";
        int i=0;
        int j=0;
        while(i<s.length() && j<t.length()){
            if(s.charAt(i)==t.charAt(j)){
                i++;
            }
            j++;
            if(i==s.length())
                return "POSITIVE";
        }
        return "NEGATIVE";
    }
}
