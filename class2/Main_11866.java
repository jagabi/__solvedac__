import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main_11866 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int tmp,cnt = 1;
        Queue<Integer> q = new LinkedList<>();
        Queue<Integer> r = new LinkedList<>();

        for(int i = 1 ; i <= N ; i++) q.add(i);

        while(!q.isEmpty()) {
            tmp = q.peek();
            if(cnt%M != 0) {
                q.poll();
                q.add(tmp);
            }
            else r.add(q.poll());
            cnt++;
        }


        System.out.print("<"+r.poll());
        while (!r.isEmpty()) {
            System.out.print(", "+r.poll());
        }
        System.out.print(">");

        br.close();
    }
}
