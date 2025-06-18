#include <stdio.h>

int min(int a, int b) {
    if (a < b)
        return a;
    else
        return b;
}

void floyd(int P[10][10], int n) {
    int i, j, k;
    for (k = 1; k <= n; k++) {
        for (i = 1; i <= n; i++) {
            for (j = 1; j <= n; j++) {
                P[i][j] = min(P[i][j], P[i][k] + P[k][j]);
            }
        }
    }
}

int main() {
    int cost[10][10], n, i, j;

    printf("Enter the no of vertices: ");
    scanf("%d", &n);

    printf("Enter cost adjacency matrix:\n");
    for (i = 1; i <= n; i++) {
        for (j = 1; j <= n; j++) {
            scanf("%d", &cost[i][j]);
            if (i != j && cost[i][j] == 0)
                cost[i][j] = 999;
        }
    }

    printf("The input data is:\n");
    for (i = 1; i <= n; i++) {
        for (j = 1; j <= n; j++) {
            printf("%d\t", cost[i][j]);
        }
        printf("\n");
    }

    floyd(cost, n);

    printf("The shortest path matrix is:\n");
    for (i = 1; i <= n; i++) {
        for (j = 1; j <= n; j++) {
            printf("%d\t", cost[i][j]);
        }
        printf("\n");
    }

    return 0;
}
