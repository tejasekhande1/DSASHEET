class Solution{

	public int clearBit(int n,int i){
		return n ^ (1 << i);
	}

	public int setBit(int n,int i){
		return n | (1 << i);
	}

	public int updateBit(int n,int i,int newBit){
	/*	if(newBit == 0){
			return clearBit(n,i);
		}else{
			return setBit(n,i);
		}
	*/

		n = clearBit(n,i);
		int bitMask = newBit << i;
		return n | bitMask;
	}

	public static void main(String[]args){
		Solution s = new Solution();
		int n = 10;
		int i = 1;
		int newBit = 0;
		int ret = s.updateBit(n,i,newBit);
		System.out.println(ret);
	}
}
