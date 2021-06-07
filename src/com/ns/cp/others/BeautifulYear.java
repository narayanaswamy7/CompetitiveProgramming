package com.ns.cp.others;

import java.util.HashSet;
import java.util.Scanner;

public class BeautifulYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int y = scanner.nextInt()
                ;
        while(true) {
            y++;
            if (checkDistinctYear(Integer.toString(y))) {
                System.out.println(y);
                return;
            }
        }
    }

    public static Boolean checkDistinctYear(String y) {
        int d1 = Character.getNumericValue(y.charAt(0));
        int d2 = Character.getNumericValue(y.charAt(1));
        int d3 = Character.getNumericValue(y.charAt(2));
        int d4 = Character.getNumericValue(y.charAt(3));

        HashSet<Integer> years = new HashSet<Integer>();
        years.add(d1);
        years.add(d2);
        years.add(d3);
        years.add(d4);

        return years.size() == 4;
    }
}
