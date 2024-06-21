import java.util.Stack;
public class StackExample {
    public static void main(String[] args) {
        // create new stack
        Stack<Integer>stack=new Stack<>();
        //push element onto the stack
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        //pop elements from the stack
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
            
        }
    }
    
}
