public class King extends Piece{
    public static boolean canMove(int row1,int row2,int col1,int col2,char[][] board) {
        boolean pieceMove = false;
        if(Math.abs(row2-row1)>1 || Math.abs(col2-col1)>1){
            pieceMove = true;
        }
        return pieceMove;
    }
}
