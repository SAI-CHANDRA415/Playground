#include<iostream>
#include<math.h>
using namespace std;
int main()
{
  //Type your code here.
  int x,y,a,b;
  std::cin>>x>>y;
  a = (3-x)*(3-x);
  b = (4-y)*(4-y);
  std::cout<<(int)sqrt(a+b);
 }