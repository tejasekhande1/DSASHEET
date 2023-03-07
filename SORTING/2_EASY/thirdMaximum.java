import java.util.*;
class Solution {
    public int thirdMax(int[] arr) {
        Arrays.sort(arr);
        int n = arr.length;

        if(n<3) return arr[n-1];

        int cnt = 1;
        int ele = arr[n-1];
        for(int i=n-2 ; i>=0 ; i--){
            if(ele != arr[i]){
                ele = arr[i];
                cnt++;
            }

            if(cnt == 3) return ele;
        }

        if(cnt < 3) return arr[n-1];

        return 0;
    }
    
    public static void main(String[]args){
    	Solution s = new Solution();
    	int arr[] = {2,1,3,2};
    	System.out.println(s.thirdMax(arr));
    }
}
