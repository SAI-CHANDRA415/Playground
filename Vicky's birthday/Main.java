#include<iostream>
using namespace std;
int main(){
  int x;
  std::cin>>x;
  if((x%4==0) && (x%100!=0)){
    std::cout<<"Vicky can celebrate his birthday.";
  }
  else if((x%100==0) && (x%400==0)){
    std::cout<<"Vicky can celebrate his birthday.";
  }
  else if(x%400==0){
    std::cout<<"Vicky can celebrate his birthday.";
  }
  else{
    std::cout<<"Vicky can't celebrate.";
  }
}
  