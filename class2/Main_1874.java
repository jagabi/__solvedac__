import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class Main_1874 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        int start = 1;
        int v;

        Stack<Integer> stack = new Stack<>();
        
        while( N-- > 0 ) {
            v = Integer.parseInt(br.readLine());
            
            if ( v == start ) {
                stack.push(start);
                start++;
            }

            if ( v > start ) {
                for( int i = start ; i <= v ; i++) {
                    stack.push(i);
                    bw.write("+\n");
                    start++;
                }
            } 

            else if ( v != stack.peek()) {
                bw.write("NO");
                return;
            }

            stack.pop();
            bw.write("-\n");
        }


        bw.flush();
        br.close();
        bw.close();
    }
}
