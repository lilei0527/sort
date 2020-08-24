package sort;


import java.util.Arrays;

/**
 * @author lilei
 * 归并排序
 * 稳定性：稳定
 * 时间复杂度：O(nlogn)
 * 空间复杂度：O(n)
 **/
public class MergeSort extends SortBase {
    @Override
    public void sort(int[] a) {
        sort(a, ASC);
    }

    public void sort(int[] a, String order) {
        int[] merge = mergeSort(a, order);
        System.arraycopy(merge, 0, a, 0, merge.length);
    }

    private int[] mergeSort(int[] a, String order) {
        checkOrder(order);

        if (a.length < 2) {
            return a;
    }
        int mid = a.length / 2;
        int[] left = Arrays.copyOfRange(a, 0, mid);
        int[] right = Arrays.copyOfRange(a, mid, a.length);
        return merge(mergeSort(left, order), mergeSort(right, order), order);
    }

    //将两个已排序数组排序
    private int[] merge(int[] left, int[] right, String order) {
        int index = 0, lp = 0, rp = 0;
        int[] merge = new int[left.length + right.length];
        while (lp != left.length && rp != right.length) {
            if (left[lp] < right[rp]) {
                if (order.equals(DESC)) {
                    merge[index++] = right[rp];
                    rp++;
                }
                if (order.equals(ASC)) {
                    merge[index++] = left[lp];
                    lp++;
                }
            } else if (left[lp] == right[rp]) {
                merge[index++] = left[lp];
                merge[index++] = right[rp];
                lp++;
                rp++;
            } else {
                if (order.equals(DESC)) {
                    merge[index++] = left[lp];
                    lp++;
                }

                if (order.equals(ASC)) {
                    merge[index++] = right[rp];
                    rp++;
                }
            }
        }
        //左边的已放入merge数组，现在将右边未放入数组的放入
        if (lp == left.length ) {
            System.arraycopy(right, rp , merge, index, merge.length - index);
        }
        //右边边的已放入merge数组，现在将左边未放入数组的放入
        if (rp == right.length ) {
            System.arraycopy(left, lp , merge, index, merge.length - index );
        }

        return merge;
    }

}
