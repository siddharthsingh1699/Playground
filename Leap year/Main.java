#include<stdio.h>
int main()
{
  	int x;
  	scanf("%d",&x);
  if(x%4==0 || x%400==0)
  {
  	printf("Leap year");
  }
  else
  {
  	printf("Not Leap year");	
  }
  //Type your code here
  return 0;
}