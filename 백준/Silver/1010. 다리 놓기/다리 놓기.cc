#include<stdio.h>
double factorial(int n){
	if(n==0)return 1;
	return n*factorial(n-1);
}
double combination(int n,int m){
	return factorial(n)/(factorial(n-m)*factorial(m));
}
int main(){
    int t,n,m;
    scanf("%d",&t);
    while(t--){
        scanf("%d%d",&n,&m);
        printf("%.0f\n",combination(m,n));
    }
    return 0;
}