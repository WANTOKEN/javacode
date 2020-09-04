import java.util.Arrays;

/**
 * 冒泡排序算法（把大的往后排）
 * （1）比较前后相邻的二个数据，如果前面数据大于后面的数据，就将这二个数据交换。
 * （2）这样对数组的第 0 个数据到 N-1 个数据进行一次遍历后，最大的一个数据就“沉”到数组第 N-1 个位置。
 * （3）N=N-1，如果 N 不为 0 就重复前面二步，否则排序完成。
 */
public class BubbleSort {

    public static int[] bubbleSort(int[] arr,int n){
        //int a[] ={4,6,1,3,6,9,0};
        int i,j; //定义行和列
        for(i=0;i<n;i++){ // 第n次遍历
            for(j=1;j<n-i;j++){ //从第1个元素到未被排序的元素，因为最后一个是排好顺序的
                //如果后面的小于前面的就交换,这样就会把最大的数字排在最后
                if(arr[j]<arr[j-1]){
                    int temp =  arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
            }
            System.out.println("第"+i+"次:"+Arrays.toString(arr));
        }
        return arr;

    }

    public static void main(String[] args) {
        int arr[] ={4,6,1,3,6,9,0,8};
        System.out.println(Arrays.toString(arr));
        BubbleSort test = new BubbleSort();
        int result[]  = test. bubbleSort(arr,arr.length);
        System.out.println(Arrays.toString(result));

    }
}
