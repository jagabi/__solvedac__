package __solvedac__.class3;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_11726 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int r,c=0;
        int result=0;
        
        for( r = n ; r >= c ; r -= 2) {
            result+=combi(r+1, c);
            c++;
        }

        for ( ; r >= 0 ; r -= 2) {
            result+=combi(c+1,r);
            c++;
        }

        System.out.println(result%10007);


        br.close();
    }



    public static int combi(int n, int r) {
        if (r == 0 || n == r) return 1;
        if (r > n - r) r = n - r;
    
        int result = 1;
        for (int i = 1; i <= r; i++) {
            result = result * (n - i + 1) / i;
        }
    
        return result;
    }    
}
