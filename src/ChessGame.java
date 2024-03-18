import java.util.Scanner;

public class ChessGame {
    public static void main(String[] args) {
        char[][] board = {{'R', 'N', 'B', 'Q', 'K', 'B', 'N', 'R'},
                {'P', 'P', 'P', 'P', 'P', 'P', 'P', 'P'},
                {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
                {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},              //creating board
                {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
                {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
                {'p', 'p', 'p', 'p', 'p', 'p', 'p', 'p'},
                {'r', 'n', 'b', 'q', 'k', 'b', 'n', 'r'}};
        Scanner reader = new Scanner(System.in);
        ChessBoard chessBoard = new ChessBoard();
        while (chessBoard.isGameEnded(chessBoard.player,board)) {   //end controller
            ChessBoard.printBoard(board);
            System.out.println("It's " + chessBoard.isWhitePlaying() + "'s turn");
            Piece piece = new Piece();
            piece.type = ' ';                         //this variable will take the chosen piece
            String loc1;                              //this is for first input
            String loc2;                              //this is for second input
            do {
                do {
                    System.out.print("Enter the location of the piece:");
                    loc1 = reader.next();
                } while (chessBoard.controlBoard(loc1));
                piece.type = chessBoard.getPiece(loc1,board); //this command can check what is it in that square
            } while (piece.type == ' ' ||
                    Piece.checkColor(piece.type) != chessBoard.whoPlays());// we can not play wrong color with this

            do {
                System.out.print("Enter the new location of the piece:");
                loc2 = reader.next();
            } while (piece.canMove(piece.type, loc1, loc2,board)); // checks if the chosen piece can move to input2
            piece.move(piece.type,loc1,loc2,board); // and if it can move, move it...
        }
        reader.close();
    }
}