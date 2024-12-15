#include <bits/stdc++.h>
# define ll long long 
using namespace std;
string solve(string S)
{
    int sz=S.size();
    string ans(sz,' ');
    int counts[26]={};
    for(int i=0;i<sz;i++){
        counts[S[i]-'A']++;
    }
    int odds=0;
    for(int i=0;i<26;i++){
        if(counts[i]%2==1)odds++;
        if(odds>1){
            return "NO SOLUTION";
            
        }
    }
    int left=0,right=sz-1;
    for(int i=0;i<sz;i++){
        if(counts[S[i]-'A']%2==1){
            ans[sz/2]=S[i];
            counts[S[i]-'A']--;
        }
        while(counts[S[i]-'A']){
            ans[left++]=ans[right--]=S[i];
            counts[S[i]-'A']-=2;
        }
    }

return ans;
}
int main(){
    string s;
    cin>>s;
    string ans=solve(s);
    // unordered_map<char,int> store;
    // for(auto c:s){
       
    //     store[c]++;
    // }
    // int odds=0;
    // char temp;
    // for(auto kv:store){
    //     char k=kv.first;
    //     if(store[k]%2==1){odds++;
    //     store[k]-=1;
    //     temp=k;
    //         if(odds>1){
    //         cout<<"NO SOLUTION";
    //         return 0;
    //     }
    //     }
        
    // }
    // string ans="";
    
    // for(auto kv:store){
    //     char k=kv.first;
    //     for(int p=0;p<store[k]/2;p++){
    //         ans=ans+k;
    //     }
    // }
    // string reverseans=ans;
    // reverse(reverseans.begin(),reverseans.end());
    // ans=ans+temp+reverseans;
    cout<<ans;

}