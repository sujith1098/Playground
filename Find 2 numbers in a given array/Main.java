#include<stdio.h>
int main()
{
  	int n,p1=-1,p2=-1;
    scanf("%d",&n);
    int arr[n];
    for(int i=0;i<n;i++)
      scanf("%d",&arr[i]);
    int a,b;
    scanf("%d%d",&a,&b);
    for(int j=0;j<n;j++)
    {
     if(arr[j]==a)
       p1=j;
      if(arr[j]==b)
        p2=j;
    }
    printf("Element 1 index = %d\nElement 2 index = %d",p1,p2);
    return 0;
}