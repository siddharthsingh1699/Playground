#include<stdio.h>
int main()
{
  	int x,y,z;
  	int res=0;
  	scanf("%d",&x);
  	y=x%10;
  	x=x/10;
  	z=x%10;
  	printf("%d", y+z);
  //Type your code here
  return 0;
}