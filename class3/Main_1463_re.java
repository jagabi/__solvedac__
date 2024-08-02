package __solvedac__.class3;

import java.util.Scanner;

public class Main_1463_re {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        in.close();
        int cnt = 0;


        while(N>1) {
            if(N%3==0) {
                N/=3;
                //System.out.println(N);
                cnt++;
            }
            else if(N%3==1) {
                N-=1;
                //System.out.println(N);
                cnt++;
            }
            else if(N%3==2){
                N-=1;
                cnt++;
                //System.out.println(N);
                N/=2;
                //System.out.println(N);
                cnt++;
            }
        }

        System.out.println(cnt);
    }


}
