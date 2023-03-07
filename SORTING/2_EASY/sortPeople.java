
// HASHMAP CANNOT CONTAINS A DUPLICATE KEYS
// TreeMap sorted data according to key at the time of insertion

import java.util.*;
class Solution{
	public String[] sortPeople(String[] str,int[] h){
		TreeMap<Integer,String> tm = new TreeMap<>();
		for(int i=0 ; i<str.length ; i++){
			tm.put(h[i],str[i]);
		}

		int k = tm.size()-1;
		for(Map.Entry<Integer,String> e : tm.entrySet()){
			h[k] = e.getKey();
			str[k] = e.getValue();
			k--;
		}
		
		for(int i=0 ; i<str.length ; i++){
			System.out.print("|"+str[i]+"|");
		}
		return str;
	}
	public static void main(String[]args){
		Solution s = new Solution();
		String[] names = {"Alice","Bob","Bob"};
		int[] height = {155,185,150};
		s.sortPeople(names,height);
	}
}
