#include <stdio.h>
#define MAX 20

int G[10][10], n, visited[MAX];
int i, j;

void DFS(int s);

int main() {
    int s;
    printf("Enter number of vertices: ");
    scanf("%d", &n);

    printf("Enter the adjacency matrix:\n");
    for(i = 1; i <= n; i++) {
        for(j = 1; j <= n; j++) {
            scanf("%d", &G[i][j]);
        }
    }

    printf("Enter the source vertex: ");
    scanf("%d", &s);

    visited[s] = 1;
    printf("Order of visiting vertices using DFS: %d ", s);
    DFS(s);

    return 0;
}

void DFS(int s) {
    int v;
    for(v = 1; v <= n; v++) {
        if(G[s][v] == 1 && !visited[v]) {
            visited[v] = 1;
            printf("%d ", v);
            DFS(v);
        }
    }
}

