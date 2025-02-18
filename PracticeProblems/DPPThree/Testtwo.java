package PracticeProblems.DPPThree;
import java.util.*;
public class Testtwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1 for the entry of marks or 0 to stop");
        int userinput = sc.nextInt();
        if (userinput==1){
            System.out.println("Enter marks out of 100:");
            int marks = sc.nextInt();
            if (marks>=90 && marks<=100){
                System.out.println("This is Good");
            }
            else if (marks >=60 && marks<=89 ){
                System.out.println("This is also Good");
            }
            else if (marks>=0 && marks<=59){
                System.out.println("This is Good as well");
            }
            else{
                System.out.println("Enter valid marks please");
            }
        }
        else if(userinput==0){
            System.out.println("thanks for using us");
        }
        else{
            System.out.println("Enter 0 / 1 only");
        }
        sc.close();
    }
}
