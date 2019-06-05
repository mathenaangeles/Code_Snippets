#include <stdio.h>
#define ROW 3  //row size
#define COL 3 //col size


char winnerHorizontal(char board [][COL]);
char winnerVertical(char board[][COL]);
char winnerDiagonal(char board[][COL]);
char winner(char board[][COL]);


int main(){
  //Create and Set up the Board (e.g. XXXOXOXXX)
  char tttBoard[ROW][COL];
  int r; int c;
  for(r = 0; r < COL; r++){
    for(c = 0; c < ROW; c++){
      scanf("%c",&tttBoard[r][c]);
    }
    printf("\n");
  }

  //Print the Board
  int i; int j;
  for(i = 0; i < COL; i++){
    for(j = 0; j < ROW; j++){
      printf("%c\t",tttBoard[i][j]);
    }
    printf("\n");
  }

  // Individual Functions
  printf("Horizontal Winner: %c\n",winnerHorizontal(tttBoard));
  printf("Vertical Winner: %c\n",winnerVertical(tttBoard));
  printf("Diagonal Winner: %c\n",winnerDiagonal(tttBoard));
  printf("Winner is: %c\n",winner(tttBoard));

  return 0;
}


//return the 'X' or 'O' for horizontal winner'. If no winner then '-'
char winnerHorizontal(char board[][COL]){
    char lastSymbol;
    char winH = '-';
    int r; int c;
    for(r = 0; r < ROW; r++){
      lastSymbol = board[r][0];
      for(c = 0; c < COL; c++){
        if(lastSymbol != board[r][c]){
          break;
        }
        if(lastSymbol != '-' && c == COL - 1 && (lastSymbol == board[r][c])){
          winH = lastSymbol;
        }
        lastSymbol = board[r][c];
      }
    }
    return winH;

}

//return the 'X' or 'O'for vertical winner. If no winner then '-'
char winnerVertical(char board[][COL]){
  //complete
  char lastSymbol;
  char winV='-';
  int r, c;
  for (c=0; c < COL; c++){
    lastSymbol=board[0][c];
    for (r=0; r<ROW; r++){
      if (lastSymbol!=board[r][c]){
        break;
      }
      if (lastSymbol !='-' && r == ROW-1 && (lastSymbol == board[r][c])){
        winV=lastSymbol;
      }
      lastSymbol=board[r][c];
    }
  }
  return winV; //change accordingly
}

//return the 'X' or 'O'for diagonal winner. If no winner then '-'
char winnerDiagonal(char board[][COL]){
  char lastSymbol;
  char winD='-';
  int r=ROW/2;
  int c=COL/2;
  lastSymbol=board[r][c];
  if ((lastSymbol==board[r-1][c-1] && lastSymbol==board[r+1][c+1]) || (lastSymbol==board[r-1][c+1] && lastSymbol==board[r+1][c-1])){
    winD=lastSymbol;
  }
  return winD;
}

/* Returns '_' (for tie) if there isn't a winner and
 * the symbol of the winner if there is one ('X' or 'O').
 */
char winner(char board[][COL]){
  char winner='-';
  if (winnerDiagonal(board)!='-' && (winnerVertical(board)=='-' || winnerVertical(board)==winnerDiagonal(board)) && (winnerHorizontal(board)=='-' || winnerHorizontal(board)==winnerDiagonal(board))){
    winner=winnerDiagonal(board);
  } else if (winnerVertical(board)!='-'&& (winnerDiagonal(board)=='-' || winnerDiagonal(board)==winnerVertical(board)) && (winnerHorizontal(board)=='-' || winnerHorizontal(board)==winnerVertical(board))){
    winner=winnerVertical(board);
  } else if (winnerHorizontal(board)!='-' && (winnerVertical(board)=='-' || winnerVertical(board)==winnerHorizontal(board)) && (winnerDiagonal(board)=='-' || winnerDiagonal(board)==winnerHorizontal(board))){
    winner=winnerHorizontal(board);
  }
  return winner;
}
