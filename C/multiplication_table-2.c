#include <stdio.h>
#include <math.h>
int main(){
	int n,r,i;
	scanf("%d%d",&n,&r);
    for (i = 1;i <= r;i++){
    	printf("%d x %d = %d\n",n,i,n*i);
	}
}
