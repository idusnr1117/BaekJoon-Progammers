import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String S = "X" + br.readLine() + "X";

        double happy = S.split("H").length + S.split("A").length + S.split("P").length + S.split("Y").length - 4;
        double sad = S.split("S").length + S.split("A").length + S.split("D").length - 3;

        if (happy == 0 && sad == 0)
            System.out.printf("%.2f\n", 50.0);
        else
            System.out.printf("%.2f\n", happy / (happy + sad) * 100);

    }
}
