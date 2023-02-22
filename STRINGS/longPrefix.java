class Solution{
	public String longPrefix(String[] str){
		String temp = str[0];
		String ret = "";
		int t = 0;
		while(t < temp.length()){
			for(int i=1 ; i<str.length; i++){
				if(t >= str[i].length() || str[0].charAt(t) != str[i].charAt(t)){
					return ret;
				}
			}
			ret = ret + str[0].charAt(t);
			t++;
		}
		return ret;
	}
	public static void main(String[]args){
		Solution s = new Solution();
		String[] str = {"ab", "a"};
		System.out.println("Longest Prefix : "+s.longPrefix(str));
	}
}
