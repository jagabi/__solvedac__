import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main_1018 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        boolean[][] arr_in = new boolean[N][M];
        String str;
        int[] counts = new int[(N-7)*(M-7)];

        //입력받기
        for(int i = 0 ; i < N ; i++) {
            str = br.readLine();
            for(int j = 0 ; j < M ; j++) {
                if(str.charAt(j) == 'W') arr_in[i][j] = true;
            }
        }

        boolean[][] arr;
        arr = new boolean[8][8];

        for(int k = 0 ; k < N-7 ; k++) {
            for(int l = 0 ; l < M-7 ; l++) {
                for(int i = 0 ; i < 8 ; i++) {
                    for(int j = 0 ; j < 8 ; j++) {
                        arr[i][j] = arr_in[i+k][j+l];
                    }
                }
                counts[l+(M-7)*k]=findmincount(arr); 
            }
        }
    
        Arrays.sort(counts);

        bw.write(Integer.toString(counts[0]));

        bw.flush();
        bw.close();
        br.close();

    }


    public static int findmincount(boolean[][] arr) {
        int count = 0 ;

        for(int i = 1 ; i < 7 ; i++) {
            for (int j = 1 ; j < 7 ; j++) {
                if(arr[i][j] == arr[i-1][j]) {arr[i-1][j] = !arr[i-1][j]; count++;}
                if(arr[i][j] == arr[i][j-1]) {arr[i][j-1] = !arr[i][j-1]; count++;}
                if(arr[i][j] == arr[i+1][j]) {arr[i+1][j] = !arr[i+1][j]; count++;}
                if(arr[i][j] == arr[i][j+1]) {arr[i][j+1] = !arr[i][j+1]; count++;}
            }
        }

        if(arr[0][0] == arr[1][0]) {arr[0][0] = !arr[0][0]; count++;}
        if(arr[0][7] == arr[1][7]) {arr[0][7] = !arr[0][7]; count++;}
        if(arr[7][0] == arr[7][1]) {arr[7][0] = !arr[7][0]; count++;}
        if(arr[7][7] == arr[7][6]) {arr[7][7] = !arr[7][7]; count++;}

        if(count > 64-count) count = 64-count;

        return count;
    }

}