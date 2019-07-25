#include <stdio.h>
int main() {
  int n,t,a,prod,sum=0;
  scanf("%d",&n);
  t=n;
  while(n>0)
  {
    a=n%10;
    prod=1;
    for(int i=1;i<=a;i++)
  	{
    	prod*=i;
 	}
    n/=10;
    sum+=prod;
  }
  	if(sum==t)
   	 	printf("Yes");
 	else
    	printf("No");    
  
	return 0;
}