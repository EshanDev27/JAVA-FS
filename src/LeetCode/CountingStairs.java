package LeetCode;

public class CountingStairs {
    public static void main(String[] args) {
        System.out.println(climbstairs(45));
    }

    static int climbstairs(int n) {
        if(n==0 || n==1){
            return 1;
        }
        return climbstairs(n-1) + climbstairs(n-2);
    }
}