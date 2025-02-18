package PracticeProblems.DPPThree;
import java.util.*;

public class Eventilln {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        //1st way if natural number & whole number both
        for(int i =1;i<=n;i++) {
            if (i%2==0)
                System.out.println(i);
        }
        // 2nd way if whole number
        for (int i =0;i<=n;i=i+2) {   
            System.out.println(i);
        }
        sc.close();
        
    }
}
