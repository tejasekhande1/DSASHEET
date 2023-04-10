class Solution{
	int p1 = 0;
	int p2 = 0;
	int cnt = 0;
	public boolean retWinner(int arr[],int i,int j){
		if(i > j){
			if(p1 >= p2) return true;
			else return false;
		}

		if(cnt % 2 == 0){
			if(arr[i] >= arr[j]){
				p1 = p1 + arr[i];
				i++;
			}else{	
				p1 = p1+arr[j];
				j--;
			}
		}else{
			if(arr[i] >= arr[j]){
				p2 = p2 + arr[i];
				i++;
			}else{	
				p2 = p2+arr[j];
				j--;
			}
		}

		cnt++;
		return retWinner(arr,i,j);

	}

	public static void main(String[]args){
		Solution s = new Solution();
		int arr[] = {1,5,233,7};
		System.out.println("Result : "+s.retWinner(arr,0,arr.length-1));
	}
}
