package com.ns.cp.codechef;

import java.util.Scanner;

public class StrongLanguage {
    public static void main(String[] args) throws Exception {
        try {
            Scanner scanner = new Scanner(System.in);
            int nTestCases = scanner.nextInt();
            for (int i=0; i<nTestCases; i++) {
                int N = Integer.parseInt(scanner.next());
                int K = Integer.parseInt(scanner.next());
                String S = scanner.next();
                System.out.println("N:-"+N);
                System.out.println("K:-"+K);
                int count = 0;
                boolean flag = false;
                for (int j=0; j<S.length(); j++) {
                    if (S.charAt(j) == '*') {
                        count++;
                        if (count >= K) {
                            flag = true;
                            break;
                        }
                    } else {
                        count = 0;
                    }
                }
                if (flag==true) {
                    System.out.println("Yes");
                } else {
                    System.out.println("No");
                }
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
