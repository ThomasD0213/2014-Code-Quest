import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Prob01
{
    public static void main(String[] args) {
        try
        {
            Scanner scan = new Scanner(new File("Prob01.in.txt"));
            while( scan.hasNext() )
                System.out.println(scan.next());
        }
        catch( FileNotFoundException e )
        {
            e.printStackTrace();
        }
    }
}
