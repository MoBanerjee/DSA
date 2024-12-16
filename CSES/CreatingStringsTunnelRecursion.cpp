#include <bits/stdc++.h>
# define ll long long 
using namespace std;
set<string> ans;

void solve(string pre,string post){
    if(post.size()==0){
        ans.insert(pre);
        return;
    }
    for(int i=0;i<post.length();i++){
        solve(pre+post[i],post.substr(0,i)+post.substr(i+1));
    }
}
int main(){
    string inp;
    cin>>inp;
    solve("",inp);
    cout<<ans.size()<<endl;
    for(auto s:ans){
        cout<<s<<endl;
    }

}
