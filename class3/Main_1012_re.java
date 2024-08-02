package __solvedac__.class3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_1012_re {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int T = Integer.parseInt(br.readLine());


        for(int a = 0 ; a < T ; a++) {
            st = new StringTokenizer(br.readLine(), " ");
            int M = Integer.parseInt(st.nextToken());
            int N = Integer.parseInt(st.nextToken());
            int K = Integer.parseInt(st.nextToken());
            int[] dr = {-1,1,0,0};
            int[] dc = {0,0,-1,1};
            int cnt = 0;

            int[][] arr = new int[N][M];
            int[][] tmp = new int[N][M];

            for(int i = 0 ; i < K ; i++) {
                st = new StringTokenizer(br.readLine(), " ");
                int m = Integer.parseInt(st.nextToken());
                int n = Integer.parseInt(st.nextToken());
                arr[n][m] = 1;
                tmp[n][m] = 1;
            }

            //입력

            for(int i = 0 ; i < arr.length ; i++) {
                for(int j = 0 ; j < arr[0].length ; j++) {
                    if(arr[i][j] == 1 && tmp[i][j] == 1) {
                        cnt++;
                        tmp[i][j] = 2;
                    }
                    if(arr[i][j] == 1) {
                        for(int d = 0 ; d < 4 ; d++) {
                            int nr = i + dr[d];
                            int nc = j + dc[d];
                            if( nr >= 0 && nr < arr.length && nc >= 0 && nc < arr[0].length) {
                                if(arr[nr][nc] == 1) tmp[nr][nc] = 2;
                            }
                        }
                    }
                }
            }

        














            //출력

           /* System.out.println("");

            for(int i = 0 ; i < N ; i++) {
                for(int j = 0 ; j < M ; j++) {
                    System.out.print(arr[i][j]+ " ");
                }
                System.out.println("");
            }

            System.out.println("");


            for(int i = 0 ; i < N ; i++) {
                for(int j = 0 ; j < M ; j++) {
                    System.out.print(tmp[i][j]+ " ");
                }
                System.out.println("");
            }
            
            System.out.println("");
            */
            System.out.println(cnt);
        }


        br.close();
    }
}
