public class Night extends Piece{
    public static boolean canMove(int row1,int row2,int col1,int col2,char[][] board) {
        boolean pieceMove = false;
        if(col2-col1 == 2){
            if(Math.abs(row2-row1) != 1){
                pieceMove = true;
            }
        }else if(col1-col2 == 2){
            if(Math.abs(row2-row1) != 1){
                pieceMove = true;
            }
        }else if(row2-row1 == 2){
            if(Math.abs(col2-col1) != 1){
                pieceMove = true;
            }
        }else if(row1-row2 == 2){
            if(Math.abs(col2-col1) != 1){
                pieceMove = true;
            }
        }
        return pieceMove;
    }
}
