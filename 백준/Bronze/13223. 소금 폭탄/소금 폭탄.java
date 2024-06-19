import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        String[] start_time = bf.readLine().split(":");
        String[] end_time = bf.readLine().split(":");

        int start_seconds = Integer.parseInt(start_time[0]) * 3600 + Integer.parseInt(start_time[1]) * 60 + Integer.parseInt(start_time[2]);
        int end_seconds = Integer.parseInt(end_time[0]) * 3600 + Integer.parseInt(end_time[1]) * 60 + Integer.parseInt(end_time[2]);

        int result_seconds = end_seconds - start_seconds;
        if (result_seconds <= 0) result_seconds += 86400;

        System.out.printf("%02d:%02d:%02d", result_seconds / 3600, (result_seconds % 3600) / 60, result_seconds % 60);
        
    }
}
