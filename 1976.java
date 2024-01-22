import java.io.IOException;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import java.util.StringTokenizer;

public class Main { //1976 그래프
    static int[] parent;
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());

        parent = new int[N+1];

        for (int i=0; i<=N; i++){
            parent[i] = i;
        }

        for (int i=1; i <= N; i++){
            st = new StringTokenizer(br.readLine());
            for (int j=1; j <= N; j++){
                if(Integer.parseInt(st.nextToken()) == 1){
                    union(i, j);
                }
            }
        }

        st = new StringTokenizer(br.readLine());
        int start = find(Integer.parseInt(st.nextToken()));
        for (int i=1; i<M; i++){
            int next = Integer.parseInt(st.nextToken());
            if(parent[start] != find(parent[next])){
                System.out.println("NO");
                System.exit(0);
            }
        }
        System.out.println("YES");
    }
    public static void union(int x, int y)
    {
        x = find(x);
        y = find(y);
        if (x < y) parent[y] = x;
        else parent[x] = y;
    }
    public static int find(int x)
    {
        if (parent[x] == x) return x;
        else return parent[x] = find(parent[x]);
    }

}