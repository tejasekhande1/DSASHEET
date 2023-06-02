// ITERATOR IS A INTERFACE

import java.util.*;
class Solution{
	
	public static void main(String[] args){
		HashSet<Integer> set = new HashSet<>();
		set.add(1);
		set.add(3);
		set.add(1);
		set.add(2);
		set.add(4);

		Iterator itr = set.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
	
		for(Integer n : set){
			System.out.println(n);
		}
	}
}
