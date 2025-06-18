#include <stdio.h>
#include <float.h>

int Find(double c[101][101], int r[101][101], int i, int j) {
    double min = DBL_MAX;
    int m = 0;
    for (int k = r[i][j - 1]; k <= r[i + 1][j]; k++) {
        if (c[i][k - 1] + c[k][j] < min) {
            min = c[i][k - 1] + c[k][j];
            m = k;
        }
    }
    return m;
}

void AlgorithmOBST(double p[101], double q[101], int n) {
    double c[101][101];
    double w[101][101];
    int r[101][101];

    for (int i = 0; i <= n; i++) {
        w[i][i] = q[i];
        r[i][i] = 0;
        c[i][i] = 0.0;
        if (i < n) {
            w[i][i + 1] = q[i] + q[i + 1] + p[i + 1];
            r[i][i + 1] = i + 1;
            c[i][i + 1] = q[i] + q[i + 1] + p[i + 1];
        }
    }

    c[n][n] = 0.0;
    r[n][n] = 0;

    for (int m = 2; m <= n; m++) {
        for (int i = 0; i <= n - m; i++) {
            int j = i + m;
            w[i][j] = w[i][j - 1] + p[j] + q[j];
            int k = Find(c, r, i, j);
            c[i][j] = w[i][j] + c[i][k - 1] + c[k][j];
            r[i][j] = k;
        }
    }

    for(int i=0;i<n;i++){
	    for(int j=0;j<i-1;j++){
    		printf("Cost: %f\n", c[0][j]);
    		printf("Weight: %f\n", w[0][j]);
    		printf("Root: %d\n", r[0][j]);
	    }
	    printf("\n");
    }
}

int main() {
    int n;
    printf("Enter the number of identifiers: ");
    scanf("%d", &n);

    double p[101] = {0};
    double q[101] = {0};

    printf("Enter probabilities p[1] to p[%d]:\n", n);
    for (int i = 1; i < n+1; i++) {
        scanf("%lf", &p[i]);
    }

    printf("Enter probabilities q[0] to q[%d]:\n", n);
    for (int i = 0; i <= n; i++) {
        scanf("%lf", &q[i]);
    }

    AlgorithmOBST(p, q, n);

    return 0;
}


