//C Program on Knapsack Problem using Brute force Approach
#include<stdio.h>
#include<math.h>

float knapsack(float profit[],float weight[],float capacity,int n){
	int A[20] = {0},bstChoice[20] = {0},i,k;
	float bstWt = 0 ,bstVal = 0,tempWt,tempVal;
	for(int i=1;i<= pow(2,n);i++){
		int j =n-1;
		tempWt =0;
		tempVal =0;
		while( A[j] != 0 && j > 0)
		{
			A[j] = 0;
			j--;
		}
		A[j] = 1;
		for(k =0;k<n;k++)
		{
			if(A[k] == 1)
			{
				tempWt += weight[k];
				tempVal += profit[k];
			}
		}
		if((tempVal > bstVal) && (tempWt <= capacity))
		{
			bstVal = tempVal;
			bstWt = tempWt;
			for(k =0;k<n;k++)
				bstChoice[k] = A[k];
		}
	}
	printf("Solution Vector : {");
	for(i=0;i<n;i++)
		printf("%d, ",bstChoice[i]);
	printf("}");
	return bstVal;
}

int main(){
	float weight[20],profit[20],capacity,bestprofit;
	int A[20];
	int n,i,j,k;
	printf("Enter the no. of Objects: ");
	scanf("%d",&n);
	printf("Enter the weights of %d objects: ",n);
	for(i =0;i<n;i++)
		scanf("%f",&weight[i]);
	printf("Enter the profits of %d objects: ",n);
        for(i =0;i<n;i++)
                scanf("%f",&profit[i]);
	printf("Enter the capacity of Knapsack: ");
	scanf("%f",&capacity);
	bestprofit = knapsack(profit,weight,capacity,n);
	printf("\nProfit: %f\n",bestprofit);
	return 0;
}

