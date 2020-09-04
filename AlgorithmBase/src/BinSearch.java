/**
 * 二分查找
 又叫折半查找，要求待查找的序列有序。每次取中间位置的值与待查关键字比较，如果中间位置
 的值比待查关键字大，则在前半部分循环这个查找的过程，如果中间位置的值比待查关键字小，
 则在后半部分循环这个查找的过程。直到查找到了为止，否则序列中没有待查的关键字。
 */
public class BinSearch {

    public static int binSearch(int []array,int a){
        // int arr[]={1,2,3,4,5,6}; int a=2;
        int low = 0;//低位
        int height = array.length-1;//高位 6
        int mid;
        //循环判断，如果 低位的值一直小于等于高位的值 可以继续寻找，否则找不到
        while(low<=height){
            //先定义中间位置，（低位+高位）/2 ; //向下取整
            mid = (low+height)/2; //3
            //先判断这个中间位置是不是要找的值
            if(array[mid]==a){
                return mid+1;
            }else if(array[mid]<a){ //如果中间值小于寻找值，说明目标值在右边，往后查找,那么low要定成mid+1
                low = mid+1;
            }else{ //向左查找
                height = mid-1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        BinSearch test= new BinSearch();
        int arr[] = {1,2,3,4,5,6};
        int target = 0;
        int result = test.binSearch(arr,target);
        System.out.println(result);
    }

}
