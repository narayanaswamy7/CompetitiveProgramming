package com.ns.cp.others;

import java.util.Scanner;

public class Bodybuilder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-->0) {
            int N = scanner.nextInt();
            int R = scanner.nextInt();
            int [] Ai = new int[N];
            int [] Bi = new int[N];
            for (int i=0; i<N; i++) {
                Ai[i] = scanner.nextInt();
            }
            for (int i=0; i<N; i++) {
                Bi[i] = scanner.nextInt();
            }

            int result;
            int totalTension = 0;
            if (Ai.length>1) {
                result = (N-1) * R;
                for (int i=0; i<Bi.length; i++) {
                    totalTension += Bi[i];
                }
                System.out.println(totalTension-result);
            } else {
                result = Bi[0];
                System.out.println(result);
            }

        }
    }
}
