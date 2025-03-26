#include<stdio.h>

int a, b, u, v, n, i, j, ne = 1, k, l, minval = 999, minj;
int visited[10] = {0}, min = 999, mincost = 0, cost[10][10], t[10][2], near[15];

void main() {
    printf("Enter the number of nodes:");
    scanf("%d", &n);
    
    printf("Enter the adjacency matrix:\n");
    for (i = 1; i <= n; i++) {
        for (j = 1; j <= n; j++) {
            scanf("%d", &cost[i][j]);
            if (cost[i][j] == 0) 
                cost[i][j] = 999;
        }
    }
    
    for (i = 1; i <= n; i++) {
        for (j = 1; j <= n; j++) {
            if (cost[i][j] < min) {
                k = i;
                l = j; 
                min = cost[i][j];
            }
        }
    }
    
    mincost = cost[k][l];
    t[1][0] = k;
    t[1][1] = l;
    
    for (i = 1; i <= n; i++) {
        if (cost[i][l] < cost[i][k]) 
            near[i] = l;
        else 
            near[i] = k;
    }
    near[k] = near[l] = 0;
    
    for (i = 2; i <= n - 1; i++) {
        minval = 999;
        for (j = 1; j <= n; j++) {
            if (near[j] != 0 && cost[j][near[j]] < minval) {
                minval = cost[j][near[j]];
                minj = j;
            }
        }
        
        t[i][0] = minj;
        t[i][1] = near[minj];
        mincost += cost[minj][near[minj]];
        near[minj] = 0;
        
        for (k = 1; k <= n; k++) {
            if (near[k] != 0 && cost[k][near[k]] > cost[k][minj]) 
                near[k] = minj;
        }
    }
    
    printf("Minimum cost = %d\n", mincost);
    printf("Edges of Minimum Cost Spanning Tree are:\n");
    for (i = 1; i < n; i++) {
        printf("\n%d - %d", t[i][0], t[i][1]);
    }
    printf("\n");
}

