class _289GameofLife {
    public void gameOfLife(int[][] board) {
        int length = board.length;
        int width = board[0].length;

        //遍历整个board
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < width; j++) {
                int count = countLife(board, i, j);
                int cur = board[i][j];
                if (cur == 1) {         //life
                    if (count < 2 || count > 3) {   //die next generation
                        continue;           //01
                    }
                    if (count >= 2 && count <= 3) { // live in next generation
                        board[i][j] = 3;      //11
                    }
                } else {                     //died
                    if (count == 3) {           //live next generation
                        board[i][j] = 2;      //10
                    }
                }
            }
        }
        //update
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < width; j++) {
                board[i][j] >>= 1;
            }
        }
    }

    private int countLife(int[][] board, int r, int c){
        int length =board.length-1;
        int width = board[0].length-1;

        int count =0;

        for(int i=r-1;i<=r+1;i++){
            for(int j=c-1;j<=c+1;j++){
                if(i<0||j<0||i>length||j>width||(i==r&&j==c)){  //判断在边界中，且不是自己
                    continue;
                }
                if((board[i][j]&1)==1){     //可能包含下一轮的状态，因此要与最低位相与，获得最低位
                    count++;
                }
            }
        }
        return  count;
    }
}









//        int count =0;
//
//        for(int i=c-1;i<=c+1;i++){
//            for(int j=r-1;j<=r+1;j++){
//                if(i<0||i>board.length-1||j<0||j>board[0].length-1||(i==c&&j==r)){
//                    continue;
//                }
//
//                if((board[i][j]&1)==1){
//                    count++;
//                }
//
//            }
//        }
//
//        return count;
//    }
