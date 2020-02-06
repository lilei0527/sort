package sort;

import exception.ParamInvalidException;


public abstract class SortBase implements Sort {
    static final String DESC = "desc";
    static final String ASC = "asc";
    private Integer max;
    private Integer min;

    int getMin(int[] a) {
        if (min != null) {
            return min;
        }
        int min = a[0];
        for (int i : a) {
            if (i < min) {
                min = i;
            }
        }
        this.min = min;
        return min;
    }

    int getMax(int[] a) {
        if (max != null) {
            return max;
        }
        int max = a[0];
        for (int i : a) {
            if (i > max) {
                max = i;
            }
        }
        this.max = max;
        return max;
    }

    @Override
    public abstract void sort(int[] a);

    @Override
    public abstract void sort(int[] a, String order);

    void swap(int left, int right, int[] a, String order) {

        if ((order.equals(DESC) && a[left] < a[right]) || (order.equals(ASC) && a[left] > a[right])) {
            swap(left, right, a);
        }
    }

    void swap(int left, int right, int[] a) {
        int temp;
        temp = a[left];
        a[left] = a[right];
        a[right] = temp;
    }

    void checkOrder(String order) {
        if (!order.equals(ASC) && !order.equals(DESC)) {
            throw new ParamInvalidException("排序参数不合法");
        }
    }

    static void printArray(int[] array) {
        for (int a : array) {
            System.out.print(a + " ");
        }
    }

    void reverseOrder(int[] n) {
        int[] reverse = new int[n.length];
        for (int i = 0; i < reverse.length; i++) {
            reverse[i] = n[reverse.length - 1 - i];
        }
        System.arraycopy(reverse, 0, n, 0, n.length);
    }
}
