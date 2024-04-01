import java.util.Scanner;

public class Loops {
    public static void main(String args[]) {

        /*print no from 1 to 5 increment by 2 using for loop*/
        // for(int i=1;i<=5;i=i+2){
        //     System.out.println(i);
        // }


        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt(); // Store the input value in a different variable

        for (int num = 1; num <= n; num = num + 2) { // Use a different variable for loop control
            System.out.print(num + " ");
        }
    }
}
