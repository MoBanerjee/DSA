#include <bits/stdc++.h>
using namespace std;
int main(){
    int x;
    cin>>x;
    vector<int> vec;
    for(int i=0;i<x;i++){
        int temp;
        cin>>temp;
        vec.push_back(temp);
    }
    long long int count=0;
    for(int j=1;j<x-1;j++){
        int one=vec[j-1];
        int two=vec[j];
        int three=vec[j+1];
        
        if(one>two && two>=three){count=count+(one-two);
        vec[j]=one;
        }
        else if(one>two && three>=two){count=count+(one-two);
        vec[j]=one;
        }
    }
    if(x>1){
      
    if(vec[x-2]>vec[x-1])count+=(vec[x-2]-vec[x-1]);}
    cout<<count;
}