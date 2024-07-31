import java.util.Stack;
public class PushStack{
    public static void main(String[] args) {
        Stack<Integer>st= new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        System.out.print(st);


        while(!st.isEmpty()){
            System.out.print(st.pop());
        }
    }
}