class Solution {

    	public int strStr(String haystack, String needle) {
        	int ret = -1;
		int idx = 0;
		for(int i=0 ; i<haystack.length() ; i++){

			if(idx >= needle.length()){
				return ret;
			}

			if(haystack.charAt(i) == needle.charAt(0)){
				ret = i;
				idx++;
			}else if(haystack.charAt(i) == needle.charAt(idx)){
				idx++;
			}else{
				ret = -1;
				idx = 0;
			}
		}

		if(idx >= needle.length()){
			return ret;
		}else{
			return -1;
		}
    	}
    
	public static void main(String[] args){
		Solution s = new Solution();
		String haystack = "leetcode";
		String needle = "leeto";
		System.out.println(s.strStr(haystack,needle));
    	}
}
