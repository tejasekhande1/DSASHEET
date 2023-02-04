import java.util.Scanner;
class Solution{
	public static boolean checkArmstrong(int num){
		int ans = 0;
		int temp = num;
		while(num > 0){
			int last = num%10;
			ans = ans + (last*last*last);
			num = num/10;
		}
		if(ans == temp){
			return true;
		}else{
			return false;
		}
	}
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Number : ");
		int num = sc.nextInt();
		boolean ret = checkArmstrong(num);
		System.out.println("Answer : "+ret);
	}
}
