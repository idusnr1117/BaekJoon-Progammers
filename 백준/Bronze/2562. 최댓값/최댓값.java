import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        ArrayList<Integer> nums = new ArrayList<>();

        for (int i = 0; i < 9 ; i++)
        {
            nums.add(Integer.parseInt(br.readLine()));
        }

        bw.append(String.valueOf(Collections.max(nums))).append("\n");
        bw.append(String.valueOf(nums.indexOf(Collections.max(nums)) + 1));

        bw.flush();
        bw.close();

    }
}
