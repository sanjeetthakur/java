package PracticeProblems.DPPOne;
import java.util.*;
public class Circle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int radius =sc.nextInt();
        double area = Math.PI * radius * radius;
        System.out.println("The area of the circle with radius "+radius+" is "+area);
        sc.close();
    }
}
