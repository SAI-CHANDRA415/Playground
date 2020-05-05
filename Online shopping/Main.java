#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int f_amt,f_dis,f_shp,s_amt,s_dis,s_shp,a_amt,a_dis,a_shp,f_tot,s_tot,a_tot;
  std::cin>>f_amt>>f_dis>>f_shp>>s_amt>>s_dis>>s_shp>>a_amt>>a_dis>>a_shp;
  f_dis=(f_amt/100)*f_dis;
  s_dis=(s_amt/100)*s_dis;
  a_dis=(a_amt/100)*a_dis;
  f_tot=(f_amt-f_dis)+f_shp;
  s_tot=(s_amt-s_dis)+s_shp;
  a_tot=(a_amt-a_dis)+a_shp;
  std::cout<<"In Flipkart Rs."<<f_tot;
  std::cout<<"\nIn Snapdeal Rs."<<s_tot;
  std::cout<<"\nIn Amazon Rs."<<a_tot;
  if((f_tot<s_tot)&&(f_tot<a_tot)||(f_tot==s_tot)&&(f_tot<a_tot)){
    std::cout<<"\nHe will prefer Flipkart";
  }
  else if((s_tot<f_tot)&&(s_tot<a_tot)||(s_tot==a_tot)&&(s_tot<f_tot)){
    std::cout<<"\nHe will prefer Snapdeal";
  
  }
  else if((a_tot<f_tot)&&(a_tot<s_tot)){
    std::cout<<"\nHe will prefer Amazon";
  }
}
