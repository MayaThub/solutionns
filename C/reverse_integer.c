#include <stdio.h>
int main(){
	int nc,n,r=0;
	scanf("%d",&n);
    nc = (n > 0) ? (n) : (-n);
    while (nc > 0){
    	int l = nc%10;
    	nc /= 10;
    	r = ( 10 * r) + l;
	}
    r = (n > 0) ? (r) : (-r);
    printf("%d",r);
}
