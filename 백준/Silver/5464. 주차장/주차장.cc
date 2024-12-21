#include<algorithm>
#include<vector>
#include<queue>
#include<iostream>
#include<unordered_map>
#include<set>
using namespace std;

int N,M;
int total_price;
unordered_map<int,int>pos;    //정렬이 안되는 map
queue<int>q;

int main(){
    cin>>N>>M;

    vector<int>fee(N+1),weight(M+1);//주차 요금과 무게 벡터를 생성

    for(int i=1;i<=N;i++)cin>>fee[i];
    for(int i=1;i<=M;i++)cin>>weight[i];

    set<int>s;     //set 함수의 개념을 처음 알았다. default가 오름차순
    for(int i=1;i<=N;i++)s.insert(i);
    
    for(int i=0;i<2*M;i++){
        int car;
        cin>>car;
        if(car>0)q.push(car);//양수일 때 큐에 push
        else{
            s.insert(pos[-car]);//음수일 경우  set에 삽입하여 임시저장.
            pos.erase(-car);
        }
        
        while(!q.empty()&&!s.empty()){
            set<int>::iterator it=s.begin();
            pos[q.front()]=*it;
            total_price+=weight[q.front()]*fee[*it];
            s.erase(*it);
            q.pop();
        } 
    }

    cout<<total_price<<endl;
    return 0;
}