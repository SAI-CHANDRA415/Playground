#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int p,t,r;
  float i;
  std::cin>>p>>r>>t;
  i=(p*t*r)/100;
  std::cout<<i<<"\n";
  std::cout<<i+p<<"\n";
  std::cout<<i*0.02<<"\n";
  std::cout<<(i+p)-i*0.02;
  
}