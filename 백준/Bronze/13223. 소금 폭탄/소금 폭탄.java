import java.io.*;

public class Main {
    
    public static void main(String[] args) throws IOException{
        
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        
        String start_time[] = bf.readLine().split(":");
        String end_time[] = bf.readLine().split(":");
        
        int hours[] = {Integer.parseInt(start_time[0]), Integer.parseInt(end_time[0])};
        int minutes[] = {Integer.parseInt(start_time[1]), Integer.parseInt(end_time[1])};
        int seconds[] = {Integer.parseInt(start_time[2]), Integer.parseInt(end_time[2])};
        
        int start =  hours[0] * 3600 + minutes[0] * 60 + seconds[0];
        int end = hours[1] * 3600 + minutes[1] * 60 + seconds[1];
        
        int result = end - start;
        
        if(result <= 0)
            result += 24 * 3600;
        
        int hour = result / 3600;
        int minute = result % 3600 / 60;
        int second = result % 60;

        
        System.out.printf("%02d:%02d:%02d", hour, minute, second);
        
    }
}
