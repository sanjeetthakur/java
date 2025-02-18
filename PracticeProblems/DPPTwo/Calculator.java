package PracticeProblems.DPPTwo;
import java.util.*;
public class Calculator {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        // 1 -> Addition (a+b)
        // 2 -> Subtraction (a-b)
        // 3 -> Multiplication (a*b)
        // 4 -> Division (a/b)
        // 5 -> Remainder (a%b)

        int button = sc.nextInt();

        switch (button) {
            case 1: System.out.println("Addition"+(a+b));
            break;
            case 2: System.out.println("Subtraction"+(a-b));
            break;
            case 3: System.out.println("Multiplication"+(a*b));
            break;
            case 4: if (b==0){
                System.out.println("Invalid operation");
            }
            else{
                System.out.println("Division:"+(a/b));
            }
            break;
            case 5: if (b==0){
                System.out.println("Invalid operation");
            }
            else{
                System.out.println("Remainder:"+(a%b));
            }
            break;
            default: System.out.println("Invalid Operation");
        }
        sc.close();
    }
}
