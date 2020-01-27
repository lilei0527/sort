package sort;

import java.util.Arrays;

public class SortTest {
    public static void main(String[] args) {
        int[] a1 = {1, 2, 4, 3, 11, 5, 56, 56, 34, 23, 37, 45, 345, 111};
        int[] a2 = Arrays.copyOf(a1, a1.length);
        int[] a3 = Arrays.copyOf(a1, a1.length);
        int[] a4 = Arrays.copyOf(a1, a1.length);
        int[] a5 = Arrays.copyOf(a1, a1.length);
        int[] a6 = Arrays.copyOf(a1, a1.length);
        int[] a7 = Arrays.copyOf(a1, a1.length);
        int[] a8 = Arrays.copyOf(a1, a1.length);
        int[] a9 = Arrays.copyOf(a1, a1.length);

        Sort quickSort = new QuickSort();
        quickSort.sort(a1, SortBase.DESC);

        Sort bubbleSort = new BubbleSort();
        bubbleSort.sort(a2);

        Sort selectionSort = new SelectionSort();
        selectionSort.sort(a3);

        Sort insertSort = new InsertSort();
        insertSort.sort(a4, SortBase.DESC);

        Sort shellSort = new ShellSort();
        shellSort.sort(a5);

        Sort mergeSort = new MergeSort();
        mergeSort.sort(a6, SortBase.DESC);

        Sort heapSort = new HeapSort();
        heapSort.sort(a7, SortBase.DESC);

        Sort countSort = new CountSort();
        countSort.sort(a8, SortBase.DESC);

        Sort radixSort = new RadixSort();
        radixSort.sort(a9, SortBase.DESC);

        SortBase.printArray(a1);
        System.out.println();

        SortBase.printArray(a2);
        System.out.println();

        SortBase.printArray(a3);
        System.out.println();

        SortBase.printArray(a4);
        System.out.println();

        SortBase.printArray(a5);
        System.out.println();

        SortBase.printArray(a6);
        System.out.println();

        SortBase.printArray(a7);
        System.out.println();

        SortBase.printArray(a8);
        System.out.println();

        SortBase.printArray(a9);
    }
}
