#include<stdio.h>
#include<unistd.h>
#include<wait.h>

void main(){
	pid_t pid;
	pid = fork();

	if(pid > 0){
		printf("Parent process Started \n");
		wait(NULL);
		printf("Parent process Completed\n");
	}
	else if(pid == 0){
		printf("Child process Started \n");
                sleep(5);
                printf("Child process Completed \n");
        }
	else
		printf("Error in process");
}
