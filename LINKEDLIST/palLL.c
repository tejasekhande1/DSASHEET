#include <stdio.h>
#include <stdlib.h>
#include <stdbool.h>

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

bool palindrome(){
	if(head == NULL || head->next == NULL){
		return true;
	}else{
		int cnt = countNode();
		int x = cnt/2;
		int pos = 1;
		Node* temp1 = head;
		while(x){
			Node* temp2 = head;
			int y = cnt-pos;
			while(y){
				temp2 = temp2->next;
				y--;
			}			
			if(temp1->data != temp2->data){
				return false;
			}

			temp1 = temp1->next;
			pos++;
			x--;
		}
		return true;
	}
}

bool mySol(){
	int size = countNode();
	int n = size;
	int arr[n];
	Node* temp = head;
	int i=0;

	while(size){
		arr[i++] = temp->data;
		temp = temp->next;
		size--;
	}

	int len = n-1;
	for(int i=0 ; i<n/2 ; i++){
		if(arr[i] != arr[len]){
			return false;
		}
		len--;
	}
	return true;
}

Node* getMid(){
	Node* slow = head;
	Node* fast = head->next;
	while(fast != NULL && fast->next != NULL){
		slow = slow->next;
		fast = fast->next->next;
	}
	return slow;
}

Node* rev(Node* head){
	Node* temp1 = head;
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

bool babbarSol(){

	int cnt = countNode();
	if(head == NULL || head->next == NULL){
		return true;
	}else{
		Node* mid = getMid();

		Node* temp = mid->next;
		Node* newHead = rev(temp);
		mid->next = newHead;
	
		Node* temp1 = head;
		Node* temp2 = mid->next;

		while(temp1 != mid){
			if(temp1->data != temp2->data){
				return false;
			}

			temp1 = temp1->next;
			temp2 = temp2->next;
		}

		if(cnt%2 == 0){
			if(temp2->data != mid->data){
				return false;
			}	
		}	
		return true;
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
	bool res = babbarSol();
	printf("True(1)/False(0) : %d\n",res);
	printNode();
}
