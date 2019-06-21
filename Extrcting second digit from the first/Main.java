#include <stdio.h>
int main() {
  	int x,res;
  	scanf("%d",&x);
  	while(x>99)
    {
    	x=x/10;
    }
  	printf("%d",x%10);
	//Type your code
	return 0;
}