package com.ns.cp.others;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class RupeeProblem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] currencies = {1, 2, 5};
        int amount = scanner.nextInt();
        System.out.println(coinchange(0, amount, currencies, ""));
    }

    public static int coinchange(int ci, int remaining, int[] currencies,
                                 String paid) {
        if (remaining == 0) {
            /*
             * this means the amount to be paid can be paid
             *  using only the given currencies.
             */
            int count = 0;
            String [] arr = paid.split(", ");
            HashMap<String, Integer> map = new HashMap<String, Integer>();
            for (String i : arr) {
                Integer j = map.get(i);
                map.put(i, (j == null) ? 1 : j + 1);
            }

            //System.out.println(paid);
            if (map.containsKey("1") && map.containsKey("2") && map.containsKey("5")) {
                if (map.get("1")>map.get("2")) {
                    if (map.get("2")>map.get("5")) {
                        count++;
                        //System.out.println(count);
                        return count;
                    }
                }
            }
            /*
             * as this is one of the way to pay, hence it
             * will contribute +1 number of ways for itself
             */
        }
        if (remaining < 0) {
            /*
             * if the remaining amount to be paid is negative,
             * this means that the set of coins we've paid does
             * not add upto the amount to be paid, hence it is
             * not one of the way to pay.
             */
            return 0;
        }

        int res = 0;
        for (int i = ci; i < currencies.length; i++) {

            /*
             * we must start our loop from current index, as
             * if we loop through all currencies once again
             * then there will be a repetition in the ways used
             * to pay the amount.
             */
            res += coinchange(i, remaining - currencies[i], currencies,
                    paid + Integer.toString(currencies[i]) + ", ");

        }

        return res;

    }
}
