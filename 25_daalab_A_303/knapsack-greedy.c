//C Program on Knapsack Problem using Greedy method Approach
#include<stdio.h>
#include<math.h>

void knapsack(float profit[],float weight[],float capacity,int n){
        float x[20],tp =0;
	int i,j;
	float u = capacity;
	for(i =0; i<n ;i++)
		x[i] = 0.0;

	for( i =0;i<n;i++){
		if(weight[i] > u)
			break;
		else{
			x[i] = 1.0;
			tp += profit[i];
			u -= weight[i];
		}
	}
	if( i <n){
		x[i] = ( u/weight[i]);
		tp += (x[i] * profit[i]);
	}

        printf("\nSolution Vector : {");
        for(i=0;i<n;i++)
                printf("%f, ",x[i]);
        printf("}\n");
	printf("Maximum profit : %f\n",tp);
}
void swap(float *a,float *b){
	float *temp;
	*temp = *a;
	*a = *b;
	*b =*temp;
}
int main(){
        float weight[20],profit[20],capacity;
        float ratio[20],temp;
        int n,i,j;
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
	for( i = 0; i < n;i++)
		ratio[i] = profit[i] / weight[i];

	for( i = 0; i<n;i++){
		for( j=0;j<n-i-1;j++){
			if(ratio[j] < ratio[j+1]){
			        swap(&ratio[j],&ratio[j+1]);
			//	temp = ratio[j];
			//	ratio[j] = ratio[j+1];
			//	ratio[j+1] = temp;
				swap(&weight[j],&weight[j+1]);
			//	temp = weight[j];
                        //      weight[j] = weight[j+1];
			//      weight[j+1] = temp;
				swap(&profit[j],&profit[j+1]);
			//	temp = profit[j];
                        //        profit[j] = profit[j+1];
                         //     profit[j+1] = temp;

			}
		}
	}
        knapsack(profit,weight,capacity,n);
        return 0;
}

