class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int ret[] = new int[nums1.length + nums2.length];
        int i=0,j=0,k=0;
        while(i != nums1.length && j != nums2.length){
            if(nums1[i] > nums2[j]){
                ret[k] = nums2[j];
                j++;
            }else{
                ret[k] = nums1[i];
                i++;
            }
            k++;
        }

        while(i != nums1.length){
            ret[k] = nums1[i];
            i++;
            k++;
        }

        while(j != nums2.length){
            ret[k] = nums2[j];
            j++;
            k++;
        }

	for(int t=0 ; t<ret.length ; t++){
		System.out.print(" "+ret[t]+" ");
	}
	System.out.println();

        if(ret.length%2 == 1){
            return ret[(ret.length-1)/2];
        }else{
            int n = ret.length-1;
	    int a = ret[n/2];
	    System.out.println(a);
	    int b = ret[(n/2)+1];
	    System.out.println(b);
            return (double)(a+b)/2;
        }
    }
    public static void main(String[] args){
	Solution s = new Solution();
    	int nums1[] = {1,2};
	int nums2[] = {3,4};
	System.out.println(s.findMedianSortedArrays(nums1,nums2));
    }
}
