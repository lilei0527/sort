package sort;

//希尔排序
public class ShellSort extends SortBase {
    @Override
    public void sort(int[] a) {
        sort(a,ASC);
    }

    @Override
    public void sort(int[] a, String order) {
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
            gap = (int) Math.floor(gap / 2);
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
