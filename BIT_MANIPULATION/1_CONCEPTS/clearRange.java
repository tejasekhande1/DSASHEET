class Solution{
	public static void main(String[]args){
		int n = 15;
		int i=1,j=2;

		int a = (~0) << j+1;
		int b = (1 << i)-1;

		int ret = n & (a|b);
		System.out.println(ret);
	}
}
