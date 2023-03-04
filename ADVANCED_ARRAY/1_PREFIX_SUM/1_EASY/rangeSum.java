class NumArray{
    int[] arr;
    public NumArray(int[] nums) {
        arr = new int[nums.length];
        arr[0] = nums[0];
        for(int i=1 ; i<nums.length ; i++){
            arr[i] = arr[i-1] + nums[i];
        }
    }
    
    public int sumRange(int left, int right) {
        if(left == 0){
            return arr[right];
        }else{
            return arr[right]-arr[left-1];
        }
    }
    
    public static void main(String[]args){
    	int [] nums = {-2, 0, 3, -5, 2, -1};
    	NumArray obj = new NumArray(nums);
    	int param_1 = obj.sumRange(0,2);
    	int param_2 = obj.sumRange(2,5);
    	int param_3 = obj.sumRange(0,5);
    	System.out.println(param_1+" "+param_2+" "+param_3+" ");
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */
