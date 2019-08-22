class _63UniquePathsII {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int [][] res = new int [obstacleGrid.length][obstacleGrid[0].length];
        //行不为1将行的值全部设置为1
        for(int i=0;i<obstacleGrid.length&&obstacleGrid[i][0]!=1;i++){
            res[i][0]=1;
        }

        //列不为1将列的值全部设置为1，为1的话，后边就不进行操作
        for(int j=0;j<obstacleGrid[0].length&&obstacleGrid[0][j]!=1;j++){
            res[0][j]=1;
        }
        //遍历，此值如果不为1=左值+上值，否则设置为0
        for(int i=1;i<obstacleGrid.length;i++){
            for(int j=1;j<obstacleGrid[0].length;j++){
                if(obstacleGrid[i][j]==1){
                    res[i][j]=0;
                }else {
                    res[i][j]=res[i-1][j]+res[i][j-1];
                }
            }
        }



        return res[obstacleGrid.length-1][obstacleGrid[0].length-1];
    }
}