package com.ns.cp.others;

import java.util.ArrayList;
import java.util.Scanner;

public class PrimeGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-->0) {
            int L = scanner.nextInt();
            int R = scanner.nextInt();
            ArrayList<Integer> list = new ArrayList<Integer>();

            for (int i=L; i<=R; i++) {
                if (isPrime(i))
                    list.add(i);
            }

            if(list.isEmpty())
                System.out.println(-1);
            if(list.size()==1)
                System.out.println(0);
            else if (list.size()>1)
                System.out.println(list.get(list.size()-1) - list.get(0));
        }
    }

    static boolean isPrime(int n) {
        if (n<=1)
            return false;

        for (int i=2; i<n; i++) {
            if (n%i==0)
                return false;
        }
        return true;
    }
}
