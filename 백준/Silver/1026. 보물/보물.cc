#include<stdio.h>
#include<algorithm>
#include<iostream>
#include<stdlib.h>
using namespace std;

int N;
int max_a,min_a,max_b,min_b;
int sum;

int main(){
    cin>>N;
    int a=0,c=N-1;
    int *A,*B,*C;
    A=(int *)malloc(N*sizeof(int));
    B=(int *)malloc(N*sizeof(int));
    C=(int *)malloc(N*sizeof(int));
    for(int i=0;i<N;i++){
        cin>>A[i];
    }
    sort(A,A+N);
    for(int i=0;i<N;i++){
        cin>>B[i];
    }
    sort(B,B+N,greater<>());
    for(int i=0;i<N;i++){
        sum+=A[i]*B[i];
    }
    cout<<sum<<endl;
    return 0;
}