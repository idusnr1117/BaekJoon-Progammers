import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int B = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());
        int D = Integer.parseInt(st.nextToken());

        Integer[] burgers = new Integer[B];
        Integer[] sides = new Integer[C];
        Integer[] drinks = new Integer[D];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < B; i++)
            burgers[i] = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < C; i++)
            sides[i] = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < D; i++)
            drinks[i] = Integer.parseInt(st.nextToken());

        Arrays.sort(burgers, Collections.reverseOrder());
        Arrays.sort(sides, Collections.reverseOrder());
        Arrays.sort(drinks, Collections.reverseOrder());

        int total = 0;

        for (int price : burgers)
            total += price;

        for (int price : sides)
            total += price;

        for (int price : drinks)
            total += price;

        int setCount = Math.min(B, Math.min(C, D));
        int discountedTotal = 0;

        for (int i = 0; i < setCount; i++)
        {
            int setSum = burgers[i] + sides[i] + drinks[i];
            discountedTotal += (int)(setSum * 0.9);
        }

        for (int i = setCount; i < B; i++)
            discountedTotal += burgers[i];

        for (int i = setCount; i < C; i++)
            discountedTotal += sides[i];

        for (int i = setCount; i < D; i++)
            discountedTotal += drinks[i];

        System.out.println(total);
        System.out.println(discountedTotal);

    }
}
