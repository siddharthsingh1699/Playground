#include<stdio.h>
int main()
{
  int x,y,z;
  int res=0;
  scanf("%d",&x);
  y=x/100;
  z=x%10;
  res=y+z;
  printf("%d",res);
  //Type your code here
  return 0;
}