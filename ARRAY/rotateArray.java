import java.util.Scanner;
class Solution{
	public void rotateArray(int arr[],int k){
		int newArr[] = new int[k % arr.length];
		int t = 0;
		for(int i=arr.length-(k%arr.length) ; i<arr.length ; i++){
			newArr[t++] = arr[i];
		}

		for(int i=arr.length-(k%arr.length)-1 ; i>=0 ; i--){
			arr[i+(k%arr.length)] = arr[i];
		}
		
		for(int i=0 ; i<newArr.length ; i++){
			arr[i] = newArr[i];
		}
	}
	public static void main(String[]args){
		Solution s = new Solution();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Size of an Array : ");
		int n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter Elements in an Array : ");
		for(int i=0 ; i<n ; i++){
			arr[i] = sc.nextInt();
		}
		s.rotateArray(arr,2);
		for(int i=0 ; i<n ; i++){
			System.out.print("|"+arr[i]+"|");
		}
		System.out.println();
	}
}
