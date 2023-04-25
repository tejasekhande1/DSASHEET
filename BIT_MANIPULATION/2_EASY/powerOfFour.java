class Solution{
	public boolean powerOfFour(int n){
		int k = n & (n-1);
		if(n > 0 && k == 0){
			int cnt = 0;
			while(n > 1){
				n = n >> 1;
				cnt++;
			}
			return (cnt%2 == 0) ? true : false;
		}
		return false;
	}
	public static void main(String[]args){
		Solution s = new Solution();
		int n = 5;
		System.out.println(s.powerOfFour(n));
	}
}
