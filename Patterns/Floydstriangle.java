package Patterns;

public class Floydstriangle {
    public static void main(String[] args) {
        int n=5;
        int num=1;
        //outer loop
        for(int i=1; i<=n; i++){
            //inner loop
            for(int j=1; j<=i; j++){
                System.out.print(num+" ");
                num++;
            }
            System.out.println();
        }

    }
}
