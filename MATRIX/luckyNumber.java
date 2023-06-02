import java.util.*;
class Solution{

	public boolean searchColumn(int arr[][],int row,int col){
		int num = arr[row][col];
		int temp = num;
		for(int i=0 ; i<arr.length ; i++){
			if(temp < arr[i][col]){
				return false;
			}
		}

		return true;
	}

	public List<Integer> luckyNum(int arr[][]){
		
		List<Integer> ret = new ArrayList<>();	
		for(int i=0 ; i<arr.length ; i++){
			for(int j=0 ; j<arr[i].length ; j++){
				if(arr[i][j] == Arrays.stream(arr[i]).min().getAsInt()){
					if(searchColumn(arr,i,j)){
						ret.add(arr[i][j]);
					}
					break;
				}
			}	
		}

		return ret;
	}
	public static void main(String[] args){
		Solution s = new Solution();
		int mat[][] = {{7,8},{1,2}};
		List<Integer> ret = s.luckyNum(mat);
		System.out.println(ret);
	}
}
