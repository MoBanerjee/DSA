#include <bits/stdc++.h>
# define ll long long 
using namespace std;
int main(){
    ll x;
    cin>>x;
    ll ans=0;
    while(x){
        ans+=x/5ll;
        
        x=x/5ll;
    }
    cout<<ans;
}