#include <stdio.h>
int main() {
  int n,prod=1;
  scanf("%d",&n);
  for(int i=1;i<=n;i++)
  {
    prod*=i;
  }
  printf("%d",prod);
	return 0;
}