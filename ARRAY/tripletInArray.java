class Solution{
	public boolean Triplets(int arr[],int key){
		for(int i=0 ; i<arr.length ; i++){
			for(int j=i+1 ; j<arr.length ; j++){
				for(int k=i+1 ; k<arr.length ; k++){
					int ans = arr[i]+arr[j]+arr[k];
					if(ans == key){
						return true;
					}
				}
			}
		}
		return false;
	}
	public static void main(String[]args){
		Solution s = new Solution();
		int arr[] = {0,2,2,2,1};
		System.out.println("Triplets Count : "+s.Triplets(arr,0));
	}
}
