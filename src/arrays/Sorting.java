package arrays;

import java.util.Arrays;

public class Sorting {
    public static void main(String[] args) {
        int[] arr = { 8, 7, 3, 1, 2 };
        insertionSort(arr);
    }

    public static void print(int[] arr) {
        System.out.println(Arrays.toString(arr));
    }

    // bubble sort
    // time complexity = O(n^2)
    public static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        print(arr);
    }

    // selection sort
    // time complexity = O(n^2)
    public static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int smallest = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[smallest] > arr[j])
                    smallest = j;
            }

            int temp = arr[smallest];
            arr[smallest] = arr[i];
            arr[i] = temp;
        }

        print(arr);
    }

    // insertion sort
    public static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int current = arr[i];
            int j = i - 1;
            while (j >= 0 && current < arr[j]) {
                arr[j + 1] = arr[j];
                j--;
            }

            // placment
            arr[j + 1] = current;
        }

        print(arr);
    }
}
