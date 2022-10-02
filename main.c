#include <stdio.h>
#include <math.h>
//FINDING PALINDROME USING RECURSION.
int palindrome(int num){
    int digits;
    digits=(int)log10(num);
    if(num==0){
        return 0;
    }
    return((num%10)*pow(10,digits)+palindrome(num/10));
}
int main(){
    int number;
    printf("ENTER THE NUMBER:\n");
    scanf("%d",&number);
    if(palindrome(number)==number){
        printf("PALINDROME NUMBER:\n");
    }
    else{
        printf("NOT A PALINDROME NUMBER:\n");
    }
    return 0;
}

