#include<stdio.h>
int main()
{
  int n;
  scanf("%d",&n);
  int f=n/100;
  int l=n%10;
  printf("%d",f+l);
  return 0;
}