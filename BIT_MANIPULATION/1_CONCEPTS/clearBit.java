// CLEAR iTH BIT

class Solution{
	public static void main(String[]args){
		int n = 10;
		int i = 3;
		int ret = n ^ (1 << i);
		int ret1 = n & ~(1 << i);
		System.out.println(ret);             // 2
		System.out.println(ret1); 	     // 2
	}
}
