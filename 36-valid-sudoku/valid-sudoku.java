class Solution {
    public boolean isValidSudoku(char[][] board) {
        // Check rows
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (board[i][j] == '.') {
                    continue;
                }
                for (int k = j + 1; k < 9; k++) {
                    if (board[i][j] == board[i][k]) {
                        return false;
                    }
                }
            }
        }
        // Check columns
        for (int j = 0; j < 9; j++) {
            for (int i = 0; i < 9; i++) {
                if (board[i][j] == '.') {
                    continue;
                }
                for (int k = i + 1; k < 9; k++) {
                    if (board[i][j] == board[k][j]) {
                        return false;
                    }
                }
            }
        }
        // Check 3 x 3 boxes
        for (int rowStart = 0; rowStart < 9; rowStart += 3) {
            for (int colStart = 0; colStart < 9; colStart += 3) {
                for (int r1 = rowStart; r1 < rowStart + 3; r1++) {
                    for (int c1 = colStart; c1 < colStart + 3; c1++) {
                        if (board[r1][c1] == '.') {
                            continue;
                        }
                        for (int r2 = r1; r2 < rowStart + 3; r2++) {
                            int startCol = (r2 == r1) ? c1 + 1 : colStart;
                            for (int c2 = startCol; c2 < colStart + 3; c2++) {
                                if (board[r1][c1] == board[r2][c2]) {
                                    return false;
                                }
                            }
                        }
                    }
                }
            }
        }
        return true;
    }
}