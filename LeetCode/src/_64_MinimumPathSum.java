/**
 * [
 *   [1,3,1],
 *   [1,5,1],
 *   [4,2,1]
 * ]
 */

public class _64_MinimumPathSum {

    public static void main(String[] args) {
        int [][] grid = {{1, 3, 1},{1, 5, 1},{4, 2, 1}};
        System.out.println(grid.length);
        minPathSum(grid);
    }
    public static  int minPathSum(int[][] grid) {
        int m = grid.length, n = grid[0].length;

        int dp[]  = new int [n];

        for(int i = 0; i <  m; i++){
            for(int j = 0; j < n; j++){
                if(j == 0){
                    //第一列
                    dp[j] = dp[j];
                }else if(i == 0){
                    //第一行
                    dp[j] = dp[j - 1];
                }else {
                    dp[j] = Math.min(dp[j-1], dp[j]);
                }
                dp[j] += grid[i][j];
            }
        }
        return dp[n-1];
    }
}
