class Solution{
	public int lenOfLast(String str){
		String arr[] = str.split(" ");
		return arr[arr.length-1].length();
	}
	public static void main(String[] args){
		Solution s = new Solution();
		String str = "   fly me   to   the moon  ";
		System.out.println("Length of Last Word : "+s.lenOfLast(str));
	}
}
