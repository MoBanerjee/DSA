#include <bits/stdc++.h>
# define ll long long 
using namespace std;
vector<string> gc(int n){
    if(n==1){
        return vector<string>{"0","1"};
    }
    else{
        vector<string> temp=gc(n-1);
        vector<string> reversetemp=temp;
        reverse(reversetemp.begin(),reversetemp.end());
        int s=temp.size();
        for(int i=0;i<s;i++){
            temp[i]="1"+temp[i];
            reversetemp[i]="0"+reversetemp[i];
            temp.push_back(reversetemp[i]);

        }
        return temp;

    }
}
int main(){
    int x;
    cin>>x;
    for(auto s:gc(x)){
        cout<<s<<endl;
    }
}