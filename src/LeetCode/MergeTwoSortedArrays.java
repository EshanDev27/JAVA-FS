package LeetCode;

import java.util.Arrays;

public class MergeTwoSortedArrays {
    public static void main(String[] args) {
        int[] nums1 = {2,0}, nums2 = {1};
        int m = 1, n = 1;
        merge(nums1, m, nums2, n);
        System.out.println(Arrays.toString(nums1));
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n){
        if(m == 0 && n==1){
            nums1[0] = nums2[0];
            return;
        }
        int j = m + n - 1;
        while(m > 0 && n > 0){
            if(nums2[n - 1] > nums1[m - 1]){
                nums1[j] = nums2[n - 1];
                n--;
                j--;
            }else{
                nums1[j] = nums1[m - 1];
                m--;
                j--;
            }
        }

        if(n > 0){
            while(n > 0){
                nums1[j] = nums2[n - 1];
                n--;
                j--;
            }
        }

        if(m > 0){
            while(m > 0){
                nums1[j] = nums1[m - 1];
                m--;
                j--;
            }
        }
    }
}
