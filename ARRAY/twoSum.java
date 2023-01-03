import java.util.*;
class Solution{
	public static HashSet<Integer> twoSum(int nums[],int t){
		HashSet <Integer> hs = new HashSet<>();
		for(int i=0 ; i<nums.length ; i++){
			int x = t-nums[i];
			for(int j=i+1 ; j<nums.length ; j++){
				if(x == nums[j]){
					hs.add(i);
					hs.add(j);
					return hs;
				}
			}
		}
		return hs;

	}
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Size of Array : ");
		int n = sc.nextInt();
		int nums[] = new int[n];
		for(int i=0 ; i<n ; i++){
			nums[i] = sc.nextInt();
		}
		
		System.out.println("Enter Target : ");
		int t = sc.nextInt();
		System.out.println(twoSum(nums,t));
	}
}
