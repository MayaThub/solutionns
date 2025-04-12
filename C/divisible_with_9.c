#include <stdio.h>

int dig_sum(int n){
    int nl = 0;
    while (n > 0)
    {
        int l = n%10;
        n /= 10;
        nl += l;
    }
    return nl;
}

int isDiv9(int n){
    if (n < 10)
    {
        return (n == 9)? 1 : 0;
    }
    n = dig_sum(n);
    return isDiv9(n);
    
}

int main(){
    int n;
    scanf("%d",&n);

    if (isDiv9(n) == 1)
    {
        printf("True");
    }
    else{
        printf("False");
    }
    
}
