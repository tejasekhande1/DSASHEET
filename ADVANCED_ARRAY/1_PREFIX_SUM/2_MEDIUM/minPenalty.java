class Solution{
	public int minPenalty(String str){
		int n = str.length();
		int prefixY[] = new int[n];
		int prefixN[] = new int[n];

		if(str.charAt(n-1) == 'Y'){
			prefixY[n-1] = 1;
		}else{
			prefixY[n-1] = 0;
		}

		for(int i=n-2 ; i>=0 ; i--){
			if(str.charAt(i) == 'Y'){
				prefixY[i] = 1;
			}else{
				prefixY[i] = 0;
			}
			
			prefixY[i] = prefixY[i]+prefixY[i+1];
		}
		
		for(int i=0 ; i<n ; i++){
			System.out.print("|"+prefixY[i]+"|");
		}
		System.out.println();

		if(str.charAt(0) == 'N'){
			prefixN[0] = 1;
		}else{
			prefixN[0] = 0;
		}

		for(int i=1 ; i<n ; i++){
			if(str.charAt(i) == 'N'){
				prefixN[i] = 1;
			}else{
				prefixN[i] = 0;
			}

			prefixN[i] = prefixN[i]+prefixN[i-1];
		}

		for(int i=0 ; i<n ; i++){
			System.out.print("|"+prefixN[i]+"|");
		}
		System.out.println();

		int retArr[] = new int[n+1];
		retArr[0] = prefixY[0];
		int min = 0;
		for(int i=1 ; i<=n ; i++){
			if(str.charAt(i-1) == 'Y'){
				retArr[i] = prefixY[i-1]+prefixN[i-1]-1;
			}else{
				retArr[i] = prefixY[i-1]+prefixN[i-1];
			}

			if(retArr[i] < retArr[min]){
				min = i;
			}
		}
		
		for(int i=0 ; i<=n ; i++){
			System.out.print("|"+retArr[i]+"|");
		}
		System.out.println();

		return min;
	}
	public static void main(String[]args){
		Solution s = new Solution();
		String str = "YYYY";
		System.out.println(s.minPenalty(str));
	}
}
