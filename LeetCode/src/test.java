

public class test {

    public static void main(String[] args) {
     int res[][] = new int [3][3];
     for(int i =0;i<res.length;i++){
         for(int j=0;j<res[0].length;j++){
             res[i][j]=0;
             //System.out.print(res[i][j]+" ");
         }
         //System.out.println();
     }
     res[1][1]=1;

     _63UniquePathsII s = new _63UniquePathsII();
        int i = s.uniquePathsWithObstacles(res);
        System.out.println(i);

        //System.out.println( res);




    }
}
