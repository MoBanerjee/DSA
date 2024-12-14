#include <bits/stdc++.h>
using namespace std;
int main(){
    char first;
    char second;
    string inp;
    cin>>inp;
    first=inp[0];
    second=inp[1];
    int maxcount=0;
    int count=0;
    for(long unsigned int i=1;i<inp.size();i++){
        if(first==second){
            count++;
            maxcount=max(maxcount,count);
        }
        else{
            count=0;
        }
        
        if(i!=inp.size()-1){
        first=second;
        second=inp[i+1];}
    }
    cout<<maxcount+1;
}