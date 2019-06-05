// Prints 'Success' if the brackets are balanced, otherwise it prints the one-based index of where an inconsistency occurs.
#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <ctype.h>

#define MAXSIZE 100000

int top=-1;
char character;
int tracker;

char str[MAXSIZE];

void push(char character);
char pop();
char peek();
int isEmpty();
int isFull();

int checkingPairs(char open, char close);
int checkingBrackets(char input[]);



int main(){

  char input[MAXSIZE];

  scanf("%[^\n]s",input);

  if (checkingBrackets(input)){
    printf("Success\n");
  } else{
    printf("%d\n", tracker+1);

  }

  return 0;


}

/*

INPUT: The input is a charater to be inserted into the stack.
OUTPUT: NA

FUNTION: The function  checks if there is room in the stack for another element.
If the stack is full, it prints Stack Overflow. Otherwise, the character is
inserted into the stack, above the current top element.

*/


void push(char character){

    if(isFull()){
        printf("\nStack Overflow\n");
        return;
    }
    top=top+1;
    str[top]=character;
}

/*

INPUT: NA
OUTPUT: The output is the character that was removed.

FUNTION: The function checks if the stack contains no elements. If the stack is
empty, it prints Stack Underflow. Otherwise, the character at the top of the stack
or the most recently inserted element is removed and the funtion returns its value.

*/

char pop(){

    if(isEmpty()){
        printf("\nStack Underflow\n");
        return 0;
    }

    top=top-1;
    character = str[top];
    return character;
}

/*

INPUT: NA
OUTPUT: The output is either 1 (true) or 0 (false).

FUNTION: The function checks if the size or number of elements in the stack is zero,
in which case it is empty.

*/

int isEmpty(){

    if(top==-1){
        return 1;
    }else{
        return 0;
    }
}

/*

INPUT: NA
OUTPUT: The output is either 1 (true) or 0 (false).

FUNTION: The function checks if the size or number of elements in the stack is equal to
the maximum size initialized at the onset, in which case it is full.

*/

int isFull(){

    if(top==MAXSIZE-1){
        return 1;
    }else{
        return 0;
    }
}

/*

INPUT: NA
OUTPUT: The output is the value of the element at the top of the stack.

FUNTION: The function returns the value of the topmost element in the stack without
removing it.

*/

char peek(){
  return str[top];
}

/*

INPUT: The inputs are two characters, the first being an opening bracket and the second
being a closing bracket.
OUTPUT: The output is either 1 (true) or 0 (false).

FUNTION: The function checks wether or not the opening bracket matches the closing bracket,
such that '(' maps to ')', '{' maps to '}', and '[' maps to ']'.

*/

int checkingPairs(char open, char close){

  if (open=='(' && close==')'){
    return 1;
  } else if (open=='{' && close=='}'){
    return 1;
  } else if (open=='[' && close==']'){
    return 1;
  } else{
    return 0;
  }
}

/*

INPUT: The input is a array of characters.
OUTPUT: The output is either 1 (balanced) or 0 (not balanced).

FUNTION: The function iterates over each element in the stack and pushes every opening
brackets it encounters into the stack. The index of each opening bracket is also stored
in an array of integers, 'address'. Once a closing bracket is encountered, the function
checks if the stack is empty or wether the closing bracket matches the opening bracket
at the top of the stack. If it is empty or not a matching pair, then the function returns
0 and 'tracker' is set to the current index (the first unmatched closing bracket).
Otherwise, the element at the top of the stack is popped and its index is removed from
'address'. Once the function has gone through every element in the charcater array,
'tracker' is set to be the index of the first element in the stack (the first unmatched
opening bracket) and the function checks if the stack is empty. If it is empty, the
function return 1, indicating that it is balanced or if not, it returns 0, indicating the
character array is not balanced.


*/

int checkingBrackets(char input[]){

  int i;
  int j=0;
  int address[MAXSIZE];

  for (i=0;i<strlen(input);i++){
    if (input[i]=='(' || input[i]=='{' || input[i]=='['){
      push(input[i]);
      address[j]=i;
      j++;
    } else if(input[i]==')' || input[i]=='}' || input[i]==']'){
      if (isEmpty() || !checkingPairs(peek(), input[i])){
        tracker=i;
        return 0;
      }else{
        pop();
        j--;
      }
    }
  }
  tracker=address[0];
  return isEmpty();

}
