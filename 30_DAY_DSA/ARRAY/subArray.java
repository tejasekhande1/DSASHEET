// COUNT OF SUBARRAY PRODUCT LESS THAN K

class Solution{
	public int findCount(int nums[],int k){
		int cnt = 0;
		for(int i=0 ; i<nums.length ;i++){
			int currProd = nums[i];
			if(currProd < k){
				cnt++;
			}else{
				break;
			}
			for(int j=i+1 ; j<nums.length ; j++){
				currProd = currProd * nums[j];
				if(currProd < k){
					cnt++;
				}else{
					break;
				}
			}
		}
		return cnt;
	}
	public static void main(String[] args){
		Solution s = new Solution();
		int arr[] = {10,5,2,6};
		int k =100;
		System.out.println(s.findCount(arr,k));
	}
}
