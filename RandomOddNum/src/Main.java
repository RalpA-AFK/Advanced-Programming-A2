import java.security.SecureRandom;

public class Main {
    public static void main(String[] args) {

        SecureRandom num = new SecureRandom();
        num.ints(50,1,999)
                .filter(n -> n % 2 != 0)    // only prints out odd nums (nums divisble by 2)
                .sorted()                       // sorts the numbers in asscending order
                .forEach(System.out::println);

    }
}