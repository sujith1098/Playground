#include <stdio.h>
int main() {
  int n,count=1;
  scanf("%d",&n);
  for(int i=0;i<n;i++)
  {
    printf("%d\n",count);
    count+=2;
  }
	return 0;
}