#include<stdio.h>
int main()
{
  int n;
  float p,r;
  scanf("%f %d %f",&p,&n,&r);
  double si=(p*r*n)/100;
  printf("%.6f",si);
  return 0;
}