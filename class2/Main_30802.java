import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_30802 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int N,S,M,L,XL,XXL,XXXL,T,P;
        int x,y,z;

        N = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine(), " ");
        S = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        L = Integer.parseInt(st.nextToken());
        XL = Integer.parseInt(st.nextToken());
        XXL = Integer.parseInt(st.nextToken());
        XXXL = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine(), " ");
        T = Integer.parseInt(st.nextToken());
        P = Integer.parseInt(st.nextToken());

        x = size(S,T) + size(M,T) + size(L,T) + size(XL,T) + size(XXL,T) + size(XXXL,T);
        y = ((N>P)? (N/P) : 0);
        z = N%P;
        System.out.println(x);
        System.out.println(y + " " + z);
        br.close();
    }

    public static int size(int size, int T) {
        if(size == 0) return 0;
        else if(size%T != 0) return (size/T)+1;
        else return (size/T);
    }
}
