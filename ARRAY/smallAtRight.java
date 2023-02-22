import java.util.*;
class Solution{

	public List<Integer> smallElements(int arr[],int n){
		ArrayList <Integer> list = new ArrayList<Integer>();
		if(n == 1){
			list.add(0);
			return list;
		}
		for(int i=0 ; i<n-1 ; i++){
			int cnt = 0;
			for(int j=i+1 ; j<n ; j++){
				if(arr[i] > arr[j]){
					cnt++;
				}
			}
			list.add(cnt);
		}

		list.add(0);

		for(int i=0 ; i<list.size() ; i++){
			System.out.println(list.get(i));
		}	
		return list;
	}

	public int[] smallAtRight(int arr[],int n){
		if(n == 1){
			arr[0] = 0;
			return arr;
		}
		for(int i=0 ; i<n-1 ; i++){
			int cnt = 0;
			for(int j=i+1 ; j<n ; j++){
				if(arr[i] > arr[j]){
					cnt++;
				}
			}
			arr[i] = cnt;
		}
		arr[n-1] = 0; 
		return arr;
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
		s.smallAtRight(arr,n);
		for(int i=0 ; i<n ; i++){
			System.out.print("|"+arr[i]+"|");
		}
		System.out.println("");
	}
}
