#include <stdio.h>
#include <math.h>
#include <stdlib.h>

int countDig(int num){
    return (num == 0) ? 1 : (int)log10(abs(num)) + 1;
}
int main(){
    int sum = 0,c,n;
    scanf("%d",&n);
    c = n;
    
    for(int i = countDig(n);i > 0;i--){
        sum += pow(n%10,i);
        n /= 10;
    }

    const char *res = (sum == c) ? "True" : "False";

    printf("%s",res);
}
