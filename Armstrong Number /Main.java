#include <stdio.h>
int main() {
  int x,sum=0,count=0;
  scanf("%d",&x);
  int y=x;
  while(x!=0){
   count++;
    x/=10;
  }
  x=y;
  while(x!=0){
   sum+=pow(x%10,count);
    x/=10;
  }
  if(y==sum)
    printf("Armstrong Number");
  else
    printf("Not an Armstrong Number");
	return 0;
	return 0;
}