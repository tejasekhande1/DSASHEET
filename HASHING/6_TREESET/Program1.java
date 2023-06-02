// ITERATOR IS A INTERFACE

import java.util.*;
class Solution{
	
	public static void main(String[] args){
		TreeSet<Integer> set = new TreeSet<>();
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
