class Solution{
	public boolean isHappy(int n){
		int num = n;
		while(n > 1){
			n = 0;
			n = n + (num%10)*(num%10);
			num = num/10;
			if(num < 1){
				num = n;	
			}
		}

		if(num == 1){
			return true;
		}else{
			return false;
		}
	}

	public static void main(String[] args){
		Solution s = new Solution();
		int n = 2;
		System.out.println(s.isHappy(n));
	}
}
