#include<stdio.h>
//void fcfs(int pid[],int at[],int bt[],int ct[]);
void swap(int *a,int *b);
int main(){
        int pid[5],at[5],bt[5],ct[5];
        int tat[5],wt[5];
        int totaltat =0,totalwt =0;
        float atat =0,awt = 0;
	int n;
	printf("Enter the no of Processes: ");
	scanf("%d",&n);
	printf("Enter Arrival Time,Burst Time for the following Processes:\n");
	for(int i=0;i<n;i++){
		pid[i] = i+1;
		printf("P%d: ",i);
		scanf("%d %d",&at[i],&bt[i]);
	}

	for(int i=0;i<n-1;i++){
    		for(int j=0;j<n-i-1;j++){
        	if(at[j] > at[j+1]){
            	swap(&at[j],&at[j+1]);
            	swap(&bt[j],&bt[j+1]);
            	swap(&pid[j],&pid[j+1]);
        }
    	}

	}
        ct[0] = at[0]+bt[0];
        for(int i=1;i<n;i++){
                ct[i] = ct[i-1] +bt[i];
        }

        for(int i=0;i<n;i++){

                tat[i] = ct[i] - at[i];
                totaltat += tat[i];

                wt[i] = tat[i] - bt[i];
                totalwt += wt[i];
        }

        printf("PID - AT - BT - CT - TAT - WT\n");
        for(int i=0;i<n;i++)
                printf("%d\t %d\t %d\t %d\t %d\t %d\n",pid[i],at[i],bt[i],ct[i],tat[i],wt[i]);

        atat = totaltat /(float)n;
        awt = totalwt /(float)n;

        printf("Average TAT = %f \n",atat);
        printf("Average WT = %f ",awt);


}
void swap(int *a,int *b){
	int temp = *a;
	*a = *b;
	*b = temp;
}
