#include<stdio.h>

int main(void) {
    int N,sum;
    scanf("%d",&N);
    
    char S[N];
    scanf("%s",&S);

    for (int i = 0 ; i < N ; i++) {
        sum += (S[i]-'0');
        
    }
    
    printf("%d",sum);

    return 0;

}