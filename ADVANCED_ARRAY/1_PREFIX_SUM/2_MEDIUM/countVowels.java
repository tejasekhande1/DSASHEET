import java.util.*;
class Solution{
	public int[] countVowels(String[] str,int [][]range){
		HashSet <Character> hs = new HashSet<>();
		hs.add('a');
		hs.add('e');
		hs.add('i');
		hs.add('o');
		hs.add('u');
		int n = str.length;
		int newArr[] = new int[n];

		for(int i=0 ; i<n ; i++){
			String s = str[i];
			int l = s.length();
			if(hs.contains(s.charAt(0)) && hs.contains(s.charAt(l-1))){
				newArr[i] = 1;
			}else{
				newArr[i] = 0;
			}	
		}

		for(int i=1 ; i<n ; i++){
			newArr[i] = newArr[i-1] + newArr[i];
		}

		int retArr[] = new int[range.length];
		for(int i=0 ; i<range.length ; i++){
			int s = range[i][0];
			int e = range[i][1];

			if(s == 0) retArr[i] = newArr[e];
			else retArr[i] = newArr[e]-newArr[s-1];
		}
		
		for(int i=0 ; i<range.length ; i++){
			System.out.println(retArr[i]);
		}

		return retArr;
	}
	public static void main(String[]args){
		Solution s = new Solution();
		String[] str = {"b","rmivyakd","kddwnexxssssnvrske","vceguisunlxtldqenxiyfupvnsxdubcnaucpoi","nzwdiataxfkbikbtsjvcbjxtr","wlelgybcaakrxiutsmwnkuyanvcjczenuyaiy","eueryyiayq","bghegfwmwdoayakuzavnaucpur","ukorsxjfkdojcxgjxgmxbghno","pmgbiuzcwbsakwkyspeikpzhnyiqtqtfyephqhl","gsjdpelkbsruooeffnvjwtsidzw","ugeqzndjtogxjkmhkkczdpqzwcu","ppngtecadjsirj","rvfeoxunxaqezkrlr","adkxoxycpinlmcvmq","gfjhpxlzmokcmvhjcrbrpfakspscmju","rgmzhaj","ychktzwdhfuruhpvdjwfsqjhztshcxdey","yifrzmmyzvfk","mircixfzzobcficujgbj","d","pxcmwnqknyfkmafzbyajjildngccadudfziknos","dxmlikjoivggmyasaktllgmfhqpyznc","yqdbiiqexkemebyuitve"};
		int range[][] = {{5,21}};
		s.countVowels(str,range);
	}
}
