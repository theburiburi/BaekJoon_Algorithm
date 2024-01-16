import java.io.IOException;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class check{
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        boolean checked[][] = new boolean[N][N];

        for(int i = 0; i < N; i++)
        {
            for (int j = 0; j < N; j++)
            {
                System.out.println(checked[i][j]);
            }
        }
    }
}
