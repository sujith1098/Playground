#include<iostream>
using namespace std;

int main()
{
  int n,flag=0;
  cin>>n;
  int arr[n];
  for(int i=0;i<n;i++)
    cin>>arr[i];
  int a;
  cin>>a;
  for(int j=0;j<n;j++)
  {
    if(arr[j]==a)
      flag=j+1;
  }
  if(flag==0)
      cout<<a<<" isn't present in the array.";
  else
    cout<<flag;
  return 0;
}