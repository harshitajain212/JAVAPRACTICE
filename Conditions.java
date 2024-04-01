public class Conditions {
    public static void main(String args[]) {
        int sal = 10000;
        if (sal > 9000) {
            sal = sal + 3000;
        } else if (sal < 2000) {
            sal = sal + 11300;
        } else {
            sal = sal + 2000;
        }
        System.out.println(sal);
    }
}
