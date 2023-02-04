class Solution{
	public static long findSqrt(int num){
		long start = 1;
		long end = num/2;
		long ret = 0;
		while(start <= end){
			long mid = start+(end-start)/2;
			if(mid*mid == num) return mid;
			if(mid*mid > num) end = mid-1;
			if(mid*mid < num){
				ret = mid;
				start = mid+1;
			}
		}
		return ret;
	}
	public static void main(String[]args){
		System.out.println("Square Root : "+findSqrt(20));
	}
}
