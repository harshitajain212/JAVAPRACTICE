import java.util.Scanner;
public class UserInput{
    public static void main(String args[]){
        Scanner obj = new Scanner(System.in);
        System.out.println(obj.nextLine());       /*print line */
        System.out.print(obj.nextInt());          /*print integer */
    }

}