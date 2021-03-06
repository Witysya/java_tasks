package com.company;


import java.util.*;

public class FirstTask {

    public static void main(String[] args) {
        int arr[] = new int[10];

        // TODO Use foreach instead for
        for(int i = 0; i <  arr.length; i++) {
            arr[i] =  (int)(Math.random() * 100);
            System.out.print(arr[i] + "  ");
        }
        System.out.print("\nSorted: \n");

        Arrays.sort(arr);

        // TODO Use foreach instead for
        for(int i = 0; i <  arr.length; i++) {
            System.out.print(arr[i] + "  ");
        }

        Integer arr2[] = new Integer[10];
        // TODO Use foreach instead for
        for(Integer i = 0; i <  arr.length; i++) {
            arr2[i] =  (int)(Math.random() * 100);
            // TODO You are printing arr instead arr2 - in future to prevent mistakes like this give different names (arrayForSorting, arrayForReversSorting)
            System.out.print(arr[i] + "  ");
        }
        System.out.print("\nSorted: \n");

        Arrays.sort(arr2, Collections.reverseOrder());

        // TODO Use foreach instead for
        for(Integer i = 0; i <  arr2.length; i++) {
            System.out.print(arr2[i] + "  ");
        }
    }
}