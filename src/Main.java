import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //Coordinates coord = new Coordinates(input.nextDouble(), input.nextDouble());
        double x = input.nextDouble(), y = input.nextDouble();

//        if (coord.isInsideCircle() && coord.isInsideParable()) {
//            System.out.println("Green area");
//            return;
//        }
//        if (coord.isInsideCircle() && coord.isThirdQuarter()) {
//            System.out.println("Blue area");
//            return;
//        }
//        if (coord.isInsideCircle() && coord.isInsideAbs()) {
//            System.out.println("Red area");
//            return;
//        }
//        if (coord.isInsideCircle()) {
//            System.out.println("White area");
//        }
//        else {
//            System.out.println("Gray area");
//        }
        if ((x * x + y * y) < 1) {
            if (y > x * x) {
                System.out.println("Green area");
                return;
            }
            if ((y < 0)) {
                if ((x < 0)) {
                    System.out.println("Blue area");
                    return;
                }
                if ((x > 0) && (y > -x)) {
                    System.out.println("Red area");
                    return;
                }
            }
            System.out.println("White area");
        }
        else
            System.out.println("Gray area");
    }
}