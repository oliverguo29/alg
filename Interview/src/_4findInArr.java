public class _4findInArr {
    /**
     * 二维数组，左到右生序，上到下生序，给一个数，判断是否在二维数组中
     *
     * 从右上角开始找，小于它的在左边，大于它的在下边
     */
    public boolean find(int target,int [][]array){
        if(array==null||array.length==0||array[0].length==0){
            return false;
        }

        int rows=array.length;
        int cols=array[0].length;

        int r = 0;
        int c=cols-1;       //右上角

        while (r<=rows-1&&c>=0){
            if(target==array[r][c]){
                return true;
            }else if(target>array[r][c]){
                r++;
            }else {
                c--;
            }
        }
        return false;
    }
}
