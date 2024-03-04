import java.util.*;

public class Area {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter the length of the side of the hexagon.");
        double side = input.nextDouble();
        double tan_x = Math.tan(Math.toRadians(30));


        double area = 6 * Math.pow(side, 2) / (4 * tan_x);

        System.out.println("The area of the hexagon is " + area);
    }
}
