import java.util.*;
class Solution{

	int top1 = -1;
	int top2 = -1;
	int size,flag;
	Scanner sc = new Scanner(System.in);

	public int push1(int stack[]){
		if(top1 == top2-1){
			return -1;
		}else{
			top1++;
			System.out.println("Enter Data : ");
			int data = sc.nextInt();
			stack[top1] = data;
			return 0;
		}
	}

	public int push2(int stack[]){
		if(top1+1 == top2){
			return -1;
		}else{
			top2--;
			System.out.println("Enter Data : ");
			int data = sc.nextInt();
			stack[top2] = data;
			return 0;
		}
	}

	public int pop1(int stack[]){
		if(top1 == -1){
			flag = 1;
			return -1;
		}else{
			flag = 0;
			int ret = stack[top1];
			top1--;
			return ret;
		}
	}
	
	public int pop2(int stack[]){
		if(top2 == size){
			flag = 1;
			return -1;
		}else{
			flag = 0;
			int ret = stack[top2];
			top2++;
			return ret;
		}
	}

	public int print(int stack[]){
		if(top1 == -1 && top2 == size){
			return -1;
		}else{
			if(top1 != -1){
				System.out.println("_First_Stack_");
				for(int i=top1 ; i>=0 ; i--){
					System.out.println("|"+stack[i]+"|");
				}
			}

			if(top2 != size){
				System.out.println("_Second_Stack_");
				for(int i=top2 ; i<=size-1 ; i++){
					System.out.println("|"+stack[i]+"|");
				}
			}
			return 0;
		}
	}

	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		Solution s = new Solution();
		System.out.println("Enter Size of Array : ");
		s.size = sc.nextInt();

		int stack[] = new int[s.size];
		s.top2 = s.size;

		char ch;
		do{
			System.out.println("1.Push1");
			System.out.println("2.Push2");
			System.out.println("3.Pop1");
			System.out.println("4.Pop2");
			System.out.println("5.Print");

			System.out.print("Enter Your Choice : ");
			int choice = sc.nextInt();

			switch(choice){
				case 1:{
					int ret = s.push1(stack);
					if(ret == -1){
						System.out.println("Stack Overflow");
					}
				}
					break;
	
				case 2:{
					int ret = s.push2(stack);
					if(ret == -1){
						System.out.println("Stack Overflow");
					}
				}
					break;
	
				case 3:{
					int ret = s.pop1(stack);
					if(s.flag == 1){
						System.out.println("Stack Underflow");
					}else{
						System.out.println("Popped Element : "+ret);
					}
				}
					break;
	
				case 4:{
					int ret = s.pop2(stack);
					if(s.flag == 1){
						System.out.println("Stack Underflow");
					}else{
						System.out.println("Popped Element : "+ret);
					}
				}
					break;
	
				case 5:{
					int ret = s.print(stack);
					if(ret == -1){
						System.out.println("Stack Underflow");
					}
				}
					break;
			}

			System.out.println("Do you want to continue....?");
			ch = sc.next().charAt(0);
		}while(ch == 'Y' || ch == 'y');
	}
}
