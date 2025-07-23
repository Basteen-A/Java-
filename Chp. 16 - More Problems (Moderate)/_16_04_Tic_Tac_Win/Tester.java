<<<<<<< HEAD
// github.com/Basteen-A
=======
// github.com/Basteen-A
>>>>>>> fc671dfccc4c844803cd16bc4e158dfcfa4a68fb

package _16_04_Tic_Tac_Win;

public class Tester {
    public static void main(String[] args) {
        System.out.println("*** Test 16.4: Tic Tac Win\n");
        char[][] board = {{'x', 'o', 'x'},
                          {' ', ' ', ' '},
                          {' ', ' ', ' '}};
        test(board); // converted to "int" value should be 23 for the above board
    }

    private static void test(char[][] board) {
        int intValue = TicTacWin.convertBoardToInt(board);
        System.out.println("Board int value: " + intValue);
    }
}
