#include <stdio.h>
#include <math.h>
int main(){
	int n,i;
	scanf("%d",&n);
    for (i = 1;i<=ceil(n/2);i++){
    	if (n%i == 0){
    		printf("%d ",i);
		}
	}
    printf("%d ",n);

}
