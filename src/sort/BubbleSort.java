package sort;

//冒泡排序
public class BubbleSort extends SortBase {
    @Override
    public void sort(int[] a) {
        sort(a,ASC);
    }

    @Override
    public void sort(int[] a, String order) {
        checkOrder(order);

        for(int i=0;i<a.length-1;i++){
            for(int j=0;j<a.length-i-1;j++){
                swap(j,j+1,a,order);
            }
        }
    }
}
