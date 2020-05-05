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
        int min = getMin(a);
        for (int i = 0; i < count.length; i++) {
            while (count[i]-- != 0) {

                if (order.equals(ASC)) {
                    a[sum++] = i + min;
                }

                if (order.equals(DESC)) {
                    a[--length] = i + min;
                }
            }
        }
    }

    //维护一个存储元素出现次数的数组
    private int[] count(int[] a) {
        int min  = getMin(a);
        int[] count = new int[getMax(a) - min + 1];
        for (int i : a) {
            int dv = i - min;
            count[dv]++;
        }
        return count;
    }


}
