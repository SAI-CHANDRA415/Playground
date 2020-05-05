#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int u,x;
  std::cin>>u;
  if(u<=200){
    x=u*0.5;
    std::cout<<"Rs."<<x;
  }
  else if(u<=400){
    x=u*0.65+100;
    std::cout<<"Rs."<<x;
  }
  else if(u<=600){
    x=u*0.80+200;
    std::cout<<"Rs."<<x;
  }
  else if(u>600){
    x=u*1.25+425;
    std::cout<<"Rs."<<x;
  }
}

