import java.io.*;
import java.util.*;

public class Main {

    static class Word implements Comparable<Word>
    {
        String str;
        int[] code;
        Word(String s, int[] c)
        {
            str = s;
            code = c;
        }

        public int compareTo(Word o)
        {
            int len = Math.min(code.length, o.code.length);
            for (int i = 0; i < len; i++)
                if (code[i] != o.code[i])
                    return code[i] - o.code[i];
            return code.length - o.code.length;
        }
    }
    static Map<String, Integer> rank = new HashMap<>();

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        String[] order =
        {
            "a","b","c","d","e","f","g","h","i","j","k","l",
            "lj","m","n","nj","o","p","r","s","t","u","v","z"
        };

        for (int i = 0; i < order.length;i++)
            rank.put(order[i], i);

        Word[] words = new Word[N];
        for (int i = 0; i < N; i++)
        {
            String s = br.readLine();
            words[i] = new Word(s, tokenize(s));
        }

        Arrays.sort(words);

        for (Word w : words)
            System.out.println(w.str);

    }

    static int[] tokenize(String s)
    {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < s.length();)
        {
            if (i + 1 < s.length())
            {
                String two = s.substring(i, i + 2);
                if (rank.containsKey(two))
                {
                    list.add(rank.get(two));
                    i += 2;
                    continue;
                }
            }
            list.add(rank.get(s.substring(i, i + 1)));
            i++;
        }
        return list.stream().mapToInt(x -> x).toArray();
    }

}
