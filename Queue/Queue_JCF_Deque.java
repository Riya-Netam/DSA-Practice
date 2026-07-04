import java.util.*;

public class Queue_JCF_Deque {
    public static void main(String[] args) {
        Queue<Integer> q= new ArrayDeque<>();
        q.add(5);
        q.add(6);
        q.add(7);

        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
    }
}
