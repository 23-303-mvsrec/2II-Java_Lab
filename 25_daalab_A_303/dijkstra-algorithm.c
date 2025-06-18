#include <stdio.h>
#define infinity 999

void dijkstra(int n, int cost[10][10], int dist[10], int v) {
    int i, u, count, w, flag[10], min;
    for (i = 1; i <= n; i++) {
        flag[i] = 0;
        dist[i] = cost[v][i];
    }
    flag[v] = 1;
    count = 2;
    while (count <= n) {
        min = infinity;
        for (w = 1; w <= n; w++) {
            if (dist[w] < min && !flag[w]) {
                min = dist[w];
                u = w;
            }
        }
        flag[u] = 1;
        count++;
        for (w = 1; w <= n; w++) {
            if ((dist[u] + cost[u][w] < dist[w]) && !flag[w]) {
                dist[w] = dist[u] + cost[u][w];
            }
        }
    }
}

int main() {
    int n, v, j, i, cost[10][10], dist[10];
    printf("\nEnter no of nodes: ");
    scanf("%d", &n);
    printf("\nEnter the cost matrix:\n");
    for (i = 1; i <= n; i++)
        for (j = 1; j <= n; j++) {
            scanf("%d", &cost[i][j]);
            if (cost[i][j] == 0 && i != j)
                cost[i][j] = infinity;
        }
    printf("\nEnter source vertex: ");
    scanf("%d", &v);
    dijkstra(n, cost, dist, v);
    printf("\nShortest path is:\n");
    for (i = 1; i <= n; i++) {
        if (i != v)
            printf("%d -> %d, cost = %d\n", v, i, dist[i]);
    }
    return 0;
}
