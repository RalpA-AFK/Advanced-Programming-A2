import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {

    static boolean isPrime(int n){
        if (n < 2){ return false;}
        for(int i =2; i<= Math.sqrt(n); i++){
            if(n % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        System.out.println("Below type a the number of primes you would like to see.");
        int limit = scnr.nextInt();
        IntStream.iterate(2, n -> n + 1)
                .filter(n -> isPrime(n))
                .limit(limit)
                .forEach(System.out::println);

    }
}