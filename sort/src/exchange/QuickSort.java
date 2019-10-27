package exchange;

public class QuickSort {

    public static void quickSort(int[] element, int low, int high) {
        if (low < high) {
            int mid = partition(element, low, high);
            quickSort(element, low, mid - 1);
            quickSort(element, mid + 1, high);
        }
    }


    public static  int partition(int[] element, int low, int high){
        int baseElement = element[low];

        while (low < high) {
            while (low < high && baseElement <= element[high]) high--;
            element[low] = element[high];
            while (low < high && baseElement >= element[low]) low++;
            element[high] = element[low];
        }
        element[low] = baseElement;
        return  low;
    }


    public static void main(String[] args) {
        int [] ele = new int[]{1,5,3,4,7,3,7};
        quickSort(ele,0,ele.length-1);
        for(int i:ele){
            System.out.print(i+"  ");
        }

    }

}
