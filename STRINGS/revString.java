
import java.util.*;
class Solution{
	public String revString(String str){
		int n = str.length()-1;
		String temp = "";
		for(int i=str.length()-1 ; i >= 0 ; i--){
			temp = temp+str.charAt(i);
		}
		return temp;
	}
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		Solution s = new Solution();
		String str = sc.nextLine();
		System.out.println("Orignal String : "+str);		
		System.out.println(s.revString(str));		
	}
}
