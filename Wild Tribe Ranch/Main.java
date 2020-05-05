#include<iostream>
using namespace std;
int main(){
  int max ,wof;
  std::cin>>max>>wof;
  if(max>wof){
    std::cout<<"Yes, you can enter.";
  }
  else if(max==wof){
    std::cout<<"Yes, you can enter. Kindly use a rope.";
  }
  else {
    std::cout<<"Sorry, you can't enter";
  }
}
