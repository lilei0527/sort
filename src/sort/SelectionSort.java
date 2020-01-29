package sort;

//选择排序
public class SelectionSort extends SortBase {
    public void sort(int[] a) {
        sort(a, "11");
    }

    @Override
    public void sort(int[] a, String order) {
        checkOrder(order);

        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                swap(i, j, a, order);
            }
        }
    }
}
