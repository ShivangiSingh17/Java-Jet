#include <stdio.h>

long long int factorial(int n){
    if(n <= 1){
        return 1;
    }
    else{
        return (factorial(n-1)*n);
    }
}

int main(void){
    int n;
    printf("What is the factorial of ?\n");
    scanf("%d", &n);
    printf("YEP, the factorial is: %lld\n", factorial(n));

    return 0;
}