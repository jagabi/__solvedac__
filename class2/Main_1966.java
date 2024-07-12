import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main_1966 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int K = Integer.parseInt(br.readLine());
        int N, M, tmp;
        int[] arr;
        int num = 1;

        st = new StringTokenizer(br.readLine(), " ");
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        arr = new int[N];
        
        st = new StringTokenizer(br.readLine()," ");
        for(int i = 0 ; i < N ; i ++) arr[i] = Integer.parseInt(st.nextToken());
        
        while(true) {
            if(isMax(arr)==true && M == 0) {bw.write(Integer.toString(num)); break;}
            else if(isMax(arr)==true && M != 0) {
                for(int i = 0 ; i < N-num ; i++) {
                    arr[i] = arr[i+1];
                }
                arr[N-num]=0;
                M--;
                num++;
            }
            else if(isMax(arr)==false && M == 0) {
                tmp = arr[0];
                for(int i = 0 ; i < N-num ; i++) {
                    arr[i] = arr[i+1];
                }
                arr[N-num]=tmp;
                M--;
                num++;
            }
            else {

            }
        }

        



        bw.flush();
        bw.close();
        br.close();
    }

    public static boolean isMax(int arr[]) {
        int max;
        max = arr[0];

        for(int i = 0 ; i < arr.length ; i++) {
            if(arr[i] >= max) max = arr[i];
        }
        
        if(arr[0] == max) return true;
        else return false;
    }
}
