public class Pawn extends Piece{
    public static boolean canMove(int row1,int row2,int col1,int col2,char[][] board) {
        boolean pieceMove = false;
        if (row1 == 1 || row1 == 6){
            if(Math.abs(row2-row1) == 1){
                if (col2 == col1){
                    if(board[row2][col2] != ' '){
                        pieceMove = true;
                    }
                }else if(Math.abs(col2-col1) == 1){
                    if(board[row2][col2] == ' '){
                        pieceMove = true;
                    }
                }else{
                        pieceMove = true;
                    }
            }else if(Math.abs(row2-row1) == 2){
                if (col2 != col1 || board[row2][col2] != ' '){
                    pieceMove = true;
                }
        }else{
                if (col2 == col1) {
                    if (board[row2][col2] != ' ' && Math.abs(row2 - row1) != 1) {
                        pieceMove = true;
                    }
                } else if (Math.abs(col2 - col1) == 1) {
                    if (board[row2][col2] == ' ' && Math.abs(row2 - row1) != 1) {
                        pieceMove = true;
                    }
                } else {
                    pieceMove = true;
                }
            }
        }
        return pieceMove;
    }
}