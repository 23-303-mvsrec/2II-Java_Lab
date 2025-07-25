#include <stdio.h>

#define MAX 20

int x[MAX];
int G[MAX][MAX];
int n, start;
int solutionCount = 0;

void NextValue(int k) {
    while (1) {
        x[k] = (x[k] + 1) % (n + 1);
        if (x[k] == 0) return;
        if (G[x[k - 1]][x[k]] != 0) {
            int j;
            for (j = 1; j < k; j++) {
                if (x[j] == x[k]) break;
            }
            if (j == k) {
                if (k < n || (k == n && G[x[n]][x[1]] != 0)) return;
            }
        }
    }
}

void Hamiltonian(int k) {
    while (1) {
        NextValue(k);
        if (x[k] == 0) return;
        if (k == n) {
            solutionCount++;
            printf("Cycle %d: ", solutionCount);
            for (int i = 1; i <= n; i++) {
                printf("%d ", x[i]);
            }
            printf("%d\n", x[1]);
        } else {
            Hamiltonian(k + 1);
        }
    }
}

int main() {
    printf("Enter number of vertices: ");
    scanf("%d", &n);

    printf("Enter adjacency matrix (%d x %d):\n", n, n);
    for (int i = 1; i <= n; i++) {
        for (int j = 1; j <= n; j++) {
            scanf("%d", &G[i][j]);
        }
    }

    printf("Enter starting vertex (1 to %d): ", n);
    scanf("%d", &start);

    for (int i = 1; i <= n; i++) x[i] = 0;
    x[1] = start;

    printf("\nHamiltonian cycles starting from vertex %d:\n", start);
    Hamiltonian(2);

    if (solutionCount == 0)
        printf("No Hamiltonian cycle found.\n");
    else
        printf("Total Hamiltonian cycles found: %d\n", solutionCount);

    return 0;
}

