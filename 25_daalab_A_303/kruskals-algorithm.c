#include<stdio.h>
int a[20][20];
int parent[20];
int ne = 1;
int mincost =0;
int cmin = 999;
void Union(int,int);
int find(int);
int main(){
	int n,i,j,v1,v2,u,v;
	printf("Enter the number of vertices: ");
	scanf("%d",&n);
	for(i = 1;i<=n; i++)
		parent[i] = -1;
	printf("Enter the adjacency matrix:\n ");
	for(i =1;i<=n;i++){
		for(j =1;j<=n;j++){
			scanf("%d",&a[i][j]);
			if(a[i][j] == 0)
				a[i][j] = 999;
		}
	}
	printf("Edges in the minimum cost spanning tree:\n");
	while(ne < n){
		for(i=1;i<=n;i++){
			for(j=1;j<=n;j++){
				if(a[i][j] < cmin){
					v1 = i; v2 = j;
					cmin = a[i][j];
				}
			}
		}
		u = find(v1);
		v = find(v2);
		if(u != v){
			Union(u,v);
			mincost += a[v1][v2];
			printf("(%d, %d) = %d\n",v1,v2,a[v1][v2]);
			ne++;
		}
		cmin = a[v1][v2] = a[v2][v1] = 999;
	}
	printf("Mincost = %d",mincost);
	return 0;
}
int find(int i){
	while(parent[i] != -1)
		i = parent[i];
	return i;
}
void Union(int m, int n){
	parent[m] = n;
}
