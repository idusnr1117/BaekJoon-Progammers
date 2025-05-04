import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        HashMap<String, int[]> hashMap = new HashMap<>();

        hashMap.put("black", new int[]{0, 1});
        hashMap.put("brown", new int[]{1, 10});
        hashMap.put("red", new int[]{2, 100});
        hashMap.put("orange", new int[]{3, 1000});
        hashMap.put("yellow", new int[]{4, 10000});
        hashMap.put("green", new int[]{5, 100000});
        hashMap.put("blue", new int[]{6, 1000000});
        hashMap.put("violet", new int[]{7, 10000000});
        hashMap.put("grey", new int[]{8, 100000000});
        hashMap.put("white", new int[]{9, 1000000000});

        String num = String.valueOf(hashMap.get(br.readLine())[0]) + hashMap.get(br.readLine())[0];

        System.out.println(Long.parseLong(num) * hashMap.get(br.readLine())[1]);

    }
}
