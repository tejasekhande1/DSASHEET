#include <stdio.h>
#include <stdlib.h>

typedef struct Node{
	int data;
	struct Node *next;
}Node;

Node* head = NULL;

void printNode(){
	if(head == NULL){
		printf("Node NOT Found\n");
	}else{
		Node* temp = head;
		while(temp != NULL){
			if(temp->next != NULL){
				printf("|%d|->",temp->data);
			}else{
				printf("|%d|\n",temp->data);
			}
			temp = temp->next;
		}
	}
}

int detectLoop(){
	
		Node *slow = head;
		Node *fast = head;
		Node* prev = NULL;
		int cycle = 0;
		while(fast != NULL && fast->next != NULL){
			slow = slow->next;
			fast = fast->next->next;
			if(slow == fast){
				cycle = 1;
				break;
			}
		}
			
		if(cycle == 1){	
			slow = head;
			while(slow != fast){
				slow = slow->next;
				prev = fast;
				fast = fast->next;
			}
			prev->next = NULL;
		}else{
				printf("Loop NOT Exixts");
		}

		return 0;
}	

void main(){

	Node *newNode = (Node*)malloc(sizeof(Node));
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

	head->next->next->next->next = head->next;

	detectLoop();
	printNode();
}
