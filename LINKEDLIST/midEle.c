#include <stdio.h>
#include <stdlib.h>

typedef struct Node{
	struct Node *prev;
	int data;
	struct Node *next;
}Node;

Node *head = NULL;

Node* createNode(){
	Node *newNode = (Node*)malloc(sizeof(Node));
	newNode->prev = NULL;
	printf("Enter Data : ");
	scanf("%d",&newNode->data);
	newNode->next = NULL;
	return newNode;
}

void addNode(){
	Node *newNode = createNode();
	if(head == NULL){
		head = newNode;
	}else{
		Node *temp = head;
		while(temp->next != NULL){
			temp = temp->next;
		}
		temp->next = newNode;
		newNode->prev = temp;
	}
}

void printNode(){
	if(head == NULL){
		printf("NODE NOT AVAILABLE\n");
	}else{
		Node *temp = head;
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

int countNode(){
	int cnt = 0;
	Node *temp = head;
	while(temp != NULL){
		cnt++;
		temp = temp->next;
	}
	return cnt;
}

Node* midElement(){
	if(head == NULL){
		return NULL;
	}else{
		Node* temp = head;
		int cnt = countNode();
		int midIdx = cnt/2;
		while(midIdx--){
			temp = temp->next;
		}
		printf("%d\n",temp->data);
		return temp;
	}
}

Node* midEle(){
	if(head == NULL){
		printf("Invalid Output\n");
		return NULL;
	}else{
		Node* slow = head;
		Node* fast = head->next;
		while(fast != NULL && fast->next != NULL){
			slow = slow->next;
			fast = fast->next->next;
		}
		printf("Mid : %d\n",slow->data);
		return slow;
	}
}

void main(){
	int no;
	printf("Enter No of Nodes : ");
	scanf("%d",&no);

	for(int i=0 ; i<no ; i++){
		addNode();
	}

	printNode();

	midEle();
}
