import java.util.*;
class Solution{
	public static void main(String[] args){
		LinkedHashMap<String,Integer> hm = new LinkedHashMap<>();
		hm.put("India",100);
		hm.put("Austrailia",70);
		hm.put("US",90);
		System.out.println(hm);

		Set<String> s = hm.keySet();
		for(String str : s){
			System.out.println("Key : "+str+"-> Value : "+hm.get(str));
		}

		for(Map.Entry<String,Integer> m : hm.entrySet()){
			System.out.println("Key : "+m.getKey()+" == Value : "+m.getValue());
		}

//		System.out.println(hm.get("India"));

//		System.out.println(hm.containsKey("IndiaA"));
		
//		hm.remove("IndiaA");
	}
}
