import java.util.*;
class Solution{
	ArrayList<Integer> res = new ArrayList<>();
	int k = 0;
	public int eleGame(int n){
		
		if(res.size() == 1) return res.get(0);
		
		ArrayList<Integer> temp = new ArrayList<>();	

		if(k == 0){		
			for(int i=1 ; i<=n ; i++){
				res.add(i);
			}
		}
		
		if(k % 2 == 1){
			for(int i=1 ; i<res.size() ; i=i+2){
				temp.add(res.get(i));
			}
		}

		if(k % 2 == 0 && k != 0){
			for(int i=res.size()-2 ; i >= 0 ;i=i-2){
				temp.add(res.get(i));
			}
			Collections.sort(temp);
		}
		

		if(k != 0){
			res.clear();
			res.addAll(temp);
		}

		temp.clear();
		
			
		System.out.println("K : "+k);

		for(int i=0 ; i<res.size() ; i++){
			System.out.print("|"+res.get(i)+"|");
		}

		System.out.println("-----------------------------------------------------");

		k++;
		return eleGame(n/2);
	}

	public int babbarSol(int n){
		if( n == 1) return n;
		return 2*(1+(n/2) - babbarSol(n/2));
	}

	public static void main(String[]args){
		Solution s = new Solution();
		int n = 9;
		int ret = s.eleGame(n);
	//	int ret = s.babbarSol(n);
		System.out.println(ret);
	}
}
