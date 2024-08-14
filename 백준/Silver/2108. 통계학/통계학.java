import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        double avg = 0;

        ArrayList<Integer> arrayList = new ArrayList<>();

        for (int i = 0; i < N; i++)
        {
            int a = Integer.parseInt(br.readLine());
            avg += a;
            arrayList.add(a);
        }

        System.out.println(Math.round(avg / N));

        Collections.sort(arrayList);

        System.out.println(arrayList.get(N / 2));

        HashMap<Integer, Integer> freqMap = new HashMap<>();

        for (int num : arrayList)
        {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }

        int maxFreq = Collections.max(freqMap.values());

        List<Integer> modes = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : freqMap.entrySet())
        {
            if (entry.getValue() == maxFreq)
            {
                modes.add(entry.getKey());
            }
        }

        Collections.sort(modes);

        int result;
        if (modes.size() > 1)
        {
            result = modes.get(1);
        }
        else
        {
            result = modes.get(0);
        }

        System.out.println(result);
        
        System.out.println(Collections.max(arrayList) - Collections.min(arrayList));

    }
}
