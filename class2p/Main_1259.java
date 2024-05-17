package __solvedac__.class2p;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main_1259 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String s;
        boolean TF = false;


        while(true) {
            s = br.readLine();
            if (s.equals("0")) break;
            TF = true;
            for (int i = 0 ; i < s.length()/2 ; i++) {
                if (s.charAt(i)!=s.charAt(s.length() - i - 1)) TF = false;
            }
            if (TF) bw.write("yes\n");
            else bw.write("no\n");

        }


        bw.flush();
        bw.close();
        br.close();
    }
}