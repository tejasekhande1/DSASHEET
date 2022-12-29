#include <stdio.h>
#include <stdlib.h>

typedef struct Node{
	int data;
	struct Node* next;
}Node;

Node* head1 = NULL;
Node* head2 = NULL;

Node* createNode(){
	Node* newNode = (Node*)malloc(sizeof(Node));
	printf("Enter Data : ");
	scanf("%d",&newNode->data);
	newNode->next = NULL;
	return newNode;
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

int countNode(Node* head){
	int cnt = 0;
	Node* temp = head;
	while(temp != NULL){
		cnt++;
		temp = temp->next;
	}
	return cnt;
}

void interSection(int pos){
	Node* temp1 = head1;
	pos--;
	while(pos--){
		temp1 = temp1->next;
	}
	Node* temp2 = head2;
	while(temp2->next != NULL){
		temp2 = temp2->next;
	}
	temp2->next = temp1;
}

int interPoint(){
	int l1 = countNode(head1);
	int l2 = countNode(head2);
	int d = 0;
	Node* ptr1;
	Node* ptr2;
	if(l1 > l2){
		d = l1-l2;
		ptr1 = head1;
		ptr2 = head2;
	}else{
		d = l2-l1;
		ptr1 = head2;
		ptr2 = head1;
	}

	while(d){
		ptr1 = ptr1->next;
		if(ptr1 == NULL){
			return -1;
		}
		d--;
	}

	while((ptr1 != NULL) && (ptr2 != NULL)){
		if(ptr1 == ptr2){
			return ptr1->data;
		}
		ptr1 = ptr1->next;
		ptr2 = ptr2->next;
	}

	return -1;
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


	int pos;
	printf("Enter Position For Intersection : ");
	scanf("%d",&pos);
	interSection(pos);
	printNode(head1);
	printNode(head2);
	int res = interPoint();
	printf("%d\n",res);
}
