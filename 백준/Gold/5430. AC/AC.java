import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        Deque<Integer> q = new LinkedList<>();

        int T = Integer.parseInt(bf.readLine());

        for (int i = 0; i < T; i++)
        {
            String result = "[";
            boolean is_error = false;
            boolean is_reverse = false;
            String str_def = bf.readLine();
            String defs[] = str_def.split("");
            int num = Integer.parseInt(bf.readLine());
            String st = bf.readLine();
            int last_index = st.indexOf("]");
            String arr[] = st.substring(1, last_index).split(",");

            if (q.isEmpty() && st.indexOf("]") == 1 && str_def.contains("D"))
            {
                System.out.println("error");
                continue;
            }
            else if (st.indexOf("]") == 1)
            {
                System.out.println("[]");
                continue;
            }

            for (String str : arr) q.offer(Integer.parseInt(str));

            for (String def : defs)
            {
                if (def.equals("R")) is_reverse = !is_reverse;
                else if (!q.isEmpty() && is_reverse && def.contains("D")) q.pollLast();
                else if (!q.isEmpty() && def.contains("D")) q.pollFirst();
                else
                {
                    is_error = true;
                    break;
                }
            }

            if (is_error) System.out.println("error");
            else if (is_reverse)
            {
                if (q.peekLast() != null)
                {
                    int size = q.size();
                    for (int j = 0; j < size - 1; j++) result += q.pollLast() + ",";
                    result += q.pollLast();
                    System.out.println(result + "]");
                }
                else System.out.println("[]");
            }
            else System.out.println(q.toString().replaceAll(" ",""));
            q.clear();

        }

    }
}

