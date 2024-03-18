public class Square {     //this class turns inputs to row and column, so we can examine inputs like squares.
    public int findCol1(String loc1){
        int col1 = 10;
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
        return col1;
    }
    public int findRow1(String loc1){
        int row1 = 10;
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
        return row1;
    }
    public int findCol2(String loc2){
        int col2 = 10;
        if (loc2.charAt(0) == 'a') {
            col2 = 0;
        }
        if (loc2.charAt(0) == 'b') {
            col2 = 1;
        }
        if (loc2.charAt(0) == 'c') {
            col2 = 2;
        }
        if (loc2.charAt(0) == 'd') {
            col2 = 3;
        }
        if (loc2.charAt(0) == 'e') {
            col2 = 4;
        }
        if (loc2.charAt(0) == 'f') {
            col2 = 5;
        }
        if (loc2.charAt(0) == 'g') {
            col2 = 6;
        }
        if (loc2.charAt(0) == 'h') {
            col2 = 7;
        }
        return col2;
    }
    public int findRow2(String loc2){
        int row2 = 10;
        if (loc2.charAt(1) == '1') {
            row2 = 0;
        }
        if (loc2.charAt(1) == '2') {
            row2 = 1;
        }
        if (loc2.charAt(1) == '3') {
            row2 = 2;
        }
        if (loc2.charAt(1) == '4') {
            row2 = 3;
        }
        if (loc2.charAt(1) == '5') {
            row2 = 4;
        }
        if (loc2.charAt(1) == '6') {
            row2 = 5;
        }
        if (loc2.charAt(1) == '7') {
            row2 = 6;
        }
        if (loc2.charAt(1) == '8') {
            row2 = 7;
        }
        return row2;
    }
}
