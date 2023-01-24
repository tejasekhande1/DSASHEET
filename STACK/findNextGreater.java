import java.util.*;
class Solution{
	public void findNextGreater(int arr[]){
		Stack <Integer> st = new Stack<>();
		int next = -1;
		for(int i=0 ; i<arr.length ; i++){
			st.push(arr[i]);
			for(int j=i+1 ; j<arr.length ; j++){
				if(st.peek() < arr[j]){
					next = arr[j];
					st.pop();
					break;
				}
			}

			if(next == -1){
				System.out.println(arr[i] + " ----> " + next);
			}else{
				System.out.println(arr[i] + " ----> " + next);
				next = -1;
			}
		}
	}

	public static void main(String[]args){
		Solution s = new Solution();
		Scanner sc = new Scanner(System.in);
		int arr[] = {11,13,21,3};
		s.findNextGreater(arr);
	}
}
