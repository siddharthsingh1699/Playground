#include <stdio.h>
int main() {
  	int x,res,y;
  	scanf("%d",&x);
  	y=x;
  	while(y>9)
    {
    	y=y/10;
    }
	res=res+y;
  	x=x%10;
  	res=res+x;
  	printf("%d",res);
	//Type your code
	return 0;
}