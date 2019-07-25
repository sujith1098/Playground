#include<iostream>
using namespace std;

int main()
{
  int n,bi[32],i=0;
  cin>>n;
  while(n>0)
  {
    bi[i]=n%2;
    n/=2;
    i++;
  }
  for(int j=i-1;j>=0;j--)
    cout<<bi[j];
  return 0;
}