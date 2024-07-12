import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main_2908 {




    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int reversed_A = reversed(A);
        int reversed_B = reversed(B);


        if (reversed_A > reversed_B) bw.write(String.valueOf(reversed_A));
        else bw.write(String.valueOf(reversed_B));



        bw.flush();
        br.close();
        bw.close();
    }


    public static int reversed(int K) {
        int reversed = 0;

        while(K != 0) {
            reversed *= 10;
            reversed += (K%10);
            K /= 10;
        }
        
        return reversed;
    }

}
