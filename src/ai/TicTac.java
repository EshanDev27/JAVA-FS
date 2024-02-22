//package ai;
//
//import java.util.Scanner;
//
//public class TicTac {
//    static boolean player1 = true;
//    static boolean player2 = false;
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter an Odd integer");
//        int n = sc.nextInt();
//        int[][] arr = mgicsqr(n);
//        for (int k = 0; k < n; k++) {
//            for (int l = 0; l < n; l++) {
//                System.out.print(arr[k][l] + " ");
//            }
//            System.out.println();
//        }
//    }
//
//    static int[][] mgicsqr(int n){
//        if(n%2 == 0) {
//            System.out.println("Please Enter an Odd integer");
//            return null;
//        }
//        int[][] arr = new int[n][n];
//        int i = 0, j = n/2;
//        arr[i][j] = 1;
//        for (int num = 2; num <= n * n; num++) {
//            if( i-1 < 0 || j+1 >= n){
//                if(i-1 < 0 && j + 1 >= n){ //Wrap Around
//                    i = i + 1;
//                }
//                else if(i-1 < 0){
//                    i = n -1;
//                    j = j+1;
//                }
//                else if(j+1 >= n){
//                    i = i - 1;
//                    j = 0;
//                }
//            }
//            else if(arr[i - 1][j + 1] == 0){
//                i = i - 1;
//                j = j + 1;
//            }
//            else if(arr[i - 1][j + 1] != 0){
//                i = i + 1;
//            }
//            arr[i][j] = num;
//        }
//        return arr;
//    }
//
//    static int[][] tictactoe(int[][] arr, int n){
//        int j,k;
//        Scanner sc = new Scanner(System.in);
//        for (int i = 0; i < n * n; i++) {
//            if(player1){
//                System.out.println("You may play your chance");
//                j = sc.nextInt();
//                k = sc.nextInt();
//                if(arr[j][k] == 0){
//                    arr[j][k] = "X";
//                }
//            }
//        }
//    }
//}