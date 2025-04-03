#include<stdio.h>
void BFS();
int G[10][10],n,q[20],f=0,r=0;
int visited[20];
int i,j,k,s;

void main(){
	int n,s;
	printf("Enter no of vertices:-");
	scanf("%d",&n);
	printf("Enter the adjacency matrix:-\n");
	for(i = 1;i <= n; i++){
		for(j = 1; j <= n; j++)
			scanf("%d",&G[i][j]);
	}
	printf("Enter the source vertex:- ");
	scanf("%d",&s);
	visited[s] = 1;
	printf("Order of visiting vertices using BFS = %d",s);
	BFS();
}
void BFS(){
	k =1;
	while(k<n){
		for(i=1;i<=n;i++){
			if(G[s][i] == 1 && visited[i] ==0){
				q[r++] = 1;
				visited[i] = 1;
			}
		}
		if(f>r)
			break;
		s = q[f++];
		printf("%d\t",s);
		k++;
}
}
