import java.util.*;
class Solution{
	public char findDifferent(String s,String t){
		int a = 0;
		int b = 0;
		for(int i=0 ; i<s.length() ; i++){
			a = a + s.charAt(i);
		}
		
		for(int i=0 ; i<t.length() ; i++){
			b = b + t.charAt(i);
		}

		return (char)(b-a);
	}

	public char mySolution(String s,String t){
		int ans = 0;
		for(int i=0 ; i<s.length() ; i++){
			ans = ans ^ s.charAt(i);
		}
		
		for(int i=0 ; i<t.length() ; i++){
			ans = ans ^ t.charAt(i);
		}

		return (char)ans;
	}

	public char bruteForce(String s,String t){
		for(int i=0 ; i<t.length() ; i++){
			int flag = 0;
			for(int j=0 ; j<s.length() ; j++){
				if(s.charAt(j) == t.charAt(i)){
					flag = 1;
					break;
				}
			}
			if(flag == 0) return t.charAt(i);
		}

		return 'a';
	}

	public char hashTable(String s,String t){
		HashSet<Character> hs = new HashSet<>();
		for(int i=0 ; i<s.length() ; i++){
			hs.add(s.charAt(i));
		}
		
		for(int i=0 ; i<t.length() ; i++){
			if(!hs.contains(t.charAt(i))){
				return t.charAt(i);
			}
		}

		return 'a';
	}
	public char sort(String s,String t){
		char a1[] = s.toCharArray();
		char a2[] = s.toCharArray();
		Arrays.sort(a1);
		Arrays.sort(a2);
		int n = 0;
		while(n < s.length()){
			if(s.charAt(n) != t.charAt(n)){
				return t.charAt(n);
			}
			n++;
		}		
		return t.charAt(n);
	}

	public static void main(String[]args){
		Solution s1 = new Solution();
		String s = "";
		String t = "y";
		System.out.println("Different Character : "+s1.findDifferent(s,t));
		System.out.println("Different Character : "+s1.mySolution(s,t));
		System.out.println("Different Character : "+s1.bruteForce(s,t));
		System.out.println("Different Character : "+s1.sort(s,t));
		System.out.println("Different Character : "+s1.hashTable(s,t));
	}
}
