#include<stdio.h>
#include<stdlib.h>
#include<time.h>

int binary_search(int *a, int n, int key) {
    int low = 0, high = n - 1, mid;
    while (low <= high) {
        mid = low + (high - low) / 2;
        if (a[mid] == key) {
            return mid;
        }
        if (a[mid] < key) {
            low = mid + 1;
        } else {
            high = mid - 1;
        }
    }
    return -1;
}

void main() {
    int *a, n, key, result;
    clock_t st, et;
    double ts;

    printf("Enter the number of elements: ");
    scanf("%d", &n);

    a = (int*) malloc(n * sizeof(int));
    printf("Enter elements: ");
    for (int i = 0; i < n; i++) {
        a[i] = i;
    }

    key = a[(n/2)-1];
    
    st = clock();
    result = binary_search(a, n, key);

    et = clock();
    ts = (double)(et - st) / CLOCKS_PER_SEC;

    if (result != -1) {
        printf("Element %d found at position %d\n", key, result);
    } else {
        printf("Element %d is not present in the list!!!\n", key);
    }

    printf("Time Spent: %f seconds\n", ts);
}

