import java.util.*;
 
class Solution {
    static int onesComplement(int n)
    {
        ArrayList<Integer> v = new ArrayList<Integer>();
        // convert to binary representation
        while (n != 0) {
            v.add(n % 2);
            n = n / 2;
        }
 
        Collections.reverse(v);
 
        // change 1's to 0 and 0's to 1
        for (int i = 0; i < v.size(); i++) {
            if (v.get(i) == 0)
                v.set(i, 1);
            else
                v.set(i, 0);
        }
        // convert back to number representation
        int two = 1;
        for (int i = v.size() - 1; i >= 0; i--) {
            n = n + v.get(i) * two;
            two = two * 2;
        }
        return n;
    }
 
    // Driver code
    public static void main(String[] args)
    {
        int n = 10;
 
        // Function call
        System.out.println(onesComplement(n));
    }
}
