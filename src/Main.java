import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Welcome to Line comparison problems");
        Scanner s = new Scanner(System.in);
        double x1,y1,x2,y2, lengthoftheline;
        System.out.println("Enter x1 Co-ordinate");
        x1 = s.nextDouble();
        System.out.println("Enter y1 Co-ordinate");
        y1 = s.nextDouble();
        System.out.println("Enter x2 Co-ordinate");
        x2 = s.nextDouble();
        System.out.println("Enter y2 Co-ordinate");
        y2 = s.nextDouble();
        lengthoftheline = Math.sqrt( Math.pow(( x2 - x1), 2) + Math.pow(( y2 - y1 ), 2 ));
        System.out.println("Lenght of the line is ==> " + lengthoftheline);

    }
}