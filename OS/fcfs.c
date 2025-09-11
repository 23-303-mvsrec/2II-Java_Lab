#include<stdio.h>
//void fcfs(int pid[],int at[],int bt[],int ct[]);
int main(){
	int pid[5] ={0,1,2,3,4};
	int at[5] = {0,1,2,3,4};
	int bt[5] = {6,7,8,3,4};
	int ct[5] = {0};

	int tat[5],wt[5];
	int totaltat =0,totalwt =0;
	float atat =0,awt = 0;
	ct[0] = at[0]+bt[0];
	for(int i=1;i<5;i++){
		ct[i] = ct[i-1] +bt[i];
		tat[i] = ct[i] - at[i];
		wt[i] = tat[i] - bt[i];
	}
	for(int i=0;i<5;i++){
		tat[i] = ct[i] - at[i];
		totaltat += tat[i];
                wt[i] = tat[i] - bt[i];
		totalwt += wt[i];
	}

	printf("PID - AT - BT - CT - TAT - WT\n");
	for(int i=0;i<5;i++)
		printf("%d\t %d\t %d\t %d\t %d\t %d\n",pid[i],at[i],bt[i],ct[i],tat[i],wt[i]);

	atat = totaltat /5.0;
	awt = totalwt /5.0;

	printf("Average TAT = %f \n",atat);
	printf("Average WT = %f ",awt);
	

}
