// MOVE LAST ELEMENT OF LINKED LIST AT FIRST POSITION

#include<stdio.h>
#include<stdlib.h>

typedef struct Node{
	int data;
	struct Node* next;
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

Node* addLastFirst(){
	if(head == NULL){
		return NULL;
	}else if(head->next == NULL){
		return head;
	}else{
		Node* temp = head;
		while(temp->next->next != NULL){
			temp = temp->next;
		}

		temp->next->next = head;
		head = temp->next;
		temp->next = NULL;
		printNode();
		return head;
	}
}

void main(){
	int no;
	printf("Enter Number Of Nodes : ");
	scanf("%d",&no);
	for(int i=1 ; i<=no ; i++){
		addNode();
	}
	printNode();
	addLastFirst();
}
