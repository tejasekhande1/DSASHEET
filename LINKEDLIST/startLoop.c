#include <stdio.h>
#include <stdlib.h>

typedef struct Node{
	int data;
	struct Node *next;
}Node;

Node* head = NULL;

void printNode(){
	Node* temp = head;
	while(temp != NULL){
		printf("%d ",temp->data);
		temp = temp->next;
	}
	printf("\n");
}

void startOfLoop(){
	Node* slow = head;
	Node* fast = head;
	int cycle = 0;
	while(fast != NULL && fast->next != NULL){
		fast = fast->next->next;
		slow = slow->next;
		if(slow == fast){
			cycle = 1;
			break;
		}
	}

	if(cycle == 1){
		slow = head;
		while(slow != fast){
			slow = slow->next;
			fast = fast->next;
		}

		printf("First Loop Point : %d\n",fast->data);
	}else{
		printf("Loop Not Found\n");
	}
}

void main(){
	Node* newNode = (Node*)malloc(sizeof(Node));
	newNode->data = 10;
	newNode->next = NULL;
	head = newNode;

	newNode = (Node*)malloc(sizeof(Node));
	newNode->data = 20;
	newNode->next = NULL;
	head->next = newNode;

	newNode = (Node*)malloc(sizeof(Node));
	newNode->data = 30;
	newNode->next = NULL;
	head->next->next = newNode;

	newNode = (Node*)malloc(sizeof(Node));
	newNode->data = 40;
	newNode->next = NULL;
	head->next->next->next = newNode;

	printNode();
	head->next->next->next->next = head->next->next;

	startOfLoop();
}
