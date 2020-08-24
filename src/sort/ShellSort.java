package sort;

/**
 * @author lilei
 * 希尔排序
 * 稳定性：不稳定
 * 时间复杂度：O(n^(1.3-2))
 * 空间复杂度：O(1)
 **/
public class ShellSort extends SortBase {
    @Override
    public void sort(int[] a) {
        sort(a,ASC);
    }

    @Override
    public void sort(int[] a, String order) {
        checkOrder(order);

        int gap = getGap(a.length);
        int key, i, j;
        while (gap > 0) {
            for (i = gap; i < a.length; i++) {
                key = a[i];
                j = i - gap;

                if (order.equals(ASC)) {
                    while (j >= 0 && a[i] < a[j]) {
                        a[i] = a[j];
                        j = j - gap;
                    }
                }

                if (order.equals(DESC)) {
                    while (j >= 0 && a[i] > a[j]) {
                        a[i] = a[j];
                        j = j - gap;
                    }
                }
                a[j + gap] = key;
            }
            gap = (int) Math.floor(gap >> 1);
        }
    }

    //确定初始增量
    private int getGap(int length) {
        int gap = 1;
        while (gap < length) {
            gap = gap * 3 + 1;
        }
        return gap;
    }
}
