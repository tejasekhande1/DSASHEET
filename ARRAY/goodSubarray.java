class Solution{
	public int goodArray(int arr[],int a ,int n){
		int cnt = 0;
		for(int i=0 ; i<n ; i++){
			int sum = 0;
			for(int j=i ; j<n ; j++){
				sum = sum + arr[j];
				int n2 = j-i+1;
				if(n2%2 == 1){
					if(sum > a){
						cnt++;
					}
				}else{
					if(sum < a){
						cnt++;
					}
				}
			}
		}
		return cnt;
	}
	public static void main(String[]args){
		Solution s = new Solution();
		int arr[] = {1,2,3,4,5};
		int k = 4;
		int n = 5;
		System.out.println("Count : "+s.goodArray(arr,k,n));
	}
}
