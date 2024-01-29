package LeetCode;

import java.util.Arrays;

public class PlusOne {
    public static void main(String[] args) {
        int[] arr = {9};
        System.out.println(Arrays.toString(plusOne(arr)));
    }

    static int[] plusOne(int[] digits){
        if(digits[digits.length - 1] >= 0 && digits[digits.length - 1] <= 8){
            digits[digits.length - 1]++;
        }else{
            int i = digits.length - 1;
            while(i >= 0){
                if(digits[i] == 9){
                    digits[i] = 0;
                }else{
                    digits[i]++;
                    break;
                }
                i--;
            }
            if(i<0){
                int[] newarr = new int[digits.length + 1];
                newarr[0] = 1;
                System.arraycopy(digits, 0, newarr, 1, digits.length);
                return newarr;
            }else{
                int[] newarr = new int[digits.length];
                System.arraycopy(digits, 0, newarr, 0, digits.length);
                return newarr;
            }

        }
        return digits;
    }
}