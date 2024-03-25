import java.io.*;

public class Main {
	
    public static void main(String[] args) throws IOException {
    	
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] sizes = br.readLine().split(" ");
        int n = Integer.parseInt(sizes[0]);
        int m = Integer.parseInt(sizes[1]);

        char[][] castle = new char[n][m];

        for (int i = 0; i < n; i++) 
        {
            String line = br.readLine();
            for (int j = 0; j < m; j++)
            {
                castle[i][j] = line.charAt(j);
            }
        }

        int row_cnt = 0;
        int col_cnt = 0;

        for (int i = 0; i < n; i++)
        {
            boolean need_guard = true;
            for (int j = 0; j < m; j++)
            {
                if (castle[i][j] == 'X')
                {
                    need_guard = false;
                    break;
                }
            }
            if (need_guard) row_cnt++;
        }

        for (int j = 0; j < m; j++)
        {
            boolean need_guard = true;
            for (int i = 0; i < n; i++)
            {
                if (castle[i][j] == 'X')
                {
                    need_guard = false;
                    break;
                }
            }
            if (need_guard)
            {
            	col_cnt++;
            }
        }

        System.out.println(Math.max(row_cnt, col_cnt));
    }
}
