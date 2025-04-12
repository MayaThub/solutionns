#include <stdio.h>
int main(){
	int nc,r=0;
	scanf("%d",&nc);
    while (nc > 0){
    	int l = nc%10;
    	nc /= 10;
    	r = ( 10 * r) + l;
	}
    printf("%d",r);
}
