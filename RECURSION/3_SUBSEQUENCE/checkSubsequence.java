class Solution{
	int i = 0,j=0;
	int cnt = 0;
	public boolean checkSubsequence(String s,String t){
		if(cnt == s.length()){
			return true;
		}

		if(i >= s.length() || j>=t.length()){
			return false;
		}

		if(s.charAt(i) == t.charAt(j)){
			i++;
			j++;
		 	cnt++;	
			return checkSubsequence(s,t);
		}else{
			j++;
			return checkSubsequence(s,t);
		}
	}
	public static void main(String[]args){
		Solution s1 = new Solution();
		String s = "abcd";
		String t = "ahbgdc";
		System.out.println(s1.checkSubsequence(s,t));
	}
}
