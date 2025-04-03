#include<stdio.h>
void BFS();
int G[10][10],n,que[20],f=0,r=0;
int vis[20];
int i,j,k,s;
void main()
{
 printf("enter the numbere of vertices");
        scanf("%d",&n);
        printf("Enter the adjacency Matrix of graph:\n");
        for(i=1;i<=n;i++)
        {
                for(j=1;j<=n;j++)
                {
                        scanf("%d",&G[i][j]);
                }
        }
        for(i=1;i<=n;i++)
        {
        vis[i]=0;
        }
        printf("enter source vertex\n");
        scanf("%d",&s);
        vis[s]=1;
        printf("\n order of visting vertices  using BFS=%d\t",s);
        BFS();
}
void BFS() {
        k=1;
        while (k < n) {

        for (int i = 1; i <= n; i++) {
            if ((G[s][i] == 1) && (vis[i] ==0)){
                que[r++] = i;
                vis[i] = 1;

            }
        }
        if(f>r){
                break;
        }

                s=que[f++];
                printf(" %d ",s);
                k++;
    }
}
