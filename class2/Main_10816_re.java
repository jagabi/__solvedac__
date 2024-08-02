import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main_10816_re {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        
        

        int N = Integer.parseInt(br.readLine());
        int[] arr1 = new int[N];
        st = new StringTokenizer(br.readLine(), " ");
        for(int i = 0 ; i < N ; i++) arr1[i] = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(br.readLine());
        int[] arr2 = new int[M];
        st = new StringTokenizer(br.readLine(), " ");
        for(int i = 0 ; i < M ; i++) arr2[i] = Integer.parseInt(st.nextToken());
        //인풋 끝

        Arrays.sort(arr1);
        for(int i = 0 ; i < arr2.length ; i++) {
            System.out.print((highpoint(arr1, arr2[i])-lowpoint(arr1, arr2[i])) + " "); 
        }

        




        br.close();
    }


    public static int lowpoint(int[] arr, int k) {
        int low_index = 0;
        int high_index = arr.length;

        while(low_index < high_index){
            int mid = (high_index + low_index)/2;
            if( k <= arr[mid] ) high_index = mid;
            else low_index = mid+1;
        }

        return low_index;
    }
    public static int highpoint(int[] arr, int k) {
        int low_index = 0;
        int high_index = arr.length;
        int mid;

        while(low_index < high_index) {
            mid = (high_index + low_index)/2;
            if( k < arr[mid]) high_index = mid;
            else low_index = mid + 1;
        }

        return low_index;
    }
}
