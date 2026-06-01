class Solution {
    public boolean isValidSudoku(char[][] board) {
        int freqrow[][] = new int[9][9];
        int freqcol[][] = new int[9][9];
        int freqsq[][] = new int[9][9];
        for(int i = 0; i<9; i++)
        {
            for(int j = 0; j<9; j++)
            {
                if(board[i][j] == '.')
                {
                    continue;
                }
                int x = board[i][j]-'1';
                int sq = (i/3)*3 + (j/3);
                if(freqrow[i][x] ==1 || freqcol[j][x] == 1 || freqsq[sq][x] == 1)
                {
                    return false;
                }
                freqrow[i][x] = 1;
                freqcol[j][x] = 1;
                freqsq[sq][x] = 1;
            }
        }   
        return true;
    }
}