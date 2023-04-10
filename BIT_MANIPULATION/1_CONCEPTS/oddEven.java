class Solution{
	public String oddEven(int n){
		if(( n & 1) == 0) return "even";
		else return "odd";
	}
	public static void main(String[]args){
		Solution s = new Solution();
		int n = 11;
		System.out.println(s.oddEven(n));
	}
}
