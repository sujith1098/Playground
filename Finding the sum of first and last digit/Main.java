#include <stdio.h>
int main() {
	int n;
  scanf("%d",&n);
  int l=n%10;
  while(n>=10)
  {
    n/=10;
  }
  int f=n;
  printf("%d",f+l);
  
	return 0;
}