#include <stdio.h>

int DS(int n){
    int sum = 0;
    while (n > 0)
    {
        int l = n % 10;
        n /= 10;
        sum += l;
    }
    return sum;
}
int main(){
    int nc,n,i,sc;
    scanf("%d",&n);
    sc = n*n;
    if (n == DS(sc)){
        printf("Neon Number");
    }
    else{
        printf("Not Neon Number");
    }
    
}
