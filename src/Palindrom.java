import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Palindrom {
    public static void main(String[] args) throws IOException {

        String palindrom;
        boolean check = true;
        BufferedReader br =  new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter your word please");
        palindrom= br.readLine().toLowerCase();

        for(int i=0; i< palindrom.length()/2; i++ ){
         if(palindrom.charAt(i) != palindrom.charAt(palindrom.length() - i -1)) {
          System.out.println("It is not a palindrome");
          check = false;
          break;

            }
        }
        if(check) {
            System.out.println(palindrom +  "is a palindrome");
        } else {
            System.out.println(palindrom + "It is not a palindrome");
        }





    }
}
