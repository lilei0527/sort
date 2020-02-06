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

        sort.Sort quickSort = new sort.QuickSort();
        quickSort.sort(a1, sort.SortBase.DESC);

        sort.Sort bubbleSort = new sort.BubbleSort();
        bubbleSort.sort(a2);

        sort.Sort selectionSort = new sort.SelectionSort();
        selectionSort.sort(a3);

        sort.Sort insertSort = new sort.InsertSort();
        insertSort.sort(a4, sort.SortBase.DESC);

        sort.Sort shellSort = new sort.ShellSort();
        shellSort.sort(a5);

        sort.Sort mergeSort = new sort.MergeSort();
        mergeSort.sort(a6, sort.SortBase.DESC);

        sort.Sort heapSort = new sort.HeapSort();
        heapSort.sort(a7, sort.SortBase.DESC);

        sort.Sort countSort = new sort.CountSort();
        countSort.sort(a8, sort.SortBase.DESC);

        sort.Sort radixSort = new sort.RadixSort();
        radixSort.sort(a9, sort.SortBase.DESC);

        sort.SortBase.printArray(a1);
        System.out.println();

        sort.SortBase.printArray(a2);
        System.out.println();

        sort.SortBase.printArray(a3);
        System.out.println();

        sort.SortBase.printArray(a4);
        System.out.println();

        sort.SortBase.printArray(a5);
        System.out.println();

        sort.SortBase.printArray(a6);
        System.out.println();

        sort.SortBase.printArray(a7);
        System.out.println();

        sort.SortBase.printArray(a8);
        System.out.println();

        sort.SortBase.printArray(a9);
    }
}
