public class Piece {
    char type;

    public static String checkColor(char piece) {   //this checks the color of the piece
        if (piece == 'Q' || piece == 'K' || piece == 'B' ||
                piece == 'N' || piece == 'P' || piece == 'R') {
            return "White";
        } else {
            return "Black";
        }
    }

    public static boolean canMove(char piece, String loc1, String loc2,char[][] board) {
        Square square = new Square();         //this method checks if the pieces can move to input2
        ChessBoard chessBoard = new ChessBoard();
        int row1 = square.findRow1(loc1);
        int col1 = square.findCol1(loc1);
        int row2 = square.findRow2(loc2);
        int col2 = square.findCol2(loc2);
        if(chessBoard.getPiece(loc1,board) == chessBoard.getPiece(loc2,board)){
            return true;
        }
        if (chessBoard.controlBoard(loc2) == false){
        }else{
            return true;
        }
        if (chessBoard.isWhitePlaying() == "White"){
            if (chessBoard.getPiece(loc2,board) == ' ' || chessBoard.getPiece(loc2,board) == 'q' ||
                    chessBoard.getPiece(loc2,board) == 'n' || chessBoard.getPiece(loc2,board) == 'b' ||
                    chessBoard.getPiece(loc2,board) == 'k' || chessBoard.getPiece(loc2,board) == 'r' ||
                    chessBoard.getPiece(loc2,board) == 'p'){
            }else{
                return true;
            }
        }else{
            if (chessBoard.getPiece(loc2,board) == ' ' || chessBoard.getPiece(loc2,board) == 'Q' ||
                    chessBoard.getPiece(loc2,board) == 'N' || chessBoard.getPiece(loc2,board) == 'B' ||
                    chessBoard.getPiece(loc2,board) == 'K' || chessBoard.getPiece(loc2,board) == 'R' ||
                    chessBoard.getPiece(loc2,board) == 'P'){
            }else{
                return true;
            }
        }
        boolean pieceMove = false;
        if (piece == 'Q' || piece == 'q') {                //and different pieces has different moves so we must examine them one by one.
            pieceMove = Quenn.canMove(row1,row2,col1,col2,board);
        } else if (piece == 'K' || piece == 'k') {
            pieceMove = King.canMove(row1,row2,col1,col2,board);
        } else if (piece == 'B' || piece == 'b') {
            pieceMove = Bishop.canMove(row1,row2,col1,col2,board);
        } else if (piece == 'N' || piece == 'n') {
            pieceMove = Night.canMove(row1,row2,col1,col2,board);
        } else if (piece == 'P' || piece == 'p') {
            pieceMove = Pawn.canMove(row1,row2,col1,col2,board);
        } else if (piece == 'R' || piece == 'r') {
            pieceMove = Rook.canMove(row1,row2,col1,col2,board);
        }
        return pieceMove;
    }

    public static void move(char piece,String loc1, String loc2,char[][] board) {
        Square square = new Square();
        int row1 = square.findRow1(loc1);
        int col1 = square.findCol1(loc1);
        int row2 = square.findRow2(loc2);
        int col2 = square.findCol2(loc2);
        if (piece == 'P' && row2 == 7){
            piece = 'Q';
        }else if (piece == 'p' && row2 == 0){
            piece = 'q';
        }
        board[row1][col1] = ' ';
        board[row2][col2] = piece;
    }
}