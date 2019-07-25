// INCLUDE HEADER FILES NEEDED BY YOUR PROGRAM
// SOME LIBRARY FUNCTIONALITY MAY BE RESTRICTED
// DEFINE ANY FUNCTION NEEDED
// FUNCTION SIGNATURE BEGINS, THIS FUNCTION IS REQUIRED
#include <iostream>
using namespace std;

// Main function
int main()
{
  int a,b,n=1,max=1;
  cin>>a>>b;
  while(n<20)
  {
    if(a%n==0 && b%n==0)
    {
      if(n>max)
        max=n;
    }
    n++;
  }
  cout<<max;
    
   return 0;
}