#include<stdio.h>
#include<unistd.h>
#include<wait.h>
int main(){
    printf("P1 starts\n");
    execl("./p2","p2",NULL);
    printf("P1 ends\n");
    return 0;
}