#include <bits/stdc++.h>
# define ll long long 
using namespace std;
ll bigcons=1e9+7;
ll fastexp(ll base,ll power){
    ll ans=1;
while(power){
    if(power&1ll){
        ans=(ans*base)%bigcons;
    }
    base=(base*base)%bigcons;
    power=power>>1ll;
}
return ans;
}
int main(){
    ll x;
    cin>>x;
    cout<<fastexp(2ll,x);
}