import java.io.*;
class Solution{

	public int countBits(int n){
		int cnt = 0;
		while(n != 0 && n>0){
			if((n & 1) == 1){
				cnt++;
			}
			n = n >> 1;
		}
		return cnt;
	}

	public static void main(String[]args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Number : ");
		int n = Integer.parseInt(br.readLine());
		Solution s = new Solution();
		int ret = s.countBits(n);
		System.out.println("Count of Set Bits : "+ret);
	}
}
