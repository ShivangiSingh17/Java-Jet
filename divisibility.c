#include <stdio.h>

int main(void){
    int i;
    printf("All the numbers divisible by 7 are: \n");
    printf("98");
    for(i = 97; i >= 1; i--){
        if(i % 7 == 0){
            printf(" %d", i);
        }
    }
    return 0;
}