#include<iostream>
using namespace std;

int main()
{
  int a,b,n=2;
  cin>>a>>b;
  while(n<500)
  {
    if(n%a==0 && n%b==0)
    {
      cout<<n;
      break;
    }
    n++;
  }
  return 0;
}