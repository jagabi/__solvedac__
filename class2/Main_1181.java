import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class Main_1181 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        String[] arr = new String[N];

        for(int i = 0 ; i < N ; i++) arr[i] = br.readLine();

        
        Arrays.sort(arr,new Comparator<String>() {

            @Override
            public int compare(String s1, String s2) {
                if(s1.length() == s2.length()) {
                    return s1.compareTo(s2);
                }
                else {
                    return s1.length() - s2.length();
                }
            }

        }
        );


        for(int i = 0 ; i < arr.length ; i++) {
            for(int j = i+1 ; j < arr.length ; j++) {
                if(arr[i].equals(arr[j])) arr[j] = "0"; 
            }
        }

        for(int i = 0; i < arr.length ; i++) {
            if(arr[i] == "0") continue;
            System.out.println(arr[i]);
        }

        br.close();


        

    }
}
