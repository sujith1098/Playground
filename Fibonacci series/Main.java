#include<iostream>
using namespace std;

int main()
{
  int n,f3,f1=0,f2=1;
  cin>>n;
  cout<<f1<<" "<<f2<<" ";
    while(n>2)
  {
	f3=f1+f2;
    cout<<f3<<" ";
    f1=f2;
    f2=f3;
    n-=1;
  }
  return 0;
}