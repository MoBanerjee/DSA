#include <bits/stdc++.h>
# define ll long long 
using namespace std;

int main(){
ll x;
cin>>x;
ll sum=(x*(x+1))/2;
if(sum%2==1){
    cout<<"NO";
    return 0;
}
ll target=sum/2;
ll temp=x;
vector<ll> arr1;
while(target>=temp){
target=target-temp;
arr1.push_back(temp);
temp-=1;

}
if(target){
    arr1.push_back(target);
}
vector<ll> arr2;
while(temp){
    if(temp!=target)arr2.push_back(temp);
    temp--;
}
cout<<"YES"<<endl;

cout<<arr1.size()<<endl;
for(auto ele:arr1){
    cout<<ele<<" ";
}
cout<<"\n"<<arr2.size()<<endl;
for(auto ele:arr2){
    cout<<ele<<" ";
}

}