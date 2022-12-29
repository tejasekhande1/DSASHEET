import java.util.*;
import java.lang.*;
class Solution{
	public static int sumDigit(String str){
		int sum = 0;
		int i = 0; 
		while(i != str.length()){
			int num = 0;
			while(Character.isDigit(str.charAt(i))){	
				num = num*10+ Character.getNumericValue(str.charAt(i));
				if(i == str.length()-1) return sum += num;
				i++;	
			}
			sum += num;
			i++;
		}
		return sum;
	}

	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter String : ");
		String str = sc.nextLine();
		int sum = sumDigit(str);
		System.out.println("Sum : "+sum);
	}
}
