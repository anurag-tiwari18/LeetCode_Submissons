class Solution {
    public void gameOfLife(int[][] board) {
        int m = board.length;
        int n = board[0].length;
        // int[][] copy = new int[m][n];
        // for(int i = 0 ;i<m;i++){
        //     copy[i] = board[i].clone();
        // }
        // for(int i =0;i<m;i++){
        //     for(int j = 0 ;j<n;j++){
                
        //         int lives = 0;

        //         //up
        //         if( i >0){
        //             if(copy[i-1][j] == 1) lives++;
        //         }
        //         //left 
        //         if( j >0){
        //             if(copy[i][j-1] == 1) lives++;
        //         } 
        //         //right 
        //         if( j < copy[0].length - 1){
        //             if(copy[i][j+1] == 1) lives++;
        //         }
        //         //down 
        //         if( i < board.length - 1){
        //             if(copy[i+1][j] == 1) lives++;
        //         } 
        //         if( i > 0 && j > 0){
        //             if(copy[i-1][j-1] == 1) lives++;
        //         } 
        //         if( i > 0 && j < board[0].length - 1){
        //             if(copy[i-1][j+1] == 1) lives++;
        //         } 
        //         if( i <board.length - 1 && j > 0){
        //             if(copy[i+1][j-1] == 1) lives++;
        //         } 
        //         if( i <board.length - 1 && j < board[0].length - 1){
        //             if(copy[i+1][j+1] == 1) lives++;
        //         }

        //         if(board[i][j] == 1){
        //             //live cell
        //            if(lives > 3) board[i][j] = 0;
        //            else if(lives < 2) board[i][j] = 0;
        //         }
        //         else {
        //             if(lives == 3) board[i][j] = 1; 
        //         } 
        //     }
        // }


        //Inplace

                for(int i =0;i<m;i++){
            for(int j = 0 ;j<n;j++){
                
                int lives = 0;

                //up
                if( i >0){
                    if(board[i-1][j] == 1 || board[i-1][j] == 3 ) lives++;
                }
                //left 
                if( j >0){
                    if(board[i][j-1] == 1 || board[i][j-1] == 3 ) lives++;
                } 
                //right 
                if( j < board[0].length - 1){
                    if(board[i][j+1] == 1 || board[i][j+1] == 3 ) lives++;
                }
                //down 
                if( i < board.length - 1){
                    if(board[i+1][j] == 1 || board[i+1][j] == 3 ) lives++;
                } 
                if( i > 0 && j > 0){
                    if(board[i-1][j-1] == 1 || board[i-1][j-1] == 3 ) lives++;
                } 
                if( i > 0 && j < board[0].length - 1){
                    if(board[i-1][j+1] == 1 || board[i-1][j+1] == 3 ) lives++;
                } 
                if( i <board.length - 1 && j > 0){
                    if(board[i+1][j-1] == 1 || board[i+1][j-1] == 3 ) lives++;
                } 
                if( i <board.length - 1 && j < board[0].length - 1){
                    if(board[i+1][j+1] == 1 || board[i+1][j+1] == 3 ) lives++;
                }

                if(board[i][j] == 1){
                    //live cell
                   if(lives > 3) board[i][j] = 3;
                   else if(lives < 2) board[i][j] = 3;
                }
                else {
                    if(lives == 3) board[i][j] = 2; 
                } 
            }
        }

        for(int i =0;i<m;i++){
            for(int j = 0 ;j<n;j++){
                if(board[i][j] == 2) board[i][j] = 1;
                else if(board[i][j] == 3) board[i][j] = 0;
              }
        }
    }
}