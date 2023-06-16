// MAXIMUM SUBARRAY PRODUCT

class Solution {
    public int maxProduct(int[] nums) {

        if(nums.length == 1) return nums[0];
        if(nums.length == 2 && nums[0] == 0) return nums[1];

        int maxProd = Integer.MIN_VALUE;
        int currProd = 1;
        for(int i=0 ; i<nums.length ; i++){
            currProd = currProd * nums[i];

            if(currProd > maxProd){
                maxProd = currProd;
            }

            if(currProd == 0){
                currProd = 1;
            }
        }

        currProd = 1;

        for(int i=nums.length-1 ; i>=0 ; i--){
            currProd = currProd * nums[i];

            if(currProd > maxProd){
                maxProd = currProd;
            }

            if(currProd == 0){
                currProd = 1;
            }
        }

        return maxProd;
    }

    public static void main(String[] args){
	Solution s = new Solution();
	int arr[] = {-3,-1,-1};
	System.out.println(s.maxProduct(arr));
    }
}
