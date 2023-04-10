class Solution{
	public static void main(String[]args){
		for(int ch='A' ; ch<='Z' ; ch = ch+1){
			System.out.println((char)ch + " : " + (char)(ch | ' '));
		}
	}
}
