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
	if(head == NULL){
		return -1;
	}else{
		if(head->next = head){
			printf("Only One Node Present\n");
			return 2;
		}else{
			Node *slow = head;
			Node *fast = head;
			while(fast != NULL && fast->next != NULL){
				slow = slow->next;
				fast = fast->next->next;
				if(slow == fast){
					return 1;
				}
			}

		}

		return 0;
	}
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

//	head->next->next->next->next = head;

	int val = detectLoop();
	if(val == 1){
		printf("Loop is Found\n");
	}else if(val == -1){	
		printf("LinkedList Empty\n");
	}else if(val == 2){
		printf("Loop is Found At First Position\n");
	}else{
		printf("Loop is NOT Found\n");
	}
}
