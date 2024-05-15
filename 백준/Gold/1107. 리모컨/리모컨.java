import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());
        int cnt = 0;
        int channel = Math.abs(100 - N);

        ArrayList<Integer> broken_button = new ArrayList<>();

        if (M > 0)
        {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int i = 0; i < M; i++)
            {
                broken_button.add(Integer.parseInt(st.nextToken()));
            }
        }

        int min = Integer.MAX_VALUE;

        for(int i = 0; i <= 500000 + N; i++)
        {
            String str = String.valueOf(i);
            boolean check = true;
            for(int k = 0; k < str.length(); k++)
            {
                if(broken_button.contains(str.charAt(k) - '0'))
                {
                    check = false;
                    break;
                }
            }

            if(!check) continue;

            cnt = str.length() + Math.abs(i - N); // 해당 채널로 이동하는 데 필요한 버튼 클릭 횟수 + -만

            if(cnt < min)
            {
                min = cnt;
            }

        }

        if(min < channel) channel = min;

        System.out.println(channel);

    }
}
