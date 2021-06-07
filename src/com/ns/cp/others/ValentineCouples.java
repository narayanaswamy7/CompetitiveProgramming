package com.ns.cp.others;

import java.util.Arrays;
import java.util.Scanner;

public class ValentineCouples {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while(t-->0) {
            int totalBoysGirls = scanner.nextInt();
            int [] boysHeight = new int[totalBoysGirls];
            int [] girlsHeight = new int[totalBoysGirls];

            for (int i=0; i<totalBoysGirls; i++) {
                boysHeight[i] = scanner.nextInt();
            }

            for (int j=0; j<totalBoysGirls; j++) {
                girlsHeight[j] = scanner.nextInt();
            }

            int minBoysHeight = Arrays.stream(boysHeight).min().getAsInt();
            int minGirlsHeight =Arrays.stream(girlsHeight).min().getAsInt();
            int maxBoysHeight = Arrays.stream(boysHeight).max().getAsInt();
            int maxGirlsHeight =Arrays.stream(girlsHeight).max().getAsInt();

            int minLikeliness = minBoysHeight+maxGirlsHeight;
            int maxLikeliness = maxBoysHeight+minGirlsHeight;
            if (minLikeliness>maxLikeliness) {
                System.out.println(minLikeliness);
            } else {
                System.out.println(maxLikeliness);
            }
        }
    }
}
