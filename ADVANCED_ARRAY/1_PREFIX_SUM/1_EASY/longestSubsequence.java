import java.util.*;
class Solution{
	public int[] subSequence(int arr[],int qry[]){
		int n = arr.length;
		int q = qry.length;
		int ans[] = new int[q];
		int k = 0;

		Arrays.sort(arr);
		for(int i=1 ; i<n ; i++){
			arr[i] = arr[i-1] + arr[i];
		}

		for(int i=0 ; i<q ; i++){

			if(qry[i] < arr[0]) ans[k++] = 0;
		
			else if(qry[i] > arr[n-1]) ans[k++] = n;
		
			else{
				int cnt = 0;
				for(int j=0 ; j<n ; j++){
					if(arr[j] > qry[i]) break;
					if(arr[j] <= qry[i]){
						cnt++;
					}
				}
				ans[k++] = cnt;
			}
		}

		for(int i=0 ; i<q ; i++){
			System.out.print("|"+ans[i]+"|\n");
		}

		return ans;
	}
	public static void main(String[]args){
		Solution s = new Solution();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Size of Array : ");
		
		int n = sc.nextInt();
		System.out.println("Enter Elements in Array : ");
		int arr[] = new int[n];
		for(int i=0 ; i<n ; i++){
			arr[i] = sc.nextInt();
		}
		
		System.out.println("Enter No of Queries : ");
		int q = sc.nextInt();
		System.out.println("Enter Queries : ");
		int qry[] = new int[q];
		for(int i=0 ; i<q ; i++){
			qry[i] = sc.nextInt();
		}

		s.subSequence(arr,qry);
	}
}
