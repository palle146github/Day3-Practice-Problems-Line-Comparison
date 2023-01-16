import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("ax^2 + bx + c");
        double a, b, c;
        System.out.println("Enter constants of the quadratic expression");
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a value ==> ");
        a = s.nextInt();
        System.out.println("Enter b value ==> ");
        b = s.nextInt();
        System.out.println("Enter c value ==> ");
        c = s.nextInt();
        double root1, root2;
        double v = -4 * a * c;
        double delta = Math.pow( b, 2 ) - ( 4*a*c );
        double determinant = Math.sqrt((Math.pow( b, 2 )) - 4*a*c);
        if ( determinant >= 0) {
            root1 = ( -b + determinant ) / (2 * a);
            root2 = ( -b - determinant) / (2 * a);
            System.out.println("Roots of the x are ==>");
            System.out.println("Root one is " + root1);
            System.out.println("Root two is " + root2);
        }
        else{
            double rt = -5;
            System.out.println(Math.abs(rt));
            double ex1, ex2, ex3;
            ex1 = ( - b ) / (2 * a);
            ex2 = Math.abs(delta);
            ex3 = Math.sqrt(ex2) / (2 * a);
            System.out.println("Root one is " + ex1 + " + " + "i" + ex2);
            System.out.println("Root two is " + ex1 + " - " + "i" + ex2);
        }
    }
}