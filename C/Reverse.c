// Reverses string input and reverts the string back to its original form.
#include <stdio.h>
#define MAXSIZE 100

void reverse(char data[], int size);
void reverseswap(char data[], int size);

int main(){

  //Creating array of characters
  char myData[MAXSIZE];
  printf("Input:\n");
  scanf("%[^\n]%*c",myData);
  int i; //loop variable
  /*
  for(i = 0; i < MAXSIZE; i++){ // Prints the input
    if (myData[i+1]=='\0'){
      printf("%c",myData[i]);
    }else{
      printf("%c", myData[i]);
    }
    if (myData[i]=='\0'){
      break;
    }
  }
  */
  reverse(myData, MAXSIZE); //Calls the reverse function
  printf("\nThe reverse of the input is...\n ");
  for(i = 0; i < MAXSIZE; i++){
    if (myData[i+1]=='\0'){
      printf("%c",myData[i]);
    }else{
      printf("%c", myData[i]);
    }
    if (myData[i]=='\0'){
      break;
    }
  }
  printf("\n");
  reverseswap(myData, MAXSIZE); //Calls the reverse function again to get the original value back
  printf("\nand when reverted back to its original form is...\n ");
  for(i = 0; i < MAXSIZE; i++){
    if (myData[i+1]=='\0'){
      printf("%c",myData[i]);
    }else{
      printf("%c", myData[i]);
    }
    if (myData[i]=='\0'){
      break;
    }
  }
  printf("\n");
  return 0;
}

void reverse(char data[], int size){
  size=0;
  while(data[size]!='\0'){
    size++;
  }
  char myData2[size];
  int i=0;
  int j;
  for (j=size-1;j>=0;j--){
    myData2[i]=data[j];
    i++;
  }
  int k=0;
  for (i=0; i<size; i++){
    data[k]=myData2[i];
    k++;
  }
}

void reverseswap(char data[], int size){
  size=0;
  while(data[size]!='\0'){
    size++;
  }
  int i;
  int tmp=0;
  for (i=0; i<size/2; i++){
    tmp=data[i];
    data[i]=data[size-1-i];
    data[size-1-i]=tmp;
  }

}
