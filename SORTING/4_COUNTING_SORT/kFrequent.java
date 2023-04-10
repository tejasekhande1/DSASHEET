import java.io.*;
import java.util.*;
class Solution{
	public void kFrequent(String[] s,int n,int k){
		HashMap<String,Integer> hm = new HashMap<>();
		for(int i=0 ; i<n ; i++){
			hm.put(s[i],hm.getOrDefault(s[i],0)+1);
		}

		ArrayList<String> ret = new ArrayList<>();
		for(Map.Entry m : hm.entrySet()){
			int t = (int)m.getValue();
			if(t == k){
				String ch = (String)m.getKey();
				ret.add(ch);
			}
		}

		System.out.println(ret);
	}
	public static void main(String[]args) throws IOException{
		Solution s1 = new Solution();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Size of an Array : ");
		int n = Integer.parseInt(br.readLine());
		String[] s = new String[n];
		System.out.println("Enter Strings : ");
		for(int i=0 ; i<n ; i++){
			s[i] = br.readLine();
		}
		
		int k = 2;
		s1.kFrequent(s,n,k);
	}
}
