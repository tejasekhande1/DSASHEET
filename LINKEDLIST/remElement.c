#include <stdio.h>
#include <stdlib.h>

typedef struct Node{
	int data;
	struct Node *next;
}Node;

struct Node *head = NULL;

struct Node *createNode(){
	struct Node *newNode = (struct Node*)malloc(sizeof(struct Node));
	printf("Enter Data : \n");
	scanf("%d",&newNode->data);
	newNode->next = NULL;
	return newNode;
}

void addNode(){
	struct Node *newNode = createNode();
	if(head == NULL){
		head = newNode;
	}else{
		struct Node *temp = head;
		while(temp->next != NULL){
			temp = temp->next;
		}
		temp->next = newNode;
	}
}

void printNode(){
	if(head == NULL){
		printf("Nodes NOT Found\n");
	}else{
		struct Node *temp = head;
		while(temp != NULL){
			if(temp->next != NULL){
				printf("|%d|->",temp->data);
			}else{
				printf("|%d|",temp->data);
			}

			temp = temp->next;
		}

		printf("\n");
	}
}

int countNode(){
	if(head == NULL){
		return 0;
	}else{
		struct Node *temp = head;
		int count = 0;
		while(temp != NULL){
			count++;
			temp=temp->next;
		}
		return count;
	}
}

int delEle(int val){
	if(head == NULL){
		printf("LL Empty\n");
	}else if(head->data == val){
		Node *temp = head;
		head = head->next;
		free(temp);
	}else{
		Node* temp = head;
		while(temp->next != NULL){
			if(temp->next->data == val){
				Node* temp2 = temp->next->next;
				free(temp->next);
				temp->next = temp2;
			}else{
				temp = temp->next;
			}
		}
	}
}

void main(){

	int no;
	printf("Enter No of Nodes : \n");
	scanf("%d",&no);

	for(int i=1 ; i<= no ; i++){
		addNode();
	}

	printNode();
	delEle(5);
	printNode();
}
