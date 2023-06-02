import java.util.*;
class Solution{
	public boolean isAnagram(String s1,String s2){
		if(s1.length() != s2.length()) return false;

		HashMap<Character,Integer> hm = new HashMap<>();
		for(int i=0 ; i<s1.length() ; i++){
			hm.put(s1.charAt(i),hm.getOrDefault(s1.charAt(i),0)+1);
		}

		for(int j=0 ; j<s2.length() ; j++){
			if(hm.get(s2.charAt(j)) != null){
				if(hm.get(s2.charAt(j)) <= 0 ){
				       	return false;			
				}else{
					hm.put(s2.charAt(j),hm.get(s2.charAt(j))-1);
				}
			}else{
				return false;
			}
		}

		return true;
	}
	public static void main(String[] args){
		Solution s = new Solution();
		String s1 = "rece";
		String s2 = "care";
		System.out.println(s.isAnagram(s1,s2));
	}
}
