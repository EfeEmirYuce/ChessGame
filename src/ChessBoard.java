public class ChessBoard {
    public static void printBoard(char[][] board) {
        System.out.println("    A   B   C   D   E   F   G   H");
        System.out.println("  ---------------------------------");
        for (int row = 7; row > -1; --row) {
            System.out.print(row + 1 + " ");        // this method prints the board with for loops
            for (int col = 0; col < 8; ++col) {     //I will be honest i got some inspiration from tictactoe lab
                System.out.print("|");
                System.out.print(" " + board[row][col] + " ");
                if (col == 7) {
                    System.out.print("| ");
                    System.out.print(row + 1);
                }
            }
            System.out.println();
            System.out.println("  ---------------------------------");
        }
        System.out.println("    A   B   C   D   E   F   G   H");
    }

    public static boolean isGameEnded(String player,char[][] board) {
        boolean endGame = false;                  //this method checks if tha game is over
        if (player == "Black"){                   //if black is the current player that means white played last,
            for(int row=0;row<8;row++){           // so we will check black pieces if any of them still exist.
                for(int col=0;col<8;col++){
                    if(board[row][col] == 'q' || board[row][col] == 'k' || board[row][col] == 'p' ||
                            board[row][col] == 'n' || board[row][col] == 'r' || board[row][col] == 'b'){
                        endGame = true;
                    }
                }
            }
        }else{
            for(int row=0;row<8;row++){
                for(int col=0;col<8;col++){
                    if(board[row][col] == 'Q' || board[row][col] == 'K' || board[row][col] == 'P' ||
                            board[row][col] == 'N' || board[row][col] == 'R' || board[row][col] == 'B'){
                        endGame = true;
                    }
                }
            }
        }
        return endGame;
    }

    String player = "White";

    public String whoPlays() {       //this checks who is the current player but also changing the player
        if (player == "White") {
            player = "Black";
            return "White";
        } else {
            player = "White";
            return "Black";
        }
    }

    public String isWhitePlaying() {   //this is just checking who is the current player
        if (player == "White") {
            return "White";
        } else {
            return "Black";
        }
    }

    public char getPiece(String loc1,char[][] board) {
        int row1 = 10;                         //this function turns our inputs to row and column
        int col1 = 10;                         // so we can process them
        if (loc1.charAt(0) == 'a') {
            col1 = 0;
        }
        if (loc1.charAt(0) == 'b') {
            col1 = 1;
        }
        if (loc1.charAt(0) == 'c') {
            col1 = 2;
        }
        if (loc1.charAt(0) == 'd') {
            col1 = 3;
        }
        if (loc1.charAt(0) == 'e') {
            col1 = 4;
        }
        if (loc1.charAt(0) == 'f') {
            col1 = 5;
        }
        if (loc1.charAt(0) == 'g') {
            col1 = 6;
        }
        if (loc1.charAt(0) == 'h') {
            col1 = 7;
        }
        if (loc1.charAt(1) == '1') {
            row1 = 0;
        }
        if (loc1.charAt(1) == '2') {
            row1 = 1;
        }
        if (loc1.charAt(1) == '3') {
            row1 = 2;
        }
        if (loc1.charAt(1) == '4') {
            row1 = 3;
        }
        if (loc1.charAt(1) == '5') {
            row1 = 4;
        }
        if (loc1.charAt(1) == '6') {
            row1 = 5;
        }
        if (loc1.charAt(1) == '7') {
            row1 = 6;
        }
        if (loc1.charAt(1) == '8') {
            row1 = 7;
        }
        return board[row1][col1];
    }

    public boolean controlBoard(String loc) {   //this method checks if the input1 out of index
        if ((loc.charAt(0) == 'a' || loc.charAt(0) == 'b' || loc.charAt(0) == 'c'
                || loc.charAt(0) == 'd' || loc.charAt(0) == 'e' || loc.charAt(0) == 'f'
                || loc.charAt(0) == 'g' || loc.charAt(0) == 'h') && (loc.charAt(1) == '1'
                || loc.charAt(1) == '2' || loc.charAt(1) == '3'
                || loc.charAt(1) == '4' || loc.charAt(1) == '5' || loc.charAt(1) == '6'
                || loc.charAt(1) == '7' || loc.charAt(1) == '8')) {
            return false;
        } else {
            return true;
        }
    }
}
