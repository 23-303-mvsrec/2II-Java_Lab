#include<stdio.h>
#include<unistd.h>
#include<fcntl.h>

void main(){
	char src[100],dest[100];
	int fd1,fd2;
	char buffer;

	printf("Enter the source file: ");
	scanf("%s",src);
	printf("Enter the destination file:");
	scanf("%s",dest);

	fd1 = open(src, O_RDONLY, NULL);
	fd2 = open(dest,O_WRONLY | O_CREAT,0666);	

	while(read(fd1,&buffer,1))
		write(fd2,&buffer,1);

	printf("File Copied Successfully");
	
	close(fd1);
	close(fd2);
}
