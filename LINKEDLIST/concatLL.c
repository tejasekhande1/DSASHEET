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

void conCat(){
	int flag = 0,num = 0;
	printf("In Which LinkedList Node will Concate (1 or 2) : \n");
	scanf("%d",&flag);

	printf("Enter Last Nth Nodes : \n");
	scanf("%d",&num);
	
	Node* temp1 = head1;
	Node* temp2 = head2;

	if(flag == 1){
		int cnt = countNode(head2);
		if(num <= 0){
			printf("Invalid Operation\n");
		}else if(temp1 == NULL){
			while(cnt - num){
				temp2 = temp2->next;
				cnt--;
			}
			head1 = temp2;
		}else if(num <= cnt){
			while(temp1->next != NULL){
				temp1 = temp1->next;
			}
			
			while(cnt - num){
				temp2 = temp2->next;
				cnt--;
			}
			temp1->next = temp2;
		}else{
			printf("Number Greater Than Nodes\n");
		}
			printNode(head1);	
	}else if(flag == 2){
		int cnt = countNode(head1);
		if(num <= 0){
			printf("Invalid Operation\n");
		}else if(head2 == NULL){
			while(cnt - num){
				temp1 = temp1->next;
				cnt--;
			}
			head2 = temp1;
		}else if(num <= cnt){
			while(temp2->next != NULL){
				temp2 = temp2->next;
			}
			
			while(cnt - num){
				temp1 = temp1->next;
				cnt--;
			}
			temp2->next = temp1;
		}else{
			printf("Number Greate Than Nodes\n");
		}
		printNode(head2);
	}else{
		printf("Wrong Input\n");
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

	conCat();
	printNode(head1);
//	printNode(head2);
}
