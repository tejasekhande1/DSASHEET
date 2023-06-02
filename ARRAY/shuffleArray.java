class Solution{
	public int[] shuffleArray(int nums[],int n){
		int ret[] = new int[2*n];
		int idx = -1;
		for(int i=0 ; i<n ; i++){
			ret[++idx] = nums[i];
			ret[++idx] = nums[i+n];
		}

		return ret;
	}
	public static void main(String[]args){
		Solution s = new Solution();
		int arr[] = {1,1,2,2};
		int n = 2;
		
		for(int i=0 ; i<2*n ; i++){
			System.out.print(" "+arr[i]+" ");
		}

		System.out.println();
		
		int ret[] = s.shuffleArray(arr,n);
	
		for(int i=0 ; i<ret.length ; i++){
			System.out.print(" "+ret[i]+" ");
		}

		System.out.println();
	}
}
