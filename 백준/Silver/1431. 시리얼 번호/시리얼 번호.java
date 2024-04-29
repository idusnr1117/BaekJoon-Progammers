import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

class Serials
{
    int sum;
    String serial;

    public Serials(String serial)
    {
        this.serial = serial;
        for (int i = 0; i < serial.length(); i++)
        {
            if (serial.charAt(i) >= '0' && serial.charAt(i) <= '9')
            {
                sum+= serial.charAt(i) - '0';
            }
        }
    }
}

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        Serials serials[] = new Serials[N];

        for (int i = 0; i < N; i++) serials[i] = new Serials(sc.next());

        Arrays.sort(serials, new Comparator<Serials>() {
            @Override
            public int compare(Serials o1, Serials o2) {
                if (o1.serial.length() != o2.serial.length())
                {
                    return o1.serial.length() - o2.serial.length();
                }
                if (o1.sum != o2.sum)
                {
                    return o1.sum - o2.sum;
                }
                return o1.serial.compareTo(o2.serial);
            }
        });

        for(Serials s : serials)
        {
            System.out.println(s.serial);
        }



    }
}
