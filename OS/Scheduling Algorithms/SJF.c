#include <stdio.h>
#include <limits.h>
int main() {
    int pid[20], at[20], bt[20], orgbt[20];
    int ct[20], tat[20], wt[20];
    float avgtat = 0, avgwt = 0;
    int n, time = 0, completed = 0;

    printf("2451-23-733-303  M.Akshay\n");

    printf("Enter the number of processes: ");
    scanf("%d", &n);

    printf("Enter Arrival Time and Burst Time for each process:\n");
    for (int i = 0; i < n; i++) {
        pid[i] = i + 1;
        printf("P%d: ", pid[i]);
        scanf("%d %d", &at[i], &bt[i]);
        orgbt[i] = bt[i];
    }

    while (completed < n) {
        int idx = -1, minBT = INT_MAX;

        for (int i = 0; i < n; i++) {
            if (at[i] <= time && bt[i] > 0 && bt[i] < minBT) {
                minBT = bt[i];
                idx = i;
            }
        }

        if (idx == -1) {
            time++;
        } else {
            time += bt[idx];
            ct[idx]  = time;
            tat[idx] = ct[idx] - at[idx];
            wt[idx]  = tat[idx] - orgbt[idx];

            avgtat += tat[idx];
            avgwt  += wt[idx];

            bt[idx] = 0;
            completed++;
        }
    }

    avgtat /= n;
    avgwt  /= n;

    printf("\nPID\tAT\tBT\tCT\tTAT\tWT\n");
    for (int i = 0; i < n; i++) {
        printf("%d\t%d\t%d\t%d\t%d\t%d\n",
               pid[i], at[i], orgbt[i], ct[i], tat[i], wt[i]);
    }

    printf("\nAverage Turnaround Time = %.2f\n", avgtat);
    printf("Average Waiting Time    = %.2f\n", avgwt);

    return 0;
}

