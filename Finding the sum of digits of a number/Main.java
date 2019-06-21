#include <stdio.h>
int main() {
	int x,res,y;
  	scanf("%d",&x);
  	res=0;
  	while(x!=0)
    {
     	res=res+x%10;
      	x=x/10;
    }
  	printf("%d",res);
	return 0;
}