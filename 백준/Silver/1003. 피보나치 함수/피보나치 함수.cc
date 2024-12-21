#include <stdio.h>
void fibo(int N);
int main(){
    int N,M;
    scanf("%d",&N);
    for (int i=0;i<N;i++){
        scanf("%d",&M);
        fibo(M);
    }
}
void fibo(int N){
    int last,current,result;
    current=1,last=result=0;
    for(int i=0;i<=N;i++){
        last=current;
        current=result;
        result=last+current;
    }
    printf("%d %d\n",last,current);
}