#include <stdio.h>

int main(){
    int nc,n,i,sum = 0,pro = 1;
    scanf("%d",&n);
    while (n > 0)
    {
        int l = n % 10;
        n /= 10;
        sum += l;
        pro *= l;
    }
    if (sum == pro){
        printf("Spy Number");
    }
    else{
        printf("Not Spy Number");
    }
    
}
