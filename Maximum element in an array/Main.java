#include<stdio.h>
int main()
{
  	int n;
    scanf("%d",&n);
    int arr[n];
    for(int i=0;i<n;i++)
      scanf("%d",&arr[i]);
    int a=arr[0];
    scanf("%d",&a);
    for(int j=1;j<n;j++)
    {
     if(arr[j]>a)
       a=arr[j];
    }
    printf("%d",a);
    return 0;
}