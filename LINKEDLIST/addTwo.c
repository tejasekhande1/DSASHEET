#include <stdio.h>
#include <stdlib.h>

typedef struct Node{
	int data;
	struct Node* next;
}Node;

Node* head1 = NULL;
Node* head2 = NULL;
Node* head3 = NULL;

Node* createNode(){
	Node* newNode = (Node*)malloc(sizeof(Node));
	printf("Enter Data : ");
	scanf("%d",&newNode->data);
	newNode->next = NULL;
	return newNode;
}

Node* createNode1(int data){
	Node* newNode = (Node*)malloc(sizeof(Node));
	newNode->data = data;
	newNode->next = NULL;
	return newNode;
}

void addNode1(int data){
	Node* newNode = createNode1(data);
	if(head3 == NULL){
		head3 = newNode;
	}else{
		Node *temp = head3;
		while(temp->next!=NULL){
			temp = temp->next;
		}
		temp->next = newNode;
	}
}

void addNode(Node **head){
	Node* newNode = createNode();
	if(*head == NULL){
		*head = newNode;
	}else{
		Node *temp = *head;
		while(temp->next!=NULL){
			temp = temp->next;
		}
		temp->next = newNode;
	}
}

void printNode(Node* head){
	if(head == NULL){
		printf("LinkedList Empty\n");
	}else{
		Node* temp = head;
		while(temp->next != NULL){
			printf("|%d|->",temp->data);
			temp = temp->next;
		}
		printf("|%d|\n",temp->data);
	}
}

Node* revList(Node* head){
	struct Node *temp1 = head;
	struct Node *temp2 = NULL;
	struct Node *temp3 = NULL;
	while(temp1 != NULL){
		temp2 = temp1->next;
		temp1->next = temp3;
		temp3 = temp1;
		temp1 = temp2;
	}

	return temp3;
}

void addTwo(){

	Node* s1 = revList(head1);
	Node* s2 = revList(head2);
	int carry = 0;
	int sum = 0;
	while(s1 != NULL  || s2 != NULL ){
	
		if(s1 != NULL && s2 != NULL){
			sum = s1->data + s2->data + carry;
			s1 = s1->next;
			s2 = s2->next;
		}else if(s1 != NULL){
			sum = s1->data + carry;
			s1 = s1->next;
		}else if(s2 != NULL){
			sum = s2->data + carry;			
			s2 = s2->next;
		}

		addNode1(sum%10);
		carry = sum/10;
/*
		if(s1 != NULL && s2 != NULL){
			s1 = s1->next;
			s2 = s2->next;
		}else if(s1 != NULL)
			s1 = s1->next;
		else if(s2 != NULL)
			s2 = s2->next; */

	}

	if(carry > 0){
		addNode1(carry);
	}
}

void main(){
	int l1;
	printf("Enter No of Nodes (LinkedList 1): ");
	scanf("%d",&l1);
	for(int i=1 ; i<=l1 ; i++){
		addNode(&head1);
	}
	
	int l2;
	printf("Enter No of Nodes (LinkedList 2): ");
	scanf("%d",&l2);
	for(int i=1 ; i<=l2 ; i++){
		addNode(&head2);
	}

	printNode(head1);
	printNode(head2);
	addTwo();
	head3 = revList(head3);
	printNode(head3);
}
