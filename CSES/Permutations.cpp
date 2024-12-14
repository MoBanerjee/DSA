#include <bits/stdc++.h>
using namespace std;
int main(){
    int inp;
    cin>>inp;
    if(inp==2 || inp==3)cout<<"NO SOLUTION";
    else{if(inp%2==1){
        for(int i=inp;i>=1;i-=2){
            cout<<i<<" ";
        }
        for(int i=inp-1;i>=1;i-=2){
            cout<<i<<" ";
        }}
        else{
                    for(int i=inp-1;i>=1;i-=2){
            cout<<i<<" ";
        }
        for(int i=inp;i>=1;i-=2){
            cout<<i<<" ";
        }
        }
    }
}