#include<iostream>
using namespace std;

int main()
{
  int a[4],i,small;
  for(i=0;i<4;i++)
    cin>>a[i];
  small=a[0];
  for(i=1;i<4;i++)
    if(a[i]<small)
      small=a[i];
  cout<<small;
}