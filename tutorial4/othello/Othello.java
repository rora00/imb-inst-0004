import java.util.Scanner;

public class Othello {

  private final int WIDTH;
  private int[][] board;
  private int player;

  public static void main(String[] args) {
    /*
      The main function repeatedly asks for players to propose moves
      and attempts them until the game is over. It then reports the winner.
     */
    Scanner scanner = new Scanner(System.in);
    Othello game = new Othello(8);
    System.out.println(game);
    while (!game.isGameOver()) {
      System.out.println(
        "Player " + game.player + " enter row and column of move:");
      int row = scanner.nextInt();
      int col = scanner.nextInt();
      if (game.attemptMove(row, col)) {
        System.out.println(game);
      } else {
        System.out.println("Invalid move!");
      }
    }
    // at end of game
    if (game.player1Score() > game.player2Score()) {
      System.out.println("Player 1 wins!");
    } else if (game.player1Score() < game.player2Score()) {
      System.out.println("Player 2 wins!");
    } else {
      System.out.println("It's a draw!");
    }
  }

  public Othello() {
    WIDTH = 8;
    initialiseBoard();
  }

  public Othello(int set_width) {
    /*
      Get a different size board
     */
    WIDTH = set_width;
    initialiseBoard();
  }

  private void initialiseBoard() {
    /* 
      postconditions:
        board and player is initialised
     */
    board = new int[WIDTH][WIDTH];
    board[WIDTH/2 -1][WIDTH/2-1] = 1;
    board[WIDTH/2 -1][WIDTH/2] = 2;
    board[WIDTH/2][WIDTH/2] = 1;
    board[WIDTH/2][WIDTH/2-1] = 2;
    player = 1;
  }

  private boolean attemptMove(int row, int col) {
    /*
      inputs:
        (row, col) is the proposed position of the new counter
      preconditions:
        player is valid
        board is valid game state
      postconditions:
        if (row, col) is a valid move then update board to new valid board state
        switch to the next player, and update. Otherwise do nothing.
      returns:
        true if (row, col) is a valid move
     */

      // YOU SHOULD FIRST COMPLETE STEP a) AND MAP OUT YOUR SOLUTION.
      // WHEN READY, COMPLETE THIS METHOD AND ANY HELPER METHODS YOU INVENT.
  }


  // Some other methods provided to help you along.
  public boolean isGameOver() {
    /*
      preconditions:
        board is a valid board state
      returns:
        true if there are no unoccupied board positions
     */
    for(int[] row : board) {
      for(int cell : row) {
        if (cell == 0) {
          return false;
        }
      }
    }
    return true;
  }

  public static int otherPlayer(int player) {
    /*
      inputs:
        player specifies the player of interest
      preconditions:
        player is valid
      returns:
        the id of the other valid player
     */
    // if player is 1 return 2, if player is 2 return 1
    return 3 - player;
  }

  public int player1Score() {
    int score = 0;
    for(int[] row : board) {
      for(int cell : row) {
        if (cell == 1) {
          score += 1;
        }
      }
    }
    return score;
  }

  public int player2Score() {
    return WIDTH*WIDTH - player1Score();
  }

  public String toString() {
    String s = "Othello\n-------\n\n";
    s += "Current player: " + this.player + "\n\n";
    // index the columns
    s += "\t";
    for ( int i = 0 ; i < WIDTH ; i++) {
        s += i + " ";
    }
    s += "\n\n";
    // output the board with row indices 
    for ( int i = 0 ; i < WIDTH ; i++) {
      s += i + "\t";
      for ( int j = 0 ; j < WIDTH ; j++) {
          s += Integer.toString(board[i][j]) + " ";
      }
      s += "\n";
    }    
    return s;
  }

}
