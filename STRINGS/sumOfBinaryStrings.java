import java.util.*;
class Solution{

	public String addBinary(String a, String b) {
       		 StringBuilder res = new StringBuilder();
        	 int i = a.length() - 1;
         	 int j = b.length() - 1;
          	 int carry = 0;
        	 while(i >= 0 || j >= 0){
            		int sum = carry;
            		if(i >= 0) sum += a.charAt(i--) - '0';
            		if(j >= 0) sum += b.charAt(j--) - '0';
            		
			carry = sum > 1 ? 1 : 0;
            		res.append(sum % 2);
        	}

        	if(carry != 0) res.append(carry);

        return res.reverse().toString();
    	}
	public String toBinary(int n){
		StringBuilder ret = new StringBuilder();
		while(n>0){
			int last = n%2;
			ret.append(last);
			n = n/2;
		}

		ret = ret.reverse();
		String s = ret.toString();
		return s;
	}
	public int toDecimal(String str){
		int n = str.length()-1;
		int ret = 0;
		int cnt=1;
		while(n>=0){
			int val = Character.getNumericValue(str.charAt(n));
			ret = ret + val*cnt;
			cnt = cnt*2;
			n--;	
		}
		return ret;
	}
	public String sumOfBinary(String s1,String s2){
		int n1 = toDecimal(s1);
		int n2 = toDecimal(s2);
		System.out.println(n1+" | "+n2);
		String ret;
		if(n1 == 0 && n2 == 0){
			return "0";
		}else{
			ret = toBinary(n1+n2);
		}
		return ret;
	}
	public static void main(String[]args){
		Solution s = new Solution();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter First String : ");
		String s1 = sc.nextLine();
		System.out.print("Enter Second String : ");
		String s2 = sc.nextLine();
		System.out.println("Sum of Two Strings : "+s.sumOfBinary(s1,s2));
	}
}
