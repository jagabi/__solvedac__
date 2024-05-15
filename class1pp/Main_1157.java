import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main_1157 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String s = br.readLine();
        char[] char_arr = s.toCharArray();

        int[] char_n;
        char_n = new int[26];

        for(int i = 0 ; i < char_arr.length ; i++) {
            if (char_arr[i] < 97) {
                char_n[char_arr[i] - 65]++;
            }
            else char_n[char_arr[i] - 97]++;
        }

        int max = Integer.MIN_VALUE;
        int i = 0;
        boolean duplicate = false;
        while (i < char_n.length) {
            if ( char_n[i] > max ) {max = char_n[i]; duplicate = false;}
            else if ( char_n[i] == max) duplicate = true;
            i++;
        }

        char max_char = 'A';

        if(duplicate == true) bw.write("?");
        else{ 
            for ( i = 0 ; i < char_n.length ; i++) {
                if(char_n[i] == max) {
                    bw.write(max_char+i);
                    break;
                }
             }
         }

        bw.flush();
        bw.close();
        br.close();




    } 
}
