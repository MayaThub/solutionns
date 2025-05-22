#include <stdio.h>

int main(){
	int c = 0, n,k;
	scanf("%d%d",&n,&k);
	
    int arr[n];
    for(int i = 0; i < n; i++){
        scanf("%d",&arr[i]);
        if(5 - arr[i] >= k)
            c++;
    }

    printf("%d",c/3);
}
