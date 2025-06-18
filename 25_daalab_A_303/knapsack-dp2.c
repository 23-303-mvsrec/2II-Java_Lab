#include <stdio.h>

int w[10], p[10], n, i, j, cap, x[10] = {0};

int max(int a, int b) {
    return (a > b) ? a : b;
}

void main() {
    int profit, value;

    printf("Enter the number of objects: ");
    scanf("%d", &n);

    printf("Enter profits and weights\n");
    for (i = 1; i <= n; i++) {
        printf("Item no: %d: ", i);
        scanf("%d%d", &p[i], &w[i]);  // Removed space in format string
    }

    printf("Enter the capacity: ");
    scanf("%d", &cap);

    int knap[n + 1][cap + 1];

    for (i = 0; i <= n; i++) {
        for (j = 0; j <= cap; j++) {
            if (i == 0 || j == 0)
                knap[i][j] = 0;
            else {
                if (j < w[i])
                    knap[i][j] = knap[i - 1][j];
                else
                    knap[i][j] = max(knap[i - 1][j], knap[i - 1][j - w[i]] + p[i]);
            }
        }
    }

    profit = knap[n][cap];

    // Traceback
    i = n;
    j = cap;
    while (i != 0 && j != 0) {
        if (knap[i][j] != knap[i - 1][j]) {
            x[i] = 1;
            j -= w[i];
        }
        i--;
    }
    printf("\nKnapsack DP Table:\n");
    for (i = 0; i <= n; i++) {
	    for (j = 0; j <= cap; j++) {
        printf("%4d", knap[i][j]);
    }
    printf("\n");
}


    printf("Solution vector: ");
    for (i = 1; i <= n; i++)
        printf("%d ", x[i]);

    printf("\nItems included are:\n");
    printf("ItemNo  Weight  Profit\n");
    for (i = 1; i <= n; i++) {
        if (x[i])
            printf("%-7d %-7d %-7d\n", i, w[i], p[i]);
    }

    printf("Total profit: %d\n", profit);
}

