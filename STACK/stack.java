import java.util.Scanner;
class Solution{

	static int top = -1;
	static int n,flag = 0;
	
	Scanner s = new Scanner(System.in);

	boolean isEmpty(){
		if(top == n-1){
			return false;
		}else{
			return true;
		}
	}

	boolean isFull(){
		if(top == -1){
			return false;
		}else{
			return true;
		}
	}

	void push(int arr[]){
		if(isEmpty()){
			System.out.print("Enter Element : ");
			int data = s.nextInt();
			top++;
			arr[top] = data; 
		}else{
			System.out.println("Stack Overflow");
		}
	}

	int pop(int arr[]){
		if(isFull()){
			flag = 1;
			int ret = arr[top];
			top--;
			return ret;
		}else{
			flag = 0;
			return -1;
		}
	}

	int peek(int arr[]){
		if(isFull()){
			flag = 1;
			return arr[top];
		}else{
			flag = 0;
			return -1;
		}
	}

	void print(int arr[]){
		if(top == -1){
			System.out.println("Stack Underflow");
		}else{
			for(int i=top ; i>=0 ; i--){
				System.out.print("|"+arr[i]+"|\n");
			}
		}
	}
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Initial Size of Stack : ");
		n = sc.nextInt();
		int arr[] = new int[n];
		
		char ans;
		do{
			System.out.println("1.Push");
			System.out.println("2.Pop");
			System.out.println("3.Peak");
			System.out.println("4.Print");

			System.out.print("Enter Your Choice : ");
			int ch = sc.nextInt();

			switch(ch){
				case 1 :
					Solution p1 = new Solution();
					p1.push(arr);
					break;
				case 2 :{
					Solution p3 = new Solution();
					int ret = p3.pop(arr);
					if(flag == 1){
						System.out.println("Popped Element : "+ret);
					}else{
						System.out.println("Stack Underflow");
					}
					break;
				}
				
				case 3 :{
					Solution p4 = new Solution();
					int ret = p4.peek(arr);
					if(flag == 1){
						System.out.println("Peek Element : "+ret);
					}else{
						System.out.println("Stack Underflow");
					}
					break;
				}
				case 4 :
					Solution p2 = new Solution();
					p2.print(arr);
					break;
				default :
					System.out.println("Wrong Choice");
					break;
			}

			System.out.println("Do you want to continue..?");
			ans = sc.next().charAt(0);
		}while(ans == 'Y' || ans == 'y');
	}
}
