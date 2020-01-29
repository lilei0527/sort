package sort;

//计数排序
public class CountSort extends SortBase {




    @Override
    public void sort(int[] a) {
        sort(a, ASC);
    }

    @Override
    public void sort(int[] a, String order) {
        checkOrder(order);

        int[] count = count(a);
        int sum = 0;
        int length = a.length;
        for (int i = 0; i < count.length; i++) {
            while (count[i]-- != 0) {

                if (order.equals(ASC)) {
                    a[sum++] = i + getMin(a);
                }

                if (order.equals(DESC)) {
                    a[--length] = i + getMin(a);
                }
            }
        }
    }

    //维护一个存储元素出现次数的数组
    private int[] count(int[] a) {
        int[] count = new int[getMax(a) - getMin(a) + 1];
        for (int i : a) {
            int dv = i - getMin(a);
            count[dv]++;
        }
        return count;
    }


}
