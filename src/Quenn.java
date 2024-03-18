public class Quenn extends Piece{
    public static boolean canMove(int row1,int row2,int col1,int col2,char[][] board) {
        boolean pieceMove = false;
        if (row1 != row2 && col1 != col2){
            if(Math.abs(row2-row1) != Math.abs(col2-col1)){
                pieceMove = true;
            }else{
                if(row2>row1 && col2>col1){
                    for(int i=row1+1,j=col1+1;i<row2;i++,j++){
                        if (board[i][j] != ' ') {
                            pieceMove = true;
                        }
                    }
                }else if(row2>row1 && col2<col1){
                    for(int i=row1+1,j=col1-1;i<row2;i++,j--){
                        if (board[i][j] != ' ') {
                            pieceMove = true;
                        }
                    }
                }else if(row2<row1 && col2>col1){
                    for(int i=row1-1,j=col1+1;i<row2;i--,j++){
                        if (board[i][j] != ' ') {
                            pieceMove = true;
                        }
                    }
                }else if(row2<row1 && col2<col1){
                    for(int i=row1-1,j=col1-1;i<row2;i--,j--){
                        if (board[i][j] != ' ') {
                            pieceMove = true;
                        }
                    }
                }
            }
        }else if(row1 == row2 || col1 == col2){
            if (row2 > row1){
                for (int i=row1+1;i<row2;i++){
                    if (board[i][col1] != ' '){
                        pieceMove = true;
                    }
                }
            }else if (row1 > row2){
                for (int i=row1-1;i>row2;i--){
                    if (board[i][col1] != ' '){
                        pieceMove = true;
                    }
                }
            }else if (col2 > col1){
                for (int i=col1+1;i<col2;i++){
                    if (board[i][col1] != ' '){
                        pieceMove = true;
                    }
                }
            }else if (col1 > col2){
                for (int i=col1-1;i>col2;i--){
                    if (board[i][col1] != ' '){
                        pieceMove = true;
                    }
                }
            }
        }
        return pieceMove;
    }
}
