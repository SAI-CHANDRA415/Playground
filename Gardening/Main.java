#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int r,c,t;
  std::cin>>r>>c>>t;
  if((r<t)&&(t<=r*2)){
    std::cout<<"It is a mango tree";
  }
  else if((t<=(r*c-r)) && (t>=((r*c-r)-r))){
    std::cout<<"It is a mango tree";
  }
  else{
    std::cout<<"It is not a mango tree";
  }
}
