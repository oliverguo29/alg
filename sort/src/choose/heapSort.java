package choose;

public class heapSort {
    //数组的第一个元素与后面的元素交换，因为第一个元素总是当前堆的最小元素
    //注意在排序的时候堆是在减小的
    //建立堆的过程就是完全二叉树，从下到上调整堆的过程，i=array.length/2开始
    //依次向上调整，i=array.length/2是最后一个节点的父节点i=0是第一个节点
    //交换位置
    public static void heapSort(int[] element) {

        //建堆
        int length = element.length;
        for (int i = length / 2 - 1; i >= 0; i--) {
            //adjustHeap(element, i, length - 1);
        }

        int tmp;
        for (int j = length - 1; j >= 0; j--) {
            tmp = element[j];
            element[j] = element[0];
            element[0] = tmp;

            //adjustHeap(element, 0, j - 1);

        }
    }

    public static void adjustHeap(int[] element, int start, int end) {
        int tmp = element[start];
        for (int i = 2 * start + 1; i <= end; i = 2 * i + 1) {
            //定位父节点的左右孩子值较大的节点
            if (i < end && element[i] < element[i + 1]) {
                i++;
            }
            //父节点比左右孩子值都大,则跳出循环
            if (tmp > element[i]) {
                break;
            }
            //进行下一轮的筛选
            element[start] = element[i];
            start = i;
        }
        element[start] = tmp;
    }


    public static void main(String[] args) {
        int ele[] = new int[]{ 1,5,7,3,2,9,4};
        heapSort(ele);
        for(int i:ele){
            System.out.println(i);
        }
    }
}
