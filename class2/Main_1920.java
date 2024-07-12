import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main_1920 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
       
        StringTokenizer s = new StringTokenizer(br.readLine()," ");

        for(int i = 0 ; i < N ; i++) {
            arr[i] = Integer.parseInt(s.nextToken());
        }

        int M = Integer.parseInt(br.readLine());
        int[] arr2 = new int[M];

        s = new StringTokenizer(br.readLine(), " ");

        for(int i = 0 ; i < M ; i++) {
            arr2[i] = Integer.parseInt(s.nextToken());
        }

        boolean[] result = new boolean[M];

        isthere(arr, arr2, result);

        for(int i = 0 ; i < result.length ; i++) {
            if (result[i] == true) bw.write("1\n");
            else bw.write("0\n");
        }


        bw.flush();
        bw.close();
        br.close();
    }

    public static void isthere(int arr[],int arr2[],boolean result[]){
        for(int i = 0 ; i < arr2.length ; i++) {
            for(int j = 0 ; j < arr.length ; j++) {
                if(arr2[i] == arr[j]) {
                    result[i] = true;
                    break;
                }
                else result[i] = false; 
            }
        }


    }


}