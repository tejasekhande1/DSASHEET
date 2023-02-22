// FIND NTH DIGIT OF THE INFINITE INTEGER SEQUENCE

import java.util.*;
class Solution{
	public int nthDigit(int n){
		int ret = 0;
		for(int i=1 ; i<=n ;){
			int num = i;
			while(num > 0){
				ret = num%10;
				num = num/10;
				i++;
			}
		}
		return ret;
	}
	public static void main(String[]args){
		Solution s = new Solution();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number : ");
		int n = sc.nextInt();
		System.out.println(n+"th Digit is : "+s.nthDigit(n));
	}
}
