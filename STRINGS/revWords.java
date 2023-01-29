import java.util.*;
class Solution{
	public void revWords(String str){
		Stack<String> s = new Stack<>();
		String temp="";
		for(int i=0 ; i<str.length() ; i++){
			if(str.charAt(i) == ' '){
				s.push(temp);
				temp = "";
			}else{
				temp = temp+str.charAt(i);
			}
		}
		s.push(temp);

		while(!s.isEmpty()){
			System.out.print(s.pop()+" ");
		}
		System.out.println("");
	}

	public void myRev(String str){
	
		Stack<String> s = new Stack<>();
		String[] token = str.split(" ");
		for(int i=0 ; i<token.length ; i++){
			s.push(token[i]);
		}
		
		while(!s.isEmpty()){
			System.out.print(s.pop()+" ");
		}
		System.out.println("");
	}
	public static void main(String[]args){
		Solution s = new Solution();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String : ");
		String str = sc.nextLine();
		System.out.println("Orignal String : "+str);
		s.revWords(str);
		s.myRev(str);
//		System.out.println("Reverse String : "+s.revWords(str));
	}
}
