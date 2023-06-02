import java.util.*;
class Solution{
	public void subSequence(String[] words){
		ArrayList<String> list = new ArrayList<>();
		for(int i=0 ; i<words.length ; i++){
			for(int j=0 ; j<words.length ; j++){
				if(i != j && words[i].contains(words[j])){
					list.add(words[j]);
				}
			}
		}

		System.out.println(list);
	}
	public static void main(String[] args){
		Solution s = new Solution();
		String[] words = {"mass","as","hero","superhero"};
		s.subSequence(words);
	}
}
