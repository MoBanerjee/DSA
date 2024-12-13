

#include <iostream>

void answer(long int n){
    std::cout<<n<<" ";
    
while(n!=1){
    
    if(n%2==0){
        n=n/2;
    }
    else{
        n=n*3+1;
    }
    
    std::cout<<n<<" ";
}

}
int main()
{long int x;
    std::cin >> x;
    answer(x);

    return 0;
}