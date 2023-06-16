class Solution{
	public int checkLength(int arr[],int target){
		for(int i=1 ; i<arr.length ; i++){
			arr[i] = arr[i-1] + arr[i];
		}

		for(int i=0 ; i<arr.length ; i++){
			System.out.print(" "+arr[i]+" ");
		}
		
		System.out.println();

		if(arr[arr.length-1] < target){
			return 0;
		}else{
			for(int i=0 ; i<arr.length ; i++){
				if(i == 0){
					if(arr[i+1]-arr[i] == target)
						return 1;
				}else if(i == arr.length-1){
					if(arr[i]-arr[i-1] == target)
						return 1;
				}else{
					if(arr[i+1]-arr[i-1] == target)
						return 2;
				}
			}
			return 0;
		}
	}

	public int minSubArrayLen(int target,int[] nums){
        	int l = 0;
        	int sum = 0;
        	int min = Integer.MAX_VALUE;
        	for(int i=0;i<nums.length;i++){
          		sum += nums[i];

          		while(sum>=target){
            			min = Math.min(min, i-l+1);
            			sum = sum-nums[l];
           		 	l++;
          		}
        	}
		return min == Integer.MAX_VALUE?0:min;
    	}

	public static void main(String[] args){
		Solution s = new Solution();
		int arr[] = {2,3,1,2,4,3};
		int target = 7;
//		System.out.println(s.checkLength(arr,target));
		System.out.println(s.minSubArrayLen(target,arr));
	}
}
