import java.util.*;
import java.lang.*;
class Solution{

    public static String digitSum(String s, int k){
        int sum = 0;
        while(s.length() > k)
        {
            StringBuilder sb = new StringBuilder();
            for(int i = 0; i < s.length(); i++)
            {
                sum += s.charAt(i)-'0';
                if((i+1) % k == 0 || i == s.length()-1) // window of size k or reached end
                {
                    sb.append(sum);
                    sum = 0;
                }
            }
            s = sb.toString();
        }
        return s;
    }


	static int fSum = 0;
	public static void mySum(StringBuilder str,int count){
		int i = 0;
                while(i != str.length()){
                        int num = 0;
                        int cnt = 0;
                        while(Character.isDigit(str.charAt(i))){
                                cnt++;
                                num = num + Character.getNumericValue(str.charAt(i));
                                if(cnt == count){
                                        fSum = fSum*10 + num; 
                                        cnt = 0;
                                        num = 0;
                                        break;
                                }

				if(i == str.length()-1){
                                        fSum = fSum*10 + num;
					return;
                                }

				i++;
			}

			i++;

		}
	}

	public static void sumDigit(String str,int count){
		StringBuilder sb = new StringBuilder();
		int i = 0;
		while(i != str.length()){
			int num = 0;
			int cnt = 0;
			while(Character.isDigit(str.charAt(i))){			
				cnt++;
				num = num + Character.getNumericValue(str.charAt(i));		
				if(cnt == count){
					sb.append(num);
					cnt = 0;
					num = 0;
				       	break;
				}

				if(i == str.length()-1){
					sb.append(num);
					mySum(sb,count);
					return;
				}

				i++;
			}
		
			i++;
		}
	}

	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter String : ");
		String str = sc.nextLine();
	//	sumDigit(str,3);
	//	System.out.println("Sum : "+fSum);
			
		String s = digitSum(str,3);
		System.out.println(s);
	}
}
