import java.io.IOException;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class check{
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        
        int N = Integer.parseInt(br.readLine());
        int arr[] = new int[N+1];

        for (int i = 3; i < 10; i++)
        {
            int temp = i;
            System.out.println(temp);

        }
    }
}
