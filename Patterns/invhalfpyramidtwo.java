package Patterns;

public class invhalfpyramidtwo {
    public static void main(String[] args) {
        int n=4;
        //outer loop
        for (int i = 1; i <=4;i++){
            //inner loop
            //spaces
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            //patterns
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
