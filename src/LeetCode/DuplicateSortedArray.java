package LeetCode;

import java.util.ArrayList;

public class DuplicateSortedArray {
    public static void main(String[] args) {
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        removeDuplicates(nums);
    }

    static int removeDuplicates(int[] nums) {
        if(nums.length < 1){
            return 0;
        }
        ArrayList<Integer> temp = new ArrayList<>();
        int k, current = nums[0];
        temp.add(current);
        for (int i = 0; i < nums.length; i++) {
            if( current != nums[i] ){
                current = nums[i];
                temp.add(current);
            }
        }

        k = temp.size();
        return k;
    }
}