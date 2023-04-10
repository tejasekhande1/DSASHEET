// n = 1111 i = 2
// return 1100

class Solution{
	public static void main(String[]args){
		int n = 15;
		int i = 2;
		int ret = n & ((~0) << i);
		System.out.println(ret);
		// OR
		int ret1 = n & ((-1) << i);
		System.out.println(ret1);
	}
}
