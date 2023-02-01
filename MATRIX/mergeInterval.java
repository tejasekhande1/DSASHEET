import java.util.*;
class Solution{
	public static int[][] mergeInterval(int arr[][]){
		Arrays.sort(arr,(a,b)->Integer.compare(a[0],b[0]));
		Stack <int []> s = new Stack<>();
		s.push(arr[0]);
		for(int i=1 ; i<arr.length ; i++){
			int start2 = arr[i][0];
			int end2 = arr[i][1];

			int popArray[] = s.pop();

			int start1 = popArray[0];
			int end1 = popArray[1];

			if(end1 >= start2){
				int merge[] = new int[]{start1,Math.max(end2,end1)};
				s.push(merge);
			}else{
				s.push(popArray);
				s.push(arr[i]);
			}
		}
		
		int output [][] = new int[s.size()][2];
		for(int i = output.length-1 ; i>=0 ; i--){
			int popArray[] = s.pop();
			output[i][0] = popArray[0];
			output[i][1] = popArray[1];
		}

		return output;
	}
	public static void main(String[]args){
		int arr[][] = {{1,3},{2,6},{8,10},{15,18}};
		int ret[][] = mergeInterval(arr);
		for(int i=0 ; i<ret.length ; i++){
			System.out.print(ret[i][0]+"\t");
			System.out.print(ret[i][1]+"\n");
		}
	}
}
