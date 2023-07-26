class Solution{
	public boolean isPerfectSquare(int num){
		if(num == 1) return true;
		int s=1;
		int e = num;
		while(s <= e){
			int mid = (s+e)/2;
			if(mid*mid == num){
				return true;
			}else if(mid*mid < num){
				s = mid+1;	
			}else{
				e = mid-1;
			}
		}

		return false;
	}
	public static void main(String[] args){
		Solution s = new Solution();
		int num = 14;
		System.out.println(s.isPerfectSquare(num));
	}
}
