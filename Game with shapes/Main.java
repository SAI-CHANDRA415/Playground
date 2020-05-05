#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int r,s,d;
  std::cin>>r>>s;
  d=2*r;
  if(d<s||d==s){
    std::cout<<"circle can be inside a square";
  }
  else{
    std::cout<<"circle cannot be inside a square";
  }
}