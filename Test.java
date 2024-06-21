import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
    public class Test{
        public static void main(String[]args)
        throws IOException
        {
            //Enter data using BufferReader
            BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in));

            //Read data using readLine
            String name = reader.readLine();

            //printing the read line 
            System.out.println(name);
            }
    }
}
