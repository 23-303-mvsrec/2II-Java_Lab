// C Program to demonstrate Merge Sort Algorithm(with time spent)                         2451-23-733-303 M.Akshay
#include <stdio.h>
#include <stdlib.h>
#include<time.h>

void merge(int a[],int low, int mid, int high, int b[]) { // Add b to signature
    int h = low, i = low, j = mid + 1;
    // int b[high]; // Remove local b

    while (h <= mid && j <= high) {
        if (a[h] <= a[j]) {
            b[i] = a[h];
            h++;
        } else {
            b[i] = a[j];
            j++;
        }
        i++;
    }

    while (h <= mid) {
        b[i] = a[h];
        h++;
        i++;
    }

    while (j <= high) {
        b[i] = a[j];
        j++;
        i++;
    }

    for (int x = low; x <= high; x++)
        a[x] = b[x];
}

void mergesort(int a[],int l, int h, int b[]) { // Add b to signature
    if (l < h) {
        int mid = (l + h) / 2;
        mergesort(a,l, mid, b); // Pass b
        mergesort(a,mid + 1, h, b); // Pass b
        merge(a,l, mid, h, b); // Pass b
    }
}

int main() {
    int *a,n;
    clock_t st, et;
    double ts;

    printf("Enter number of elements:");
    scanf("%d", &n);

    a = (int *) calloc(n,sizeof(int));
    int *b = (int *)calloc(n, sizeof(int)); // Allocate b

    if (a == NULL || b == NULL) { // Check both a and b
        fprintf(stderr, "Memory allocation failed\n");
        free(a);
        free(b);
        return 1;
    }

    // printf("Enter elements: "); // Comment out direct input for now
    // For testing with a worst-case scenario (descending order)
    for (int i = 0; i < n; i++) {
        a[i] = n - i;
    }
    // To use random numbers (average case):
    /*
    printf("Generating random elements...\n");
    for (int i = 0; i < n; i++) {
        a[i] = rand() % n + 1;
    }
    */
    // To use manual input:
    /*
    printf("Enter %d elements: ", n);
    for (int i = 0; i < n; i++) {
        if (scanf("%d", &a[i]) != 1) {
            fprintf(stderr, "Error reading input\n");
            free(a);
            free(b); // also free b
            return 1;
        }
    }
    */

    st = clock();
    mergesort(a,0, n - 1, b); // Pass b

    et = clock();
    ts = (double)(et - st) / CLOCKS_PER_SEC;
    printf("Sorted array: \n");
    for (int i = 0; i < n; i++)
        printf("%d ", a[i]);
    printf("\n");

    printf("Time Spent: %f seconds\n", ts);
    free(a); // Free a
    free(b); // Free b
    return 0;
}

