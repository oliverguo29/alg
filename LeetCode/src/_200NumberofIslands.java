class _200NumberofIslands {
    public int numIslands(char[][] grid) {
        int count=0;

        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]=='1'){
                    dfs(grid,i,j);
                    count++;
                }
            }
        }
        return count;
    }

    public  void dfs(char[][] grid,int x,int y){
        if(x<0||x>=grid.length||y<0||y>=grid[0].length||grid[x][y]=='0'){
            return;
        }
        grid[x][y]='0';

        dfs(grid,x,y+1);
        dfs(grid,x,y-1);
        dfs(grid,x+1,y);
        dfs(grid,x-1,y);
    }
}