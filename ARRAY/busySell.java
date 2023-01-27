import java.util.*;
class Solution{
	public int buySell(int prize[]){
		int buy = prize[0];
		int maxProfit = 0;
		for(int i=1 ; i<prize.length ; i++){
			if(buy > prize[i]){
				buy = prize[i];
			}else if(prize[i] - buy > maxProfit){
				maxProfit = prize[i] - buy;
			}
		}
		return maxProfit;
	}
	public static void main(String[]args){
		Solution s = new Solution();
		int prize[] = {7, 1, 5, 3, 6, 4};
		System.out.println("Max Profit : "+s.buySell(prize));
	}
}
