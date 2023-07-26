/** 
 * Forward declaration of guess API.
 * @param  num   your guess
 * @return 	     -1 if num is higher than the picked number
 *			      1 if num is lower than the picked number
 *               otherwise return 0
 * int guess(int num);
 */

public class Solution extends GuessGame {
    public int guessNumber(int n) {
        int s = 1;
        int e = n;
        int pick = 0;
        while(s <= e){
            int mid = s+(e-s)/2;
            pick = guess(mid);
            if(pick == 0){
                pick = mid;
                break;
            }else if(pick == -1){
                e = mid-1;
            }else{
                s = mid+1;
            }
        }
        return pick;
    }

    public static void main(String[] args){
	Solution s = new Solution();
	System.out.println(s.guessNumber(10));
    }
}
