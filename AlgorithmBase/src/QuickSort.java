import java.util.Arrays;

/**
 * 快速排序算法
 * 快速排序的原理：选择一个关键值作为基准值。比基准值小的都在左边序列（一般是无序的），
 * 比基准值大的都在右边（一般是无序的）。一般选择序列的第一个元素。
 * 一次循环：从后往前比较，用基准值和最后一个值比较，如果比基准值小的交换位置，如果没有
 * 继续比较下一个，直到找到第一个比基准值小的值才交换。找到这个值之后，又从前往后开始比
 * 较，如果有比基准值大的，交换位置，如果没有继续比较下一个，直到找到第一个比基准值大的
 * 值才交换。直到从前往后的比较索引>从后往前比较的索引，结束第一次循环，此时，对于基准值
 * 来说，左右两边就是有序的了。
 */
public class QuickSort {

    public void quickSort(int arr[],int low,int high){
        //int arr[]={3,4,1,5,6,6,2};

        int start = low;  //0
        int end = high;  //6
        int key = arr[low];//定义基准值 //3

        while(end>start){             //6>0
            while (end>start&&arr[end]>=key) end--;   //6>0 2>=3 false
             if(arr[end]<=key){ //后面的值有小于关键值的    2<=3 true
                int temp = arr[end];                // temp = 2
                arr[end] = arr[start];               //arr[6] = 3
                arr[start] = temp;                   //arr[0] = 2
            }
            while (end>start&&arr[start]<=key) start++;   //arr[0]=2 <3 start=1 arr[1]=4<=3
            if(arr[start]>=key){                        //arr[1]=4 >=3
                int temp = arr[start];                    //temp =4
                arr[start] = arr[end];                    //arr[1] = arr[6]=3
                arr[end] = temp;                          //arr[6] = 4
            }
        }
        //arr[]={2,3,1,5,6,6,4}
        if(start>low) quickSort(arr,low,start-1); //start 1 > 0  0 ,0
        if(end<high) quickSort(arr,end+1,high);  // end 6

    }

    public static void main(String[] args) {
        QuickSort test = new QuickSort();
        int arr[]={3,4,1,5,6,6,2};
        System.out.println(Arrays.toString(arr));
        test.quickSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
}
