import java.util.*;
import java.lang.*;
class Solution{
	public static void findDup(String str){
		String newStr = "";
		for(int i=0 ; i<str.length() ; i++){
			char ch = str.charAt(i);
			if(newStr.indexOf(ch) == -1){
				//newStr += ch;
				newStr += ch;
			}
		}

/*		HashSet <Character> hs = new HashSet <>();
		for(int i=0 ; i<str.length() ; i++){
			if(hs.contains(str.charAt(i))){
				System.out.println(str.charAt(i) + " Duplicate");
			}else{
				hs.add(str.charAt(i));
			}
		}
		
		String result = hs.toString().replaceAll("\\[|\\]|,\\s", "");
//		String result = StringUtils.join(hs, ","); */

		System.out.println(newStr);
	}
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String : ");
		String str = sc.nextLine();
		findDup(str);
	}
}
