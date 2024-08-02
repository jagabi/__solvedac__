import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main_10809 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String s = br.readLine();
        char[] char_arr = s.toCharArray(); 
        char c = 'a';
        int i = 0;

        for( int j = 0 ; j < 26 ; j ++) {
            i=0;
            while(true) {
                if(i>=char_arr.length) {
                    bw.write("-1 ");
                    break;
                }

                if(c==char_arr[i]) {
                    bw.write(i+" ");
                    break;
                }
                i++;
            }
            c++;
        }

        bw.flush();
        bw.close();
    }
}
