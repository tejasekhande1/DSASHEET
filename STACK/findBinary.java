import java.util.*;
class Solution{
	static Stack<Integer> s = new Stack<>();
	public int findBinary(int num){
		while(num != 0){
			s.push(num%2);
			num = num/2;
		}

		int ret = findComp();
		return ret;

/*		while(!s.isEmpty()){
			int x = s.peek();
			if(x == 0){
				System.out.print(0);
			}else{
				System.out.print(1);
			}
			s.pop();
		} */
	}

	public int findComp(){
		int rev = 0;
		int two = 1;
		while(!s.isEmpty()){
		
			int x = s.peek();
		
			if(x == 0){
				rev = rev + 1*two;
			}

			two = two*2;
			s.pop();
		}
		return rev;
	}

	public static void main(String[]args){
		Solution s = new Solution();
		int ret = s.findBinary(7);
		System.out.println("1's Complement : "+ret);
	}
}
