import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main_1929 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        int M = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());

        boolean[] primes = new boolean[N+1];

        primes[0]=primes[1]=true;

        for(int i = 0 ; i <= N ; i++) {
            if(primes[i]==true) continue;
            for(int j = 2*i ; j <= N ; j+=i) {
                primes[j]=true;
            }
        }

        for(int i = M ; i < primes.length ; i++) {
            if(primes[i] == false) bw.write(Integer.toString(i)+"\n");
        }



        bw.flush();
        bw.close();
        br.close();

    }
}
