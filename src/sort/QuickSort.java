package sort;

/**
 * @author lilei
 * 快速排序
 * 稳定性：不稳定
 * 时间复杂度：O(nlogn)
 * 空间复杂度：O(logn)
 **/
public class QuickSort extends SortBase {


    private void sort(int[] a, int low, int high, String order) {
        if (low >= high) {
            return;
        }
        int pivotIndex = partition(a, low, high, order);
        // 根据基准元素，分成两部分递归排序
        sort(a, low, pivotIndex - 1, order);
        sort(a, pivotIndex + 1, high, order);
    }


    //得到基准值的位置
    private int partition(int[] a, int start, int end, String order) {
        int pivot = a[start];
        int left = start;
        int right = end;
        while (left != right) {
            if (order.equals(ASC)) {
                while (left < right && a[right] >= pivot) {
                    right--;
                }
                while (left < right && a[left] <= pivot) {
                    left++;
                }
            }

            if (order.equals(DESC)) {
                while (left < right && a[right] <= pivot) {
                    right--;
                }
                while (left < right && a[left] >= pivot) {
                    left++;
                }
            }
            swap(left, right, a);
        }
        swap(start, left, a);
        return left;
    }

    @Override
    public void sort(int[] a) {
        sort(a,  ASC);
    }

    @Override
    public void sort(int[] a, String order) {
        checkOrder(order);

        sort(a, 0, a.length - 1, order);
    }
}
