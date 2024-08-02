import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_2606 {
    public static boolean[] linked;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());



        boolean[][] node = new boolean[N][N];
        linked = new boolean[N];

        for(int i = 0 ; i < node.length ; i++) node[i][i] = true;

        for(int k = 0 ; k < M ; k++) {
            st = new StringTokenizer(br.readLine()," ");

            int i = Integer.parseInt(st.nextToken());
            int j = Integer.parseInt(st.nextToken());

            node[i-1][j-1] = true;
            node[j-1][i-1] = true;
        }
        

        //for(int i = 0 ; i < node.length ; i++) {
        //    for(int j = 0 ; j < node[0].length ; j++) {
        //        if(node[i][j]) System.out.print("1" + " ");
        //        else System.out.print("0" + " ");
        //    }
        //    System.out.println();
        //}


        dfs(node,0);

        int cnt = 0;

        for(int i = 0 ; i < linked.length ; i++) if(linked[i]) cnt++;

        System.out.println(cnt-1);



        


        br.close();
    }

    public static void dfs(boolean[][] node, int n) {
        for(int i = 0 ; i < node[0].length ; i++) {
            if(node[n][i]==true && linked[i] == false) {
                linked[i] = true;
                //for(int k = 0 ; k < linked.length ; k++) System.out.print(linked[k]+" ");
                //System.out.println();
                dfs(node,i);
            }
        }
    }


}
