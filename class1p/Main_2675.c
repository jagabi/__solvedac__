#include<stdio.h>
#include <string.h>

int main(void) {

    int R,T ;
    char S[20];

    scanf("%d",&R);

    for ( int i = 0 ; i < R ; i++ ) {
        scanf("%d %s",&T,&S);
        for (int j = 0 ; j < strlen(S) ; j++ ) {
            for (int k = 0 ; k < T ; k++ ) printf("%c",S[j]);
        }
        printf("\n");
    }
}