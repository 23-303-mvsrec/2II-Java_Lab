// C Program to demonstrate Merge Sort Algorithm(with time spent)                         2451-23-733-303 M.Akshay
#include <stdio.h>
#include <stdlib.h>
#include<time.h>

void merge(int a[],int low, int mid, int high) {
    int h = low, i = low, j = mid + 1;
    int b[high];

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

void mergesort(int a[],int l, int h) {
    if (l < h) {
        int mid = (l + h) / 2;
        mergesort(a,l, mid);
        mergesort(a,mid + 1, h);
        merge(a,l, mid, h);
    }
}

int main() {
    int *a,n;
    clock_t st, et;
    double ts;

    printf("Enter number of elements:");
    scanf("%d", &n);

    a = (int *) calloc(n,sizeof(int));

    printf("Enter elements: ");
    for (int i = n; i >0; i--)
      //  a[i] = rand()%n+1; //avg case
          a[i] = i+1;  // worst case and for best case change forloop from 0 to n-1 i++

    st = clock();
    mergesort(a,0, n - 1);

    et = clock();
    ts = (double)(et - st) / CLOCKS_PER_SEC;
    printf("Sorted array: \n");
    for (int i = 0; i < n; i++)
        printf("%d ", a[i]);
    printf("\n");

    printf("Time Spent: %f seconds\n", ts);
    return 0;
}

