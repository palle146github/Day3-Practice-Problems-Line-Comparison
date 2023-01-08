import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Welcome to Line comparison problems");
        Scanner s = new Scanner(System.in);
        double ax1,ay1,ax2,ay2,x4,bx1,by1,bx2,by2;
        String lengthoftheline1, lengthoftheline2;
        System.out.println("Enter x1 Co-ordinate of first line");
        ax1 = s.nextDouble();
        System.out.println("Enter y1 Co-ordinate of first line");
        ay1 = s.nextDouble();
        System.out.println("Enter x2 Co-ordinate of first line");
        ax2 = s.nextDouble();
        System.out.println("Enter y2 Co-ordinate of first line");
        ay2 = s.nextDouble();
        lengthoftheline1 = String.valueOf(Math.sqrt( Math.pow(( ax2 - ax1), 2) + Math.pow(( ay2 - ay1 ), 2 )));

        System.out.println("Enter x1 Co-ordinate of second line");
        bx1 = s.nextDouble();
        System.out.println("Enter y1 Co-ordinate of second line");
        by1 = s.nextDouble();
        System.out.println("Enter x2 Co-ordinate of second line");
        bx2 = s.nextDouble();
        System.out.println("Enter y2 Co-ordinate of second line");
        by2 = s.nextDouble();
        lengthoftheline2 = String.valueOf(Math.sqrt( Math.pow(( bx2 - bx1), 2) + Math.pow(( by2 - by1 ), 2 )));

        System.out.println("Length of the first line is :" + lengthoftheline1);
        System.out.println();
        System.out.println("Length of the second line is :" + lengthoftheline2);
        System.out.println();
        System.out.println("Comparing the equality of the lines of based on end points");
        String diffinline1 =String.valueOf(Math.floor((bx2-ax2)));
        String diffinline2 =String.valueOf(Math.floor((by2-ay2)));
        double difference;
        if(lengthoftheline1.compareTo(lengthoftheline2) == 1) {
            difference= (Double.valueOf(lengthoftheline1))- (Double.valueOf(lengthoftheline2));
            System.out.println("Line 1 is longer than line 2 by " +difference);
        } else if(lengthoftheline1.compareTo(lengthoftheline2) == 0) {
            System.out.println("Both lines are equal");
        } else  {
            difference= (Double.valueOf(lengthoftheline2))- (Double.valueOf(lengthoftheline1));
            System.out.println("Line 2 is longer than line 1 by " +difference);
        }

    }
}