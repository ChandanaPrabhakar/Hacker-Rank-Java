import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem4 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine().trim());

        bufferedReader.close();
         for( int index = 1; index <=10; index++ ){
             int product = N * index;
             System.out.println(N+" x "+index+" = "+product);
         }
    }
}
