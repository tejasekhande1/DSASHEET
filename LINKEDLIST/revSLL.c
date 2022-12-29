#include <stdio.h>
#include <stdlib.h>
struct Node{
	int data;
	struct Node *next;
};

struct Node *head = NULL;

struct Node* createNode(){
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

void revList(){
	struct Node *temp1 = head;
	struct Node *temp2 = NULL;
	struct Node *temp3 = NULL;
	while(temp1 != NULL){
		temp2 = temp1->next;
		temp1->next = temp3;
		temp3 = temp1;
		temp1 = temp2;
	}
	head = temp3;
}

void main(){
	for(int i=0 ; i<5 ; i++){
		addNode();
	}

	printNode();
	revList();
	printNode();
}
