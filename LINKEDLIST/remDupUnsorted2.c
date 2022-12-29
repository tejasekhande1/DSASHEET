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

void printNode();

void removeDup(){
	if(head == NULL){
		printf("Node NOT Found\n");
	}else{
		Node *temp1 = head;
		Node *temp2 = NULL;
		Node *dup = NULL;
		while(temp1 != NULL && temp1->next != NULL){
			temp2 = temp1;
			while(temp2->next != NULL){
				if(temp1->data == temp2->next->data){
					dup = temp2->next;
					temp2->next = temp2->next->next;
					free(dup);
				}else{
					temp2 = temp2->next;
				}
			}
			temp1 = temp1->next;
		}
		printNode();
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

void main(){
	int no;
	printf("Enter No Of Nodes : \n");
	scanf("%d",&no);

	for(int i=1 ; i<=no ; i++){
		addNode();
	}
	printNode();
	removeDup();
}
