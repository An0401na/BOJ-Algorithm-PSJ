import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    static int N;
    static int[][] dp;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());

        dp = new int[N][10];
        for (int i = 0; i < N; i++) {
            Arrays.fill(dp[i], -1);
        }


        int result = recur(0, 0);
        System.out.println(result);
    }

    private static int recur(int cnt, int num){
        if(cnt == N){
            return 1;
        }
        if(dp[cnt][num] != -1) {
            return dp[cnt][num];
        }

        int value = 0;
        if(cnt == 0){
            for (int i = 1; i <= 9 ; i++) {
                value += recur(cnt+1, i);
                value %= 1000000000;
            }
        }else{
            if(num == 0) {
                value += recur(cnt+1, num+1);
                value %= 1000000000;
            }
            else if (num == 9) {
                value += recur(cnt+1, num-1);
                value %= 1000000000;
            }
            else {
                value += recur(cnt+1, num+1);
                value %= 1000000000;
                value += recur(cnt+1, num-1);
                value %= 1000000000;
            }
        }
        return dp[cnt][num] = value;

    }


}