
import java.io.IOException;
import java.io.InputStreamReader;


public class BufferedReader {
    public static void main(String[] args) throws IOException{
        java.io.BufferedReader br =new java.io.BufferedReader( new InputStreamReader(System.in));
        System.out.println("enter any Thing :  ");
        String Line=br.readLine();
        System.out.println(Line);

    }
}
