import java.util.*;
class Solution{
	public static boolean validShuffle(String str1,String str2,String str3){
		if(str1.length() + str2.length() != str3.length()){
			return false;
		}

		char[] s1 = str1.toCharArray(); 
		char[] s2 = str2.toCharArray(); 
		char[] s3 = str3.toCharArray(); 
	
		int i=0,j=0,k=0;
	
		while(k < s3.length){
			if((i < s1.length) && (s1[i] == s3[k])){
				i++;
			}else if((j < s2.length) && (s2[j] == s3[k])){
				j++;
			}else{
				return false;
			}

			k++;
		}

		return ((i>=s1.length) && (j>=s2.length));
	}
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st String : ");
		String str1 = sc.nextLine();
		System.out.println("Enter 2nd String : ");
		String str2 = sc.nextLine(); 
		System.out.println("Enter 3rd String : ");
		String str3 = sc.nextLine();

		System.out.println(validShuffle(str1,str2,str3));	
	}
}
