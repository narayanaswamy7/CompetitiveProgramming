package com.ns.cp.codechef;

public class CountOccurrenceString {
    public static void countOccurrence(char [] arr) {
        int n = arr.length;
        for (int i=0; i<n; i++) {
            int count =1;
            for (int j=i+1; j<n; j++) {
                if (arr[i] == arr[i+1]) {
                    count++;
                    int k = j;
                    while (k<n-1) {
                        arr[k] = arr[k+1];
                        k++;
                    }
                    n--;
                    j--;
                }
            }
            System.out.println(arr[i]+" is occurring "+count+" times.");
        }
    }

    public static void main(String[] args) {
        char [] arr = {'a', 'a', 'b', 'c', 'a', 'c'};
        countOccurrence(arr);
    }
}
