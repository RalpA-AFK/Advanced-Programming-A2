import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> intGrade = new ArrayList<Integer>();
        Scanner scnr = new Scanner(System.in);
        System.out.println("Type out the grades below (input -1 when done)");
        int input = scnr.nextInt();

        while(input != -1){
            intGrade.add(input);
            input = scnr.nextInt();
        }

        System.out.println("Converted Grades:");

        intGrade.stream()
                .map(g -> {
                    if(g >= 97){return g + " -> A+";}
                    else if(g >= 93){return g + " -> A";}
                    else if(g >= 90){return g + " -> A-";}
                    else if(g >= 87){return g + " -> B+";}
                    else if(g >= 83){return g + " -> B";}
                    else if(g >= 80){return g + " -> B-";}
                    else if(g >= 77){return g + " -> C+";}
                    else if(g >= 73){return g + " -> C";}
                    else if(g >= 70){return g + " -> C-";}
                    else if(g >= 67){return g + " -> D+";}
                    else if(g >= 63){return g + " -> D";}
                    else if(g >= 60){return g + " -> D-";}
                    else{return g + " -> F";}
                })
                .forEach(System.out::println);

    }

}
