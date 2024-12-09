import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<Integer> arrayList = new ArrayList<>();

        for (int i = 1; i <= 9993; i++)
            arrayList.add(i);

        for (int i = 1; i <= 9993; i++)
            arrayList.remove(Integer.valueOf(self(i)));

        for (int num : arrayList)
            System.out.println(num);

    }

    public static int self(int num)
    {
        String str = String.valueOf(num);

        for (char ch : str.toCharArray())
            num += Integer.parseInt(String.valueOf(ch));

        return num;
    }

}
