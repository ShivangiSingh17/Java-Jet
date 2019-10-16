#include <stdio.h>

int main(void){
  int a, b, i;
  scanf("%d %d", &a, &b);
  if(a%2==0){
    i=a;
  }
  else{
    i=a+1;
  }
  i+=2;
  while(i<b){
    printf("%d ", i);
    i+=2;
  }
  return 0;
}