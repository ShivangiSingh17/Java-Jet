#include <stdio.h>

int main(void) {
  float n, fat;
  scanf("%f", &n);
  fat=n;
  if(n!=0){
    while(n>1){
      fat*=(n-1);
      n--;
    }
  }
  else{
    fat=1;
  }
  printf("%.0f\n", fat);
  return 0;
}