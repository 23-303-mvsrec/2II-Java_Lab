//C Program on Quick Sort and it's time complexity                                                2451-23-733-303
#include<stdio.h>
#include<time.h>
#include<stdlib.h>
void quicksort(int a[],int low,int high){
	if(low<high){
		int i,j,pivot,k,temp;
		pivot = a[low];
		i =low;
		j = high;
		while(i<j){
			while(a[i] <= pivot)
				i++;
			while(a[j] > pivot)
				j--;
			if(i<j){
				temp = a[i];
				a[i] = a[j];
				a[j] = temp;
			}
		}
		a[low] = a[j];
		a[j] =pivot;
		quicksort(a,low,j-1);
		quicksort(a,j+1,high);
	}
}
int main() {
    int *a,n;
    clock_t st, et;
    double ts;

    printf("Enter number of elements:");
    scanf("%d", &n);

    a = (int *) calloc(n,sizeof(int));

    //printf("Enter elements: ");
    for (int i = n; i > 0; i--)
     //   a[i] = rand()%n+1; //avg case
          a[i] = i+1;  // worst case

    st = clock();
    quicksort(a,0, n - 1);

    et = clock();
    ts = (double)(et - st) / CLOCKS_PER_SEC;
    printf("Sorted array: \n");
    for (int i = 0; i < n; i++)
        printf("%d ", a[i]);
    printf("\n");

    printf("Time Spent: %f seconds\n", ts);
    return 0;
}

