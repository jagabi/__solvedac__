import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main_4153 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int[] arr = {1, 1, 1};

        while(true) {
            st = new StringTokenizer(br.readLine(), " ");
            for(int i = 0 ; i < 3 ; i++) arr[i] = Integer.parseInt(st.nextToken());
            Arrays.sort(arr);
            if(arr[0] == 0 && arr[1] == 0 && arr[2] == 0) break;
            if(isrec(arr)) System.out.println("right");
            else System.out.println("wrong");
            
        }


        br.close();
    }


    public static boolean isrec(int[] arr) {
        if(((arr[0]*arr[0])+(arr[1]*arr[1])) == arr[2]*arr[2]) return true;
        else return false;
    }

}
