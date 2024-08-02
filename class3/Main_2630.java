import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_2630 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));



        br.close();
    }

    public static boolean isPerfect(boolean[][] elem) {
        boolean TF=false;
        
        for(int i = 0 ; i < elem.length ; i++ ) {
            for(int j = 0 ; j < elem[0].length ; j++) {
                if(elem[i][j] == true) TF=true;
                else TF = false;
            }
        }

        
        return TF;
    }


}
