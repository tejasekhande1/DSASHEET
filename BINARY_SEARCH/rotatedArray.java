class Solution{
	public boolean searchElement(int nums[],int t){
		int pivot = 0;
		for(int i=0 ; i<=nums.length-2 ; i++){
			if(nums[i+1] < nums[i]){
				pivot = i+1;
				break;
			}
		}

		int s1 = 0;
		int e1 = pivot-1;
		int s2 = pivot;
		int e2 = nums.length-1;

		System.out.println(pivot + " " +e1);

		if(t == nums[pivot]) return true;

		if(nums[s1] == nums[e2]){
			if(nums[s1] < t){
				while(s1 <= e1){

					int mid = (s1+e1)/2;
	
					if(nums[mid] == t) return true;
					
					if(nums[mid] > t){
						e1 = mid-1;
					}
					
					if(nums[mid] < t){
						s1 = mid+1;
					}
				}
			}else{
				while(s2 <= e2){
					int mid = (s2+e2)/2;
	
					if(nums[mid] == t) return true;
					
					if(nums[mid] > t){
						e2 = mid-1;
					}else{
						s2 = mid+1;
					}
				}

			}
		}

		return false;
	}
	public static void main(String[] args){
		Solution s = new Solution();
		int nums[] = {1,1,1,1,3,1};
		int target = 3;
		System.out.println(s.searchElement(nums,target));
	}
}
