import java.io.*;
import java.util.*;

class Solution{
	public static boolean validPara(String str){
		Stack <Character> s = new Stack<>();
		for(int i=0 ; i<str.length() ; i++){
			char temp = str.charAt(i);
			if(temp == '(' || temp == '['|| temp == '{'){
				s.push(temp);
			}else {
				if(s.isEmpty()){
					return false;
				}

				if(
						(temp == ')' && s.peek() == '(') || 
						(temp == ']' && s.peek() == '[') || 
						(temp == '}' && s.peek() == '{')){
						s.pop();
				}else{
					return false;
				}

			}
		}

		if(s.isEmpty()){
			return true;
		}else{
			return false;
		}
	}
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter String : ");
		String str = sc.nextLine();
		System.out.println(validPara(str));	
	}
}
