#include <stdio.h>

void swap(int *a,int *b){
    int temp = *a;
    *a = *b;
    *b = temp;
}

int main(){
    int pid[20], at[20], bt[20], ct[20], tat[20], wt[20];
    int totaltat = 0, totalwt = 0;
    float atat = 0, awt = 0;
    int n;

    printf("Enter the number of Processes: ");
    scanf("%d",&n);

    printf("Enter Arrival Time and Burst Time for each process:\n");
    for(int i=0;i<n;i++){
        pid[i] = i+1;
        printf("P%d: ",pid[i]);
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

    ct[0] = at[0] + bt[0];
    for(int i=1;i<n;i++){
        if(at[i] > ct[i-1]) {
            ct[i] = at[i] + bt[i];
        } else {
            ct[i] = ct[i-1] + bt[i];
        }
    }

    for(int i=0;i<n;i++){
        tat[i] = ct[i] - at[i];
        totaltat += tat[i];
        wt[i] = tat[i] - bt[i];
        totalwt += wt[i];
    }

    printf("\nPID\tAT\tBT\tCT\tTAT\tWT\n");
    for(int i=0;i<n;i++)
        printf("%d\t%d\t%d\t%d\t%d\t%d\n", pid[i], at[i], bt[i], ct[i], tat[i], wt[i]);

    atat = (float)totaltat / n;
    awt = (float)totalwt / n;

    printf("\nAverage Turnaround Time = %.2f\n", atat);
    printf("Average Waiting Time = %.2f\n", awt);

    return 0;
}

