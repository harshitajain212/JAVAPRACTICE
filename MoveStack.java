import java.util.*;
public class MoveStack {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        Stack<Integer> st=new Stack<>();
        int n;
        System.out.println("Print no of elements in stack");
        n=sc.nextInt();
        System.out.println("Print the numbers");
        
        for(int i=1;i<=n;i++){
            int x=sc.nextInt();
            st.push(x);


        }
        System.out.println(st);

        //revese order
        Stack<Integer>rt=new Stack<>();
        while(rt.size()>0){
            int x=st.peek();
            rt.push(x);
            st.pop();
        }
        System.out.println(rt);

        Stack<Integer>gt=new Stack<>();
        while(gt.size()>0){
            int x=st.peek();
            gt.push(x);
            st.pop();
        }
        System.out.println(rt);

    }
    
}
