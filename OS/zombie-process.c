//c program to demonstrate zombie process
#include<stdio.h>
#include<unistd.h>
#include<wait.h>

int main(){
	pid_t pid;
    printf("Main starts \n");
	pid = fork();
	if(pid == 0){
		printf("Child process executed \n");
	}
	else if(pid > 0){
		printf("Parent process Started \n");
        pause();
        printf("Parent process Completed\n"); // This line will never be executed
        }
	else
		printf("Error in process");
    printf("Main ends \n");
    return 0;
}