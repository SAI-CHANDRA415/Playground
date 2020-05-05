#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int no_of_items;
  float x,heating_time;
  std::cin>>no_of_items>>heating_time;
  switch(no_of_items){
    case 1:
    std::cout<<heating_time;
      break;
    case 2:
    x=heating_time/100*50;
    heating_time=heating_time+x;
    std::cout<<heating_time;
  break;
    case 3:
    x=heating_time*2;
    std::cout<<x;
  break;
    default:
      std::cout<<"Number of items is more";
      break;
}
}