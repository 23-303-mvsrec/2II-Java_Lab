#include<stdio.h>
#include<stdlib.h>
#include<time.h>
void main(){
	int *a,n,key,flag=0;
	clock_t st,et;
	double ts;
	printf("Enter the no of elements:- ");
	scanf("%d",&n);
	a =(int*) malloc(n*sizeof(int));
	printf("Enter elements:- ");
	for(int i=0;i<n;i++){
		a[i] =i;
	}
	key = a[(n/2)-1];
	st =clock();
	for(int i=0;i<n;i++){
		if(a[i]== key){
			printf("Element %d found at %d position",key,i);
			flag =1;
			break;
		}
	}
	et = clock();
	ts = (double)(et-st)/(CLOCKS_PER_SEC);
	if(flag == 0)
		printf("Element %d is not present in the list!!!",key);

	printf("\n Time Spent:-%f\n",ts);
}
