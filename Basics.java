import java.util.Stack;
public class Basics {

    public static void main(String args[]){
        Stack<Integer> st=new Stack<>();
        st.push(2);
        st.push(20);
        st.push(12);
        st.push(32);
        st.push(22);
        System.out.println(st);                          //[2, 20, 12, 32, 22]
        System.out.println(st.size());                   //5

        st.pop();
        System.out.println(st);                           //[2, 20, 12, 32]

        System.out.println(st.peek());                    //32

        System.out.println(st.isEmpty());            //false

    }
}