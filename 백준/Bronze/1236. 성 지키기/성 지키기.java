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
            castle[i] = br.readLine().toCharArray();
        }

        int rowCnt = 0;
        int colCnt = 0;

        for (int i = 0; i < n; i++)
        {
            boolean needGuardRow = true;
            for (int j = 0; j < m; j++)
            {
                if (castle[i][j] == 'X')
                {
                    needGuardRow = false;
                    break;
                }
            }
            if (needGuardRow) rowCnt++;
        }

        for (int j = 0; j < m; j++)
        {
            boolean needGuardCol = true;
            for (int i = 0; i < n; i++)
            {
                if (castle[i][j] == 'X')
                {
                    needGuardCol = false;
                    break;
                }
            }
            
            if (needGuardCol)
            {
            	colCnt++;
            }
            
        }

        System.out.println(Math.max(rowCnt, colCnt));
    }
}
