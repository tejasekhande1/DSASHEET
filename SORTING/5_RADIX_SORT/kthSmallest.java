import java.util.*;
class Solution{
	static int ret[];
	int n=0;
	public void countSort(int arr[],int k,int pos){
		int cntArr[] = new int[10];
		Arrays.fill(cntArr,0);
		for(int i=0 ; i<arr.length ; i++){
			cntArr[(arr[i]/pos)%10]++;
		}

		for(int i=1 ; i<10 ; i++){
			cntArr[i] = cntArr[i]+cntArr[i-1];
		}
		
		int output[] = new int[arr.length];
		for(int i=arr.length-1 ; i>=0 ; i--){
			output[cntArr[(arr[i]/pos)%10]-1] = arr[i];
			cntArr[(arr[i]/pos)%10]--;
		}

		int val = output[k-1];
		for(int i=0 ; i<arr.length ; i++){
			if(val == arr[i]){
				ret[n++] = i;
				break;
			}
		}
	}

	public void kthSmallest(String[] nums,int[][] q){
		
		int[] arr = Arrays.stream(nums).mapToInt(Integer::parseInt).toArray();
		ret = new int[q.length];		
		int pos;

		for(int i=0 ; i<q.length ; i++){
			if(q[i][1] == 1){
				pos = 1;
			}else{
				pos = (int)Math.pow(10,q[i][1]-1);
			}
			System.out.println("Position : "+pos);
			countSort(arr,q[i][0],pos);
		}
	}
	public static void main(String[]args){
		Solution s = new Solution();
		String[] nums = {"24","37","96","04"};
		int query[][] = {{2,1},{2,2}};
		s.kthSmallest(nums,query);
		for(int i=0 ; i<ret.length ; i++){
			System.out.println(ret[i]);
		}
	}
}
