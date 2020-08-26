package sort;


/**
 * @author lilei
 * 基数排序
 * 稳定性：稳定
 * 时间复杂度：O(d(n+r))，r为关键字的范围，d为堆数
 * 空间复杂度：O(d(n+r))
 **/
public class RadixSort extends SortBase {
    @Override
    public void sort(int[] a) {
        sort(a, ASC);
    }

    @Override
    public void sort(int[] a, String order) {
        checkOrder(order);

        int max = getMax(a);
        int digit = 1;
        while ((max = max / 10) != 0) {
            digit++;
        }
        radix(a, 1, digit);

        if (order.equals(DESC)) {
            reverseOrder(a);
        }
    }

    //n：当前位数 total：总位数
    private void radix(int[] a, int n, int digit) {

        int[][] radix = new int[10][a.length];
        int[] order = new int[a.length];

            for (int i : a) {
                int point = i;
                int k = n;
                while (k-- > 1) {
                    point = point / 10;
                }

                if (point >= 10) {
                    point = point % 10;
                }
                radix[point][order[point]++] = i;
            }

        merge(radix, a, order);

        if (n == digit) {
            return;
        }
        radix(a, n + 1, digit);

    }


    //合并成行数组
    private void merge(int[][] a, int[] merge, int[] order) {
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            if (order[i] != 0) {
                for (int n = 0; n < order[i]; n++) {
                    merge[sum++] = a[i][n];
                }
            }
        }
    }
}
