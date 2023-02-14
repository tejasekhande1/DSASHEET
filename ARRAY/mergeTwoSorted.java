import java.util.Scanner;
class Solution{
	public void mergeArray(int arr1[],int n,int arr2[],int m,int res[]){
		int i = 0 , j=0 , k=0;
		while(i<n && j<m){
			if(arr1[i] < arr2[j]){
				res[k] = arr1[i];
				i++;
			}else{
				res[k] = arr2[j];
				j++;
			}

			k++;
		}

		while(i<n){
			res[k] = arr1[i];
			i++;
			k++;
		}

		while(j<m){
			res[k] = arr2[j];
			j++;
			k++;
		}
	}
	public static void main(String[]args){
		Solution s = new Solution();
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter Size of 1st Array : ");
		int n = sc.nextInt();
		int arr1[] = new int[n];
		System.out.println("Enter Elements in 1st Array : ");
		for(int i=0 ; i<n ; i++){
			arr1[i] = sc.nextInt();
		}
		
		System.out.print("Enter Size of 2nd Array : ");
		int m = sc.nextInt();
		int arr2[] = new int[m];
		System.out.println("Enter Elements in 2nd Array : ");
		for(int i=0 ; i<m ; i++){
			arr2[i] = sc.nextInt();
		}

		int res[] = new int[m+n];
		s.mergeArray(arr1,n,arr2,m,res);

		for(int i=0 ; i<m+n ; i++){
			System.out.print("|"+res[i]+"|");
		}
		System.out.println();
	}
}
