import java.util.*;
import java.lang.*;
class Solution{
	public static boolean isPalindrome(String str){

		System.out.println(str.length());
		str = str.toLowerCase();

		StringBuilder sb = new StringBuilder();		
		for(int i=0 ; i<str.length() ; i++){
			if(Character.isDigit(str.charAt(i)) || Character.isLetter(str.charAt(i))){
				sb.append(str.charAt(i));
			}
		}

		int n = sb.length()-1;
/*		for(int i=0 ; i<sb.length()/2 ; i++){
			if(sb.charAt(i) != sb.charAt(n-i)){
				return false;
			}
		}
*/

		int i = 0 ;
		while(n > i){
			if(sb.charAt(i) != sb.charAt(n)){
                                return false;
                        }
			n--;
			i++;
		}
		return true;
	}

	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter String : ");
		String str = sc.nextLine();
		boolean res = isPalindrome(str);
		System.out.println(res);
	}
}
