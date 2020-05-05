#include<iostream>
int main()
{
  int x,y;
  std::cin>>x;
  x = x%2;
  (x==0) ? (std::cout<<"Possible") : (std::cout<<"Not possible");
}
