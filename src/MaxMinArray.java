import java.util.Scanner;

public class MaxMinArray {
    public static void main(String[] args) {
    int[] arr = {3,2,5,3,6};
        System.out.println("------Old array------");
    for(int i : arr){
        System.out.print(i + " ");
    }
//        print_rev(arr);
    int[] new_arr = rev(arr);
        System.out.println("\n------New Array------");
    for(int j : new_arr){
        System.out.print(j + " ");
        }
    }

    static int maxi(int[] arr){
        int max = 0;
        for(int i : arr){
            if(i > max){
                max = i;
            }
        }
        return max;
    }

    static void print_rev(int[] arr){
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.println(arr[i]);
        }
    }

    static int[] rev(int[] arr){
        int[] new_arr = new int[arr.length];
        int j = 0;
        for (int i = arr.length - 1; i >= 0; i--) {
            new_arr[j] = arr[i];
            j++;
        }
        return new_arr;
    }
}