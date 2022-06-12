public class MedianOfTwoSortedArrays {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n = nums1.length + nums2.length;
        int m = n/2;

        int newA[] = new int[n];
        int i =0;
        int n1 = 0;
        int n2 = 0;
        while(n1<nums1.length && n2 < nums2.length && i<=m){
            if(nums1[n1] < nums2[n2])
                newA[i++] = nums1[n1++];
            else
                newA[i++ ] = nums2[n2++];

        }

        while(n1<nums1.length && i<=m){
            newA[i++] = nums1[n1++];
        }

        while(n2<nums2.length && i<=m){
            newA[i++] = nums2[n2++];
        }
        if(n%2 != 0){
            return newA[m];
        }
        return ((newA[m-1]+newA[m])*1.0)/2;
    }
}
