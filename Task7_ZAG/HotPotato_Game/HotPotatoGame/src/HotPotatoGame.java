import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;


public class HotPotatoGame {
    public static String hotPotato(String[] children, int tosses){
        Queue<String> Queue = new LinkedList<>();

        while (Queue.size() > 1) {
            for (int i = 0; i < tosses-1; i++) {
                Queue.add(Queue.poll());
            }

            if (Queue.size() > 1) {
                Queue.poll();
            }

        }

        return Queue.poll();
    }

}
