import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the makeAnagram function below.
    static int makeAnagram(String a, String b) {
        int la[] = new int [26];
        int lb[] = new int [26];
           
        for(int i=0; i<a.length(); i++){
            la[a.charAt(i) -'a']++;
        }
        
        for (int w=0; w < b.length(); w++){
            lb[b.charAt(w)-'a']++;
        }
        
        int res=0;
        for (int k=0; k<26; k++){
            res+=Math.abs(la[k]-lb[k]);
        }
        
        return res;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String a = scanner.nextLine();

        String b = scanner.nextLine();

        int res = makeAnagram(a, b);

        bufferedWriter.write(String.valueOf(res));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
