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

int remEnd(){
	if(head == NULL){
		printf("LL Empty\n");
		return -1;
	}else{
		int cnt = countNode();
		int n;
		printf("Enter Nth Node to Remove : ");
		scanf("%d",&n);
		int pos = cnt-n-1;

		Node* temp = head;
		if(n <= 0 && n > cnt){
			printf("Invalid\n");
			return -1;
		}else if( n == cnt){
			temp = head;
			head = head->next;
			free(temp);
		}else if(n == 1){
			temp = head;
			while(pos){
				pos--;
				temp = temp->next;
			}
			free(temp->next);
			temp->next = NULL;
		}else{
			temp = head;
			while(pos){
				temp = temp->next;
				pos--;
			}
			Node* temp2 = temp->next;
			temp->next = temp->next->next;
			free(temp2);
		}

		return 0;
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
	remEnd();
	printNode();
}
