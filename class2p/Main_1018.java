package __solvedac__.class2p;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main_1018 {
    public static void main(String avrg[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String s = br.readLine();
        StringTokenizer st = new StringTokenizer(s, " ");
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        boolean[][] chess = new boolean[n][m];
        for ( int i = 0 ; i < n ; i++) {
            s = br.readLine();
            for (int j = 0 ; j < m ; j++) {
                if(s.charAt(j) == 'W') {
                    chess[i][j] = true;
                }
                else chess[i][j] = false;
            }
        }
        
        int[][] count_arr = new int[(n-7)][(m-7)];
        int count = 0;

        for (int a = 0 ; a < n-7 ; a++) {
            for (int b = 0 ; b < m-7 ; b++) {
                for (int i = a ; i < a+6 ; i++) {
                    if(chess[i][0] == true && chess[i+1][0] == true) {chess[i+1][0] = false; count++;}
                    else if (chess[i][0] == false && chess[i+1][0] == false) {chess[i+1][0] = true; count++;}
                    for (int j = b ; j < b+6 ; j++){
                        if (chess[i][j]==true && chess[i][j+1] ==true) {chess[i][j+1]=false; count++;}
                        else if (chess[i][j] == false && chess[i][j+1] == false) {chess[i][j+1]=true; count++;}
                    }
                }
                if(count > 64 - count) count = 64 - count; 
                count_arr[a][b] = count;
                count = 0;
            }
        }
        
        for ( int i = 0 ; i < count_arr.length ; i ++) {
            for ( int j = 0 ; j < count_arr.length ; j++) {
                bw.write(String.valueOf(count_arr[i][j])+"\n");
            }
        }


        bw.flush();
        bw.close();
        br.close();
    }
}