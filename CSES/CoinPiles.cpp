#include <bits/stdc++.h>
# define ll long long 
using namespace std;
void soln(int one,int two){
int tempone=2*one-two;
int temptwo=2*two-one;
if(tempone<0 || tempone%3 ||temptwo<0 || temptwo%3){
    cout<<"NO"<<endl;
}
else cout<<"YES"<<endl;
    }
int main(){
    int tries;
    cin>>tries;
    list<list<int>> trials;
    for(int i=0;i<tries;i++){
        int temp1;
        int temp2;
        cin>>temp1;
        cin>>temp2;
        list<int>temp{temp1,temp2};
        trials.push_back(temp);
    }
    for(int j=0;j<tries;j++){
        list<int>sample=trials.front();
        trials.pop_front();
        int sample1=sample.front();
        int sample2=sample.back();
        soln(sample1,sample2);
    }

}