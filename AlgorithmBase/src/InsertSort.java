import java.util.Arrays;

/**
 * 插入排序算法(摸牌算法，左边一直有序)
 * 通过构建有序序列，对于未排序数据，在已排序序列中从后向前扫描，找到相应的位置并插入。
 * 插入排序非常类似于整扑克牌。在开始摸牌时，左手是空的，牌面朝下放在桌上。接着，一次从
 * 桌上摸起一张牌，并将它插入到左手一把牌中的正确位置上。为了找到这张牌的正确位置，要将
 * 它与手中已有的牌从右到左地进行比较。无论什么时候，左手中的牌都是排好序的。
 * 如果输入数组已经是排好序的话，插入排序出现最佳情况，其运行时间是输入规模的一个线性函
 * 数。如果输入数组是逆序排列的，将出现最坏情况。平均情况与最坏情况一样，其时间代价是(n2)。
 */
public class InsertSort {

    public static int[] insertSort(int[] arr){
        //int arr[] = {7,2,5,1,3,4,8};
        int i;
        for(i=1;i<arr.length;i++){
            int current = arr[i];//要插入的元素 2
            int index = i-1; //要比较的元素 7
             //寻找前一个作比较
            //前提是寻找的比较的元素必须在数组中，index>=0;
            //如果要插入的元素一直比 比较的元素 小，就一直往左比较，被比较的元素需要往右移动
            while(index>=0&&current<arr[index]){
                arr[index+1]=arr[index];//移动元素 ，把当前元素的位置给前一个元素
                System.out.println("移动元素："+Arrays.toString(arr));
                index=index-1;
            }
            //插入元素
            arr[index+1]=current;
            System.out.println("第"+i+"次："+Arrays.toString(arr));
        }
        return arr;
    }

    public static void main(String[] args) {
        InsertSort test = new InsertSort();
        int arr[] = {7,2,5,1,3,4,8,4};
        System.out.println(Arrays.toString(arr));
        int result[] = test.insertSort(arr);
        System.out.println(Arrays.toString(result));
    }

}
