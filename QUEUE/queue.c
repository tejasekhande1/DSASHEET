#include <stdio.h>

int front = -1;
int rear = -1;
int size;

int Enqueue(int arr[]){
	if(rear == size-1){
		printf("Queue is Full\n");
		return -1;
	}

	if(front == -1 && rear == -1){
		front++;
	}

	printf("Enter Data : ");
	scanf("%d",&arr[++rear]);

	return 0;	
}

void Dequeue(int queue[]){
	if(front == -1 && rear == -1){
		printf("Queue is Empty\n");
		return;
	}else{
		int ret = queue[front];
		if(front == rear){
			front = -1;
			rear = -1;
		}else{
			front++;
		}
		printf("Removed Element is : %d\n",ret);
	}
}

void printQueue(int queue[]){
	if(front == -1 && rear == -1){
		printf("Queue is Empty\n");
		return;
	}

	for(int i=front ; i<=rear ; i++){
		printf(" %d ",queue[i]);
	}
	printf("\n");
}

void main(){
	printf("Enter Size of Queue : ");
	scanf("%d",&size);
	int arr[size];
	char ch;
	do{
		printf("1.Enqueue\n");
		printf("2.Dequeue\n");
		printf("3.Frontt\n");
		printf("4.PrintQueue\n");

		int choice;
		printf("Enter Choice : ");
		scanf("%d",&choice);

		switch(choice){
			case 1 :
				Enqueue(arr);
				break;
			case 2 :
				Dequeue(arr);
				break;
			case 4 :
				printQueue(arr);
				break;
		}

		printf("\nDo you want to continue ? \n");
		scanf(" %c",&ch);
	}while(ch == 'Y' || ch == 'y');
}
