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

Node* rev(Node* head1){
	Node* temp1 = head1;
	Node* temp2 = NULL;
	Node* temp3 = NULL;

	while(temp1 != NULL){
		temp2 = temp1->next;
		temp1->next = temp3;
		temp3 = temp1;
		temp1 = temp2;
	}
	return temp3;
}

void revLL(int l,int r){	
	Node* temp = head,*prev = NULL;
	int count = 1;
	while(count != l){
		count++;
		prev = temp;
		temp = temp->next;
	}

	Node* start = temp;

	while(count != r){
		count++;
		temp = temp->next;
	}

	Node* last = temp->next;
	temp->next = NULL;

	Node* newHead = start;
	newHead = rev(newHead);

	prev->next = newHead;

	temp = newHead;
	while(temp->next != NULL){
		temp = temp->next;
	}

	temp->next = last;
/*	if(l == 1){
		return newHead;
	}else{
		return head;
	}*/	
}

void main(){

	int no;
	printf("Enter No of Nodes : \n");
	scanf("%d",&no);

	for(int i=1 ; i<= no ; i++){
		addNode();
	}

	printNode();

	int l,r;
	printf("Enter Left : ");
	scanf("%d",&l);
	printf("Enter Right : ");
	scanf("%d",&r);
	revLL(l,r);
//	printNode();
}
