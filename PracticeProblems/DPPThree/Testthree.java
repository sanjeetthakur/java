package PracticeProblems.DPPThree;
import java.util.*;
public class Testthree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int button = sc.nextInt();
        
        switch(button){
            case 1 :int marks = sc.nextInt();
            if (marks>=90 && marks<=100){
                System.out.println("this is good");
            }
            else if (marks>=60 && marks<=89){
                System.out.println("This is also good");
            }
            else if (marks>=0 && marks<=59){
                System.out.println("This is good as well");
            }
            else{
                System.out.println("enter valid  marks");
            }
            break;
        
            case 0 :System.out.println("Thanks for coming this way");
            break;
            default: System.out.println("Enter valid buttons");
        }
        sc.close();
    }
}
