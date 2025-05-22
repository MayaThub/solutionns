#include <stdio.h>
#include <math.h>

int main(){
    int fsum = 1,n;
    scanf("%d",&n);
    
    for(int i = 2;i < n;i++){
        if(n%i == 0)
            fsum += i; 
    }

    const char *res = (fsum >= n) ? "True" : "False";

    printf("%s",res);
}
