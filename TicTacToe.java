package TicTacToe;

import java.util.*;
class TicTacToe
        {
        static final int END_POSITION = 9;
        static final int START_POSITION = 1;
        static char[] board =  {'-','-','-','-','-','-','-','-','-','-'};
        static int count;
        static final int ONE = 1, TWO = 2, THREE = 3, FOUR = 4, FIVE = 5, SIX = 6, SEVEN = 7, EIGHT = 8, NINE = 9;
public void resetBoard()
        {
                System.out.println("********************** Wellcome To Tic Tac Toe **********************");
                System.out.println("Resetting Board");

                 int position;
                for(position = START_POSITION ; position <= END_POSITION ; position++ )
                {
                        board[position] = '-';
                }
        }
         public void DisplayBoard()
        {
                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                System.out.println("    |-----|-----|-----| ");
                System.out.println("    |  "+board[ONE]+"  |  "+board[TWO]+"  |  "+board[THREE]+"  |");
                System.out.println("    |-----|-----|-----| ");
                System.out.println("    |  "+board[FOUR]+"  |  "+board[FIVE]+"  |  "+board[SIX]+"  |");
                System.out.println("    |-----|-----|-----| ");
                System.out.println("    |  "+board[SEVEN]+"  |  "+board[EIGHT]+"  |  "+board[NINE]+"  |");
                System.out.println("    |-----|-----|-----| ");
                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        }

        public static void main(String[] args)
                {
                        TicTacToe Game = new TicTacToe();
                        Game.resetBoard();
                        Game.DisplayBoard();
        }
}

