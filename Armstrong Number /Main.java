#include <stdio.h>
#include<math.h>
int main() {
  int n,temp,nt,a,sum=0,count=0;
  scanf("%d",&n);
  temp=n;
  nt=n;
  while(temp>0)
  {
    temp/=10;
    count++;
  }
  while(n>0)
  {
    a=n%10;
    sum=sum+pow(a,count); 
    n/=10;
  }
  if(sum==nt)
    printf("Armstrong Number");
  else 
    printf("Not an Armstrong Number");
	return 0;
}