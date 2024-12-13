#include <iostream>
#include <bits/stdc++.h>
using namespace std;
int main(){
    int x;
    cin>>x;
    int temp;
    vector<int> numlist;
    for(int i=0;i<x-1;i++){
        cin>>temp;
numlist.push_back(temp);
    }
     sort(numlist.begin(), numlist.end());
     for(int a=1;a<=x;a++){
        if (!binary_search(numlist.begin(), numlist.end(), a)){
        cout<<a;
        break;}
     }
     return 0;
}