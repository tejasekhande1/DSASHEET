import java.util.Scanner;
class Solution{
    public boolean rotateString(String s, String goal) {
        if(s.length() != goal.length()){
            return false;
        }else{
            String whole = s + s;
            if(whole.indexOf(goal)==-1)
                return false;
            else
                return true;
        }   
    }

    public static void main(String[]args){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter First String : ");
	String str1 = sc.nextLine();
	System.out.println("Enter Second String : ");
	String str2 = sc.nextLine();
	Solution obj = new Solution();
	System.out.println(obj.rotateString(str1,str2));
    }
}
