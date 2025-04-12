#include <stdio.h>

int main(){
    int n;
    scanf("%d",&n);
	
	if (n > 15) {
        printf("Upper ");
        n = n - 15;
    }
    else{
        printf("Lower ");
    }
    
    if (n <= 10) {
        printf("Double ");
    }
    else{
        printf("Single ");
    }

    
}
