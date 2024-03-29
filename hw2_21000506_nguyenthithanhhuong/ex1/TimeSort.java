package hw2_21000506_nguyenthithanhhuong.ex1;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class TimeSort {
    public static void timeSort(int[] array) {
        System.out.printf("N = %d\n", array.length);
        System.out.printf("Bubble Sort: %fms\n", timeBubbleSort(Arrays.copyOfRange(array, 0, array.length)));
        System.out.printf("Selection Sort: %fms\n", timeSelectionSort(Arrays.copyOfRange(array, 0, array.length)));
        System.out.printf("Insertion Sort: %fms\n", timeInsertionSort(Arrays.copyOfRange(array, 0, array.length)));
        System.out.printf("Merge Sort: %fms\n", timeMergeSort(Arrays.copyOfRange(array, 0, array.length)));
        System.out.printf("Quick Sort: %fms\n", timeQuickSort(Arrays.copyOfRange(array, 0, array.length)));
    }

    // Bubble Sort time in 20 times
    public static double timeBubbleSort(int[] array) {
        List<Long> time = new ArrayList<>();

        for (int i = 0; i < 20; i++) {
            long temp = BubbleSort.time(Arrays.copyOfRange(array, 0, array.length));
            time.add(temp);
        }
        return average(time);
    }

    // Selection Sort time in 20 times
    public static double timeSelectionSort(int[] array) {
        List<Long> time = new ArrayList<>();

        for (int i = 0; i < 20; i++) {
            long temp = SelectionSort.time(Arrays.copyOfRange(array, 0, array.length));
            time.add(temp);
        }

        return average(time);
    }

    // Insertion Sort time in 20 times
    public static double timeInsertionSort(int[] array) {
        List<Long> time = new ArrayList<>();

        for (int i = 0; i < 20; i++) {
            long temp = InsertionSort.time(Arrays.copyOfRange(array, 0, array.length));
            time.add(temp);
        }

        return average(time);
    }

    // Merge Sort time in 20 times
    public static double timeMergeSort(int[] array) {
        List<Long> time = new ArrayList<>();

        for (int i = 0; i < 20; i++) {
            long temp = MergeSort.time(Arrays.copyOfRange(array, 0, array.length));
            time.add(temp);
        }

        return average(time);
    }

    // Quick Sort time in 20 times
    public static double timeQuickSort(int[] array) {
        List<Long> time = new ArrayList<>();

        for (int i = 0; i < 20; i++) {
            long temp = QuickSort.time(Arrays.copyOfRange(array, 0, array.length));
            time.add(temp);
        }

        return average(time);
    }

    // Average of 20 sort times
    public static double average(List<Long> list) {
        long sum = 0;
        for (int i = 0; i < 20; i++) {
            sum += list.get(i);
        }
        return sum * 1.0 / 20;
    }
}
