package ai;

import java.util.Scanner;

public class MgcSqr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n%2 == 0) {
            System.out.println("Please Enter an Odd integer");
            return;
        }
        int[][] arr = new int[n][n];
        int i = 0, j = n/2;
        arr[i][j] = 1;
        for (int num = 2; num <= n * n; num++) {
            if( i-1 < 0 || j+1 >= n){
                if(i-1 < 0 && j + 1 >= n){
                    i = i + 1;
                }
                else if(i-1 < 0){
                    i = n -1;
                    j = j+1;
                }
                else if(j+1 >= n){
                    i = i - 1;
                    j = 0;
                }
            }
            else if(arr[i - 1][j + 1] == 0){
                i = i - 1;
                j = j + 1;
            }
            else if(arr[i - 1][j + 1] != 0){
                i = i + 1;
            }
            arr[i][j] = num;
        }
        for (int k = 0; k < n; k++) {
            for (int l = 0; l < n; l++) {
                System.out.print(arr[k][l] + " ");
            }
            System.out.println();
        }
    }
}