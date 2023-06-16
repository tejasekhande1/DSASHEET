class Solution{
	public boolean jumpGame(int arr[]){
		int k = 0;
		for(int i=0 ; i<arr.length ; i = i+k){
			
			if(i == 0){
				k = 1;
			}else{
				k = i+arr[i];
			}

			if(k == arr.length-1){
				return true;
			}

			if(k > arr.length){
				return false;
			}
		}

		return false;
	}
	public static void main(String[] args){
		Solution s = new Solution();
		int arr[] = {1,2};
		System.out.println(s.jumpGame(arr));
	}
}
