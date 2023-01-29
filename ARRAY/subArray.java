class Solution{
	public int subArray(char arr[]){
		int maxHol = 0;
		int curData = 0;
		for(int i=0 ; i<arr.length ; i++){
			if(arr[i] == 'h'){
				curData++;
			}else{
				if(curData > maxHol){
					maxHol = curData;
				}
				curData = 0;
			}
		}
	
		if(curData > maxHol){
			maxHol = curData;
		}
	
		return maxHol;
	}
	public static void main(String[]args){
		Solution s = new Solution();
		char[] arr = {'h','w','h','w','h','h'};
		int ret = s.subArray(arr);
		System.out.println("Maximum SubArray of Holiday : "+ret);
	}
}
