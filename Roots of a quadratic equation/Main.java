#include<stdio.h>
#include<math.h>
int main()
{
  int a,b,c;
  double r1,r2;
  scanf("%d %d %d",&a,&b,&c);
  int d;
  d=(b*b)-4*a*c;
  if(d>0)
    printf("root1 = %.2f  root2 = %.2f",(-(double)b+(sqrt(d)))/(2*a),(-(double)b-(sqrt(d)))/(2*a));
  else if(d==0)
    printf("root1 = %.2f  root2 = %.2f",-(double)b/(2*a),-(double)b/(2*a));
  else
    printf("root1 = %.2f + %.2fi  root2 = %.2f - %.2fi",-(double)b/(2*a),sqrt(-d)/(2*a),-(double)b/(2*a),sqrt(-d)/(2*a));
  return 0;		                                         
}