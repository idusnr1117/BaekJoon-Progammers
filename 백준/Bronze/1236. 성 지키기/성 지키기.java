import java.io.*;

public class Main {
    
    public static void main(String[] args) throws IOException {
    	
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        String[] sizes = bf.readLine().split(" ");
        int n = Integer.parseInt(sizes[0]);
        int m = Integer.parseInt(sizes[1]);

        char[][] map = new char[n][m];
		
		for (int i = 0; i < n; i++)
		{
			map[i] = bf.readLine().toCharArray();
		}

		int row = 0;
		int col = 0;
		
		for (int i = 0; i < n; i++)
		{
			boolean have_x = false;
			for (int j = 0; j < m; j++)
			{
				if (map[i][j] == 'X')
				{
					have_x = true;
					break;
				}
			}
			if (!have_x) row++;
		}
		
		for (int j = 0; j < m; j++)
		{
			boolean have_x = false;
			for (int i = 0; i < n; i++)
			{
				if (map[i][j] == 'X')
				{
					have_x = true;
					break;
				}
			}
			if (!have_x) col++;
		}
		
		System.out.println(Math.max(row, col));
    }
}
