class Solution{
	public boolean isPowerOfTwo(int n){
		if(n <= 0 || ((n & (n-1)) != 0)){
			return false;
		}else{
			return true;
		}	
	}
	public static void main(String[]args){
		Solution s = new Solution();
		int n = 16;
		System.out.println(s.isPowerOfTwo(n));
	}
}
