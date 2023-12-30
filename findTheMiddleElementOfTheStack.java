import java.util.*;

public class findTheMiddleElementOfTheStack {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);

        s = deleteMid(s);

        System.out.println(s);
    }

    static Stack<Integer> deleteMid(Stack<Integer> s) {
        int middleIndex = s.size() / 2;
        Stack<Integer> tempStack = new Stack<>();

        for (int i = 0; i < s.size(); i++) {
            if (i != middleIndex) {
                tempStack.push(s.get(i));
            }
        }

        return tempStack;
    }
}
