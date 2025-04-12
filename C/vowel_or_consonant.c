#include<stdio.h>
int  main() {
	char ch ;
    scanf("%c",&ch);
	if(ch > 91)
		ch -= 32;
	if (ch == 'A' ||ch == 'E' ||ch == 'I' ||ch == 'O' ||ch == 'U' ) 
		printf("VOWEL");
	else
		printf("CONSONANT");
	
    return 0;
}    


// -->  https://maya.technicalhub.io/owl-program-details/66863299f56afec5c0c8e972
