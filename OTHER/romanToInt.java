import java.util.*;
class Solution{
	static Map<Character,Integer> m = new HashMap<Character,Integer>();
	public int romanToInt(String s){
		int sum = 0;
		for(int i=0 ; i<s.length() ; i++){
			int val = m.get(s.charAt(i));
			if(i != s.length()-1 && val < m.get(s.charAt(i+1))){
				sum = sum - val;
			}else{
				sum = sum + val;
			}
		}
		return sum;
	}
	public static void main(String[]args){
		Solution s = new Solution();
		Scanner sc = new Scanner(System.in);
		System.out.println("==========================================");
		m.put('I',1);
		m.put('V',5);
		m.put('X',10);
		m.put('L',50);
		m.put('C',100);
		m.put('D',500);
		m.put('M',1000);
		for(Map.Entry<Character,Integer> me : m.entrySet()){
			System.out.println(me.getKey()+" : "+me.getValue());
		}
		System.out.println("==========================================");
		System.out.print("Enter Valid String : ");
		String str = sc.nextLine();
		System.out.println("Entered String : "+str);
		int ret = s.romanToInt(str);
		System.out.println("Integer Value : "+ret);
	}
}
