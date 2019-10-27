package select;

public class HeapSort {
    public static void heapSort(int[] element) {
        //step1:建堆
        int length = element.length;
        for (int i = length / 2 - 1; i >= 0; i--) {
            adjustHeap(element, i, length - 1);
        }
        //step2:交换位置,调整堆结构
        int tmp;
        for (int j = length - 1; j >= 0; j--) {
            tmp = element[j];
            element[j] = element[0];
            element[0] = tmp;
            adjustHeap(element, 0, j - 1);
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
        int [] ele = new int[]{1,5,3,4,7,3,8};
        heapSort(ele);
        for(int i:ele){
            System.out.print(i+"  ");
        }

    }
}
