class Solution{
	public int fastExpo(int a,int N){
		int ans = 1;
		while(N>0){
			if((N & 1) != 0){
				ans = ans*a;
			}
			a = a*a;
			N = N >> 1;
		}
		return ans;
	}
	public static void main(String[]args){
		Solution s = new Solution();
		int a = 3;
		int n = 5;
		int ret = s.fastExpo(a,n);
		System.out.println(ret);
	}
}
