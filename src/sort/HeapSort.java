package sort;


//堆排序
/**
* @author lilei
 * 堆排序
 * 稳定性：不稳定
 * 时间复杂度：O(nlogn)
 * 空间复杂度：O(1)
**/
public class HeapSort extends SortBase {
    @Override
    public void sort(int[] a) {
        sort(a, ASC);
    }

    @Override
    public void sort(int[] a, String order) {
        checkOrder(order);

        int len = a.length;
        buildMaxHeap(a, len, order);
        for (int i = len - 1; i > 0; i--) {
            swap(0, i, a);
            len--;
            heap(a, 0, len, order);
        }
    }

    //时间复杂度为O(n)
    private void buildMaxHeap(int[] a, int len, String order) {
        for (int i = len/2; i >= 0; i--) {
            heap(a, i, len, order);
        }
    }


    private void heap(int[] a, int i, int len, String order) {
        int left = 2 * i + 1;
        int right = 2 * i + 2;
        int bound = i;

        if (left < len && a[left] > a[bound] && order.equals(ASC)) {
            bound = left;
        }

        if (right < len && a[right] > a[bound] && order.equals(ASC)) {
            bound = right;
        }

        if (left < len && a[left] < a[bound] && order.equals(DESC)) {
            bound = left;
        }

        if (right < len && a[right] < a[bound] && order.equals(DESC)) {
            bound = right;
        }

        if (bound != i) {
            swap(i, bound, a);
            heap(a, bound, len, order);
        }
    }
}
