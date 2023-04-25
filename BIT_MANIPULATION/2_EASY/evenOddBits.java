class Solution{
	public void oddEvenBits(int n){
		int even = 0;
		int odd = 0;
		int idx = 0;
		while(n > 0){
			if((idx % 2 == 0) && ((n & 1) == 1)){
				even++;
			}

			if((idx % 2 != 0) && ((n & 1) == 1)){
				odd++;
			}
			idx++;
			n = n >> 1;
		}

		System.out.println("["+even+","+odd+"]");
	}
	public static void main(String[]args){
		Solution s = new Solution();
		int n = 2;
		s.oddEvenBits(n);
	}
}
