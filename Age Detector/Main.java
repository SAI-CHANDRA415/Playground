#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int by,cy,age;
  std::cin>>by>>cy;
  age=(100-by)+cy;
  if(age>100){
    age=(age%100);
  std::cout<<age;
  }
  else{
    std::cout<<age;
  }
}