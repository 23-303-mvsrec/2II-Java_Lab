#include <stdio.h>
#include <stdlib.h>
#include <math.h>

#define MAX 20

int x[MAX];
int solutionCount = 0;

int Place(int k, int i) {
    for (int j = 1; j < k; j++) {
        if (x[j] == i || abs(x[j] - i) == abs(j - k))
            return 0;
    }
    return 1;
}

void printBoard(int n) {
    for (int i = 1; i <= n; i++) {
        for (int j = 1; j <= n; j++) {
            if (x[i] == j)
                printf("Q ");
            else
                printf("* ");
        }
        printf("\n");
    }
    printf("\n");
}

void NQueens(int k, int n) {
    for (int i = 1; i <= n; i++) {
        if (Place(k, i)) {
            x[k] = i;
            if (k == n) {
                solutionCount++;
                printf("Solution %d:\n", solutionCount);
                printBoard(n);
            } else {
                NQueens(k + 1, n);
            }
        }
    }
}

int main() {
    int n;
    printf("Enter the value of N (N x N board): ");
    scanf("%d", &n);

    if (n >= MAX || n < 1) {
        printf("N should be between 1 and %d\n", MAX - 1);
        return 1;
    }

    NQueens(1, n);

    if (solutionCount == 0)
        printf("No solutions exist for N = %d\n", n);
    else
        printf("Total solutions: %d\n", solutionCount);

    return 0;
}

