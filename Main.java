import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//import java.nio.Buffer;
import java.util.ArrayList;

//import jdk.internal.org.jline.utils.InputStreamReader;

/**
 * Main
 */
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in)) ;
        int test = Integer.parseInt(read.readLine()) ;
        while(test-- > 0) {
            int n = Integer.parseInt(read.readLine()) ;
            String[] str = read.readLine().trim().split(" ") ;
            long[] arr = new long[n] ;
            for(int i=0; i<n; i++) {
                arr[i] = Long.parseLong(str[i]) ;
            }
            long sum = 0L ;
            long[] count = new long[n] ;
            //count[0] = 1L ;
            for(int i=0; i<n; i++) {
                count[i] = 1L ;
                for(int j=0; j<i; j++) {
                    if(arr[i] > arr[j]) {
                        count[i] = (count[i] + count[j]) % 1000000007 ;
                    }
                }
                sum = (sum + count[i]) % 1000000007;
            }

            System.out.println(sum); 
            

        }
    }
}