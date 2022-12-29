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

void printNode();

void deleteFirst(){
	if(head == NULL){
		printf("Node NOT Available\n");
	}else if(head->next == NULL){
		free(head);
		head = NULL;
	}else{
		struct Node *temp = head;
		head = head->next;
		free(temp);
	}
}

void deleteLast(){
	if(head == NULL){
		printf("Nodes NOT Available\n");
	}else if(head->next == NULL){
		free(head);
		head = NULL;
	}else{
		struct Node *temp = head;
		while(temp->next->next != NULL){
			temp = temp->next;
		}
		free(temp->next);
		temp->next = NULL;
	}
}

int deleteAtPos(int pos){
	int count = countNode();
	if(pos <= 0 || pos > count){
		printf("Invalid Position\n");
		return -1;
	}else{
		if(pos == count){
              		deleteLast();
        	}else if(pos == 1){
                	deleteFirst();
        	}else{
			struct Node *temp = head;
	               	while(pos-2){
				temp = temp->next;
			}
			struct Node *temp2 = temp->next->next;
			free(temp->next);
			temp->next = temp2;
       		}

		return 0;
	}
}

void removeDup(){
	int cnt = countNode();
	if(head == NULL){
		printf("Node NOT Found\n");
	}else{
		Node *temp1 = head;
		int pos = 1;
		while(temp1->next != NULL){
			Node *temp2 = temp1->next;
			int pos1 = pos+1;
			while(temp2 != NULL){
				if(temp1->data == temp2->data){
					if(cnt == pos1){
						deleteAtPos(pos1);
					}else{
						temp2 = temp2->next;
						deleteAtPos(pos1);
					}
				}else{
					temp2 = temp2->next;
					pos1++;
				}
			}
			temp1 = temp1->next;
			pos++;
		}
	}
		printNode();
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

void main(){
	int no;
	printf("Enter No Of Nodes : \n");
	scanf("%d",&no);

	for(int i=1 ; i<=no ; i++){
		addNode();
	}
	printNode();
	removeDup();
}
