#include<iostream>
using namespace std;

int main()
{
   int n,i=0,oc[32];
   cin>>n;
   while(n>0)
   {
     oc[i]=n%8;
     n/=8;
     i++;
   }
   for(int j=i-1;j>=0;j--)
     cout<<oc[j];
  return 0;
}