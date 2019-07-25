#include<stdio.h>
#include<math.h>

int main()
{
  long int n;
  int a,de=0,i=0;
  scanf("%d",&n);
  while(n>0)
  {
    a=n%10;
    de+=a*pow(2,i);
    n/=10;
    i++;
  }
  printf("%d",de);
  return 0;
}