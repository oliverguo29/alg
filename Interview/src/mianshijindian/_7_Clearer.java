package mianshijindian;

public class _7_Clearer {
    /**
     *
     * 清除带有0的行和列
     * 1 2 3         0 0 3
     * 0 1 2    -》  0 0 0
     * 0 0 1         0 0 0
     *
     * 1。 先创建一个行和列的boolean数组
     * 2。 遍历整个矩阵，如果遇到0，将当前的行和列标记为true
     * 3。 重新遍历整个boolean矩阵，行或者列有true则为0
     *
     */
    public static void main(String[] args) {
        int [][] mat = new int [][]{{1,2,3},{0,1,2},{0,0,1}};

        int[][] ints = clearZero(mat, 3);
        for(int i=0;i<ints.length;i++){
            for(int j=0;j<ints.length;j++) {
                System.out.print(ints[i][j]+" ");
             }
            System.out.println();
            }
    }


    public static  int[][] clearZero(int[][] mat, int n) {
        // write code here
        if(mat.length==0||mat[0].length==0){
            return mat;
        }

        boolean [] row = new boolean [n];
        boolean [] column = new boolean[n];

        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat.length;j++){
                if(mat[i][j]==0){
                    row[i]=true;                //遍历整个矩阵，如果遇到0，将当前的行和列标记为true
                    column[j]=true;

                }

            }
        }

        for(int i=0;i<row.length;i++){
            for(int j=0;j<column.length;j++){
                if(row[i]||column[j]){         //重新遍历整个boolean矩阵，行或者列有true则为0
                    mat[i][j]=0;
                }
            }
        }

        return  mat;
    }
}
