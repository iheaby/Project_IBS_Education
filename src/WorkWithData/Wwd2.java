package WorkWithData;

import java.util.Scanner;

public class Wwd2 {
    public static void main(String[] args) {
        String a, b = null;
        double c = 0;
        System.out.println("DO U LIKE JAVA?? TYPE IT HERE RIGHT NOW!!!: ");
        Scanner javalike = new Scanner((System.in));
        a = javalike.nextLine();
        if (a.contains("Java") && a.startsWith("I like") && a.endsWith("!!!")) {
            System.out.println("I'M CAPSING IT!!!: \n" + a.toUpperCase());
            b = a.replaceAll("a", "o");
            System.out.println("Java to Jovo: \n" + b.substring(7, 11));
        } else if (a.contains("Java") != true) {
            System.out.println("Wrong answer!!! No \"Java\" in your message!!!");

        } else if (a.startsWith("I like") != true) {
            System.out.println("No \"I like in\" your message!!!");
        } else if (a.endsWith("!!!") != true) {
            System.out.println("No \"!!!\" your message!!!");
//        else{
//            System.out.println("WRONG ANSWER!!!!!!");
//        }
        }
    }
}
