import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        List<Integer> arrayList = new ArrayList<>();

        for (int i = 0; i < N; i++)
        {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String work = st.nextToken();
            int x;

            switch (work)
            {
                case "add":
                    x = Integer.parseInt(st.nextToken());
                    if (!arrayList.contains(x))
                    {
                        arrayList.add(x);
                    }
                    break;
                case "remove":
                    x = Integer.parseInt(st.nextToken());
                    if (arrayList.contains(x))
                    {
                        arrayList.remove(Integer.valueOf(x));
                    }
                    break;
                case "check":
                    x = Integer.parseInt(st.nextToken());
                    if (arrayList.contains(x))
                    {
                        bw.append("1");
                        bw.newLine();
                    }
                    else
                    {
                        bw.append("0");
                        bw.newLine();
                    }
                    break;
                case "toggle":
                    x = Integer.parseInt(st.nextToken());
                    if (arrayList.contains(x))
                    {
                        arrayList.remove(Integer.valueOf(x));
                    }
                    else
                    {
                        arrayList.add(x);
                    }
                    break;
                case "all":
                    arrayList.clear();
                    for (int j = 1; j <= 20; j++)
                    {
                        arrayList.add(j);
                    }
                    break;
                case "empty":
                    arrayList.clear();
                    break;
            }
        }

        bw.flush();
        bw.close();

    }
}
