import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());
        int[] likes = new int[101];
        ArrayList<Integer> frame = new ArrayList<>();

        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < M; i++)
        {
            int like = Integer.parseInt(st.nextToken());

            if (frame.contains(like))
            {
                likes[like]++;
            }
            else
            {
                if (frame.size() < N)
                {
                    frame.add(like);
                    likes[like]++;
                }
                else
                {
                    int min_like = Integer.MAX_VALUE;
                    for (int c : frame)
                    {
                        if (likes[c] < min_like)
                        {
                            min_like = likes[c];
                        }
                    }

                    int old = -1;
                    for (int j = 0; j < frame.size(); j++)
                    {
                        int c = frame.get(j);
                        if (likes[c] == min_like)
                        {
                            old = c;
                            break;
                        }
                    }

                    frame.remove((Integer) old);
                    likes[old] = 0;

                    frame.add(like);
                    likes[like]++;
                }
            }
        }

        Collections.sort(frame);
        for (int i = 0; i < frame.size() - 1; i++)
        {
            bw.write(frame.get(i) + " ");
        }
        bw.write(frame.get(frame.size() - 1) + "\n");
        bw.flush();
    }
}
