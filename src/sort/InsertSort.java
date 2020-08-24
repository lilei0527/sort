package sort;

/**
 * @author lilei
 * 插入排序
 * 稳定性：稳定
 * 时间复杂度：O(n^2)
 * 空间复杂度：O(1)
 **/
public class InsertSort extends SortBase {
    @Override
    public void sort(int[] a) {
        sort(a, ASC);
    }

    @Override
    public void sort(int[] a, String order) {
        checkOrder(order);

        int i, j, key;
        for (i = 1; i < a.length; i++) {
            j = i - 1;
            //将插入的元素保存到临时变量
            key = a[i];
            if (order.equals(ASC)) {
                while (j >= 0 && key < a[j]) {
                    a[j + 1] = a[j];
                    j--;
                }
            }

            if (order.equals(DESC)) {
                while (j >= 0 && key > a[j]) {
                    a[j + 1] = a[j];
                    j--;
                }
            }
            a[j + 1] = key;
        }
    }
}
