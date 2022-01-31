import java.util.Stack;

public class JavaStack {
    public static void main(String[] args){
        Stack<String> stackBirds=new Stack<>();
        stackBirds.push("Parrot");
        stackBirds.push("pigeon");
        stackBirds.push("Sparrow");
        stackBirds.push("peacock");
        System.out.println(stackBirds);

        //get topmost item from stack
        System.out.println(stackBirds.peek());

        //remove top item from stack
        stackBirds.pop();
        System.out.println(stackBirds.peek());

    }
}
