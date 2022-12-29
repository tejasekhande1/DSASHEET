import java.util.*;
import java.lang.*;
class Solution{
	public static int sumDigit(String str,int count){
		StringBuilder sb = new StringBuilder();
		int sum = 0;
		int i = 0; 
		int iSum = 0;
		int fSum = 0;
		while(i != str.length()){
			int num = 0;
			int cnt = 0;
			while(Character.isDigit(str.charAt(i))){			
				cnt++;
				num = num + Character.getNumericValue(str.charAt(i));		
				if(cnt == count){
					sb.append(num);
					sum = num;
					iSum = iSum*10 + sum;
					cnt = 0;
					sum = 0;
					num = 0;
				       	break;
				}

				if(i == str.length()-1){
					sb.append(num);
					iSum = iSum*10 + num;
					System.out.println("Sum : "+sb);
					return iSum*10 + num;
				}

				i++;
			}
		
			i++;
		}
		return sum;
	}

	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter String : ");
		String str = sc.nextLine();
		sumDigit(str,3);
		//System.out.println("Sum : "+sum);
	}
}
