package com.constantinemars;

public class Main {

    public static void main(String[] args) {

        int[] a = {12, 7, 8, 5, 2};

        print("input", a);
        print("bubbleSort", bubbleSort(a));
        print("selectionSort", selectionSort(a));
        print("insertionSort", insertionSort(a));
    }

    private static void print(String label, int[] a) {
        System.out.printf("%s: ", label);
        for (int v : a) {
            System.out.printf("%d ", v);
        }
        System.out.println();
    }

    private static int[] insertionSort(int[] a) {
        int checks = 0;
        int swaps = 0;

        for(int i=0; i<a.length; i++) {
            int current = a[i];
            int j = i-1;

            checks++;
            while(j >= 0 && a[j] > current) {
                swaps++;
                a[j+1] = a[j];
                j--;
            }

            swaps++;
            a[j+1] = current;
        }

        System.out.printf("insertionSort: checks:%d, swaps:%d\n", checks, swaps);

        return a;
    }

    private static int[] selectionSort(int[] a) {
        int checks = 0;
        int swaps = 0;

        for (int i = 0; i < a.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < a.length; j++) {

                checks++;
                if (a[j] < a[minIndex]) {
                    minIndex = j;
                }
            }

            swaps++;
            int t = a[minIndex];
            a[minIndex] = a[i];
            a[i] = t;
        }

        System.out.printf("selectionSort: checks:%d, swaps:%d\n", checks, swaps);

        return a;
    }

    private static int[] bubbleSort(int[] a) {
        int checks = 0;
        int swaps = 0;

        for (int i=0; i<a.length-1; i++)
            for (int j=0; j<a.length-1-i; j++) {

                checks++;
                if(a[j] > a[j+1]) {
                    int t = a[j];
                    a[j] = a[j+1];
                    a[j+1] = t;

                    swaps++;
                }
            }

        System.out.printf("bubbleSort: checks:%d, swaps:%d\n", checks, swaps);

        return a;
    }
}
