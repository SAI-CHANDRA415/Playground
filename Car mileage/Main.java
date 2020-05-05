#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  float m;
  int p,d;
  std::cin>>m>>p>>d;
  if((p*m)>d||(p*m==d)){
    std::cout<<"Can reach";
}
  else{
    std::cout<<"Cannot reach";
  }
}

 