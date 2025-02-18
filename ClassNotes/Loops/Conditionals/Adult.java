package ClassNotes.Conditionals;
import java.util.*;
public class Adult {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        if (age >=18){
            System.out.println("You are an adult and You can vote now");
        }
        else{
            System.out.println("You are not an adult yet");
        }
        sc.close();
    }
}
