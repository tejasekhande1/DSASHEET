class Solution{
	public static void main(String[]args){
		int n = 10;
		int i = 1;
		if((n & (1 << i)) == 0){
			System.out.println("0");
		}else{
			System.out.println("1");
		}
	}
}
