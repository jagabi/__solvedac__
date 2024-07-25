import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_9012 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        boolean isValid;
        int cnt;

        for(int i = 0 ; i < N ; i++){
            String in = br.readLine();
            isValid = true;
            cnt = 0;
            if(in.length()%2 == 1) {System.out.println("NO"); continue;}
            
            
            for(int j = 0 ; j < in.length() ; j++) {
                if(in.charAt(j) == '(') cnt++;
                if(in.charAt(j) == ')') cnt--;
                if(cnt<0) {
                    System.out.println("NO");
                    isValid=false;
                    break;
                }
            }
            if(!isValid) continue;
            if(cnt == 0) System.out.println("YES");
            else System.out.println("NO");
        }
        
        br.close();
    }   
}