#include<stdio.h>
int main()
{
  char str[20];
  int i=0;
  fgets(str,20,stdin);
  while(str[i]!='\0')
    i++;
  printf("%d",i);
  return 0;
}