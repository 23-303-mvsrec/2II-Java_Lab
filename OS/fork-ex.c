#include<stdio.h>
#include<unistd.h>

void main(){
	pid_t pid;
	pid = fork();

	if(pid>0)
		printf("Parent process created,ID: %d\n",getpid());
	else if(pid == 0)
		printf("Child process created,ID: %d\n",getpid());
	else
		printf("Invalid Process");
}
