package sort;


/**
 * @author lilei
 * 计数排序
 * 稳定性：稳定
 * 时间复杂度：O(n+k)  k为a[]的最大最小值的差值
 * 空间复杂度：O(k)    要申请大小为k的数组空间
 * 试用场景：只能为整数排序，并且有额外的空间开销，当k很大时算法的时间复杂度和空间复杂度都会上升，只适用于k很小的情形
 **/
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
        int min = getMin(a);
        int[] count = new int[getMax(a) - min + 1];
        for (int i : a) {
            int dv = i - min;
            count[dv]++;
        }
        return count;
    }


}
